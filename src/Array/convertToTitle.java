package Array;

public class convertToTitle {

    public String convertToTitle(int columnNumber) {
        if (columnNumber <= 0) return "";
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            stringBuilder.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return stringBuilder.reverse().toString();
    }
}
