package block2.LAB13.t3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;    // корпус
    private String apartment;

    private void fill(String[] parts) {
        String[] f = new String[7];
        for (int i = 0; i < 7; i++) {
            if (i < parts.length) {
                f[i] = parts[i].trim();      // убираем пробелы в начале и конце
            } else {
                f[i] = "";
            }
        }
        country = f[0];
        region = f[1];
        city = f[2];
        street = f[3];
        house = f[4];
        building = f[5];
        apartment = f[6];
    }

    public void parseBySplit(String address) {
        fill(address.split(",", -1));
    }

    public void parseByTokenizer(String address) {
        StringTokenizer st = new StringTokenizer(address, ",.;", true);
        String[] parts = new String[7];
        for (int i = 0; i < 7; i++) {
            parts[i] = "";
        }
        int index = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals(",") || token.equals(".") || token.equals(";")) {
                index++;
            } else if (index < 7) {
                parts[index] = token;
            }
        }
        fill(parts);
    }

    @Override
    public String toString() {
        return "Address{страна='" + country + "', регион='" + region + "', город='" + city
                + "', улица='" + street + "', дом='" + house + "', корпус='" + building
                + "', квартира='" + apartment + "'}";
    }
}
