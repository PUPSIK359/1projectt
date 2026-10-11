package LAB4.t1;

public enum Season {
    WINTER(-10),
    SPRING(8),
    SUMMER(25) {

        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(7);

    private final int avgTemp;

    private Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
