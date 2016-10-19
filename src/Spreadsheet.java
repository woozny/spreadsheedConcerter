public class Spreadsheet {

    public static final int CHARACTER_A = 65;
    public static final int SCOPE = 26;

    public String indexToColumn(int number) {
        return numberToColumnConverter(number);
    }

    private String numberToColumnConverter(int number) {
        StringBuilder fullColumn = new StringBuilder();

        do {
            fullColumn.append(convertNumberToString(number));
            number = number / SCOPE - 1;
        } while (number >= 0);

        return fullColumn.reverse().toString();
    }

    private String convertNumberToString(int i) {
        return String.valueOf((char) (i % SCOPE + CHARACTER_A));
    }

    public int columnToIndex(String column) {
        int counter = convertNumberToChar(0, column);

        for (int index = 1; index < column.length(); index++) {
            counter = (counter + 1) * SCOPE;
            counter += convertNumberToChar(index, column);
        }
        return counter;
    }

    private int convertNumberToChar(int index, String column) {
        return column.charAt(index) - CHARACTER_A;
    }
}
