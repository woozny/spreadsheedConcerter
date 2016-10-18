public class Spreadsheet {
    public String indexToColumn(int number) {
        return getCharFromNumber(number);
    }

    private String getCharFromNumber(int number) {
        return String.valueOf((char) (65 + number));
    }
}
