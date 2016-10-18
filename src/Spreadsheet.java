public class Spreadsheet {

    public static final int CHARACTER_A = 65;
    public static final int SCOPE = 26;

    public String indexToColumn(int number) {
        return numberToColumnConverter(number);
    }

    private String numberToColumnConverter(int number) {
        String fullColumn = "";
        if (number >= SCOPE) {

            int rota = number / SCOPE;
            int modulo = number % SCOPE;

            fullColumn += convertNumberToString(rota - 1);
            fullColumn += convertNumberToString(modulo);
        } else {
            fullColumn += convertNumberToString(number);
        }
        return fullColumn;
    }

    private String convertNumberToString(int i) {
        return String.valueOf((char) (CHARACTER_A + i));
    }

}
