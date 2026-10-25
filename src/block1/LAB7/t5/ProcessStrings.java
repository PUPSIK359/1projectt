package block1.LAB7.t5;

public class ProcessStrings implements StringOperations {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String oddPositions(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i = i + 2) {
            result = result + s.charAt(i);
        }
        return result;
    }

    @Override
    public String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
}
