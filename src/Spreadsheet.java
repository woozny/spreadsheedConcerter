public class Spreadsheet {

    public static final int CHARACTER_A = 65;
    public static final int SCOPE = 25;

    public String indexToColumn(int number) {
        return numberToColumnConverter(number);
    }

    private String numberToColumnConverter(int number) {
        if(number <= SCOPE) {
            return convertNumberToString(number);
        } else {
            String fullColumn;
            int rota = number/SCOPE;
            int modulo = number % SCOPE;

            fullColumn = convertNumberToString(rota -1);
            fullColumn += convertNumberToString(modulo -1);
            return fullColumn;
        }
    }

    private String convertNumberToString(int i) {
        if (isInSupportedScope(i)) {
            return String.valueOf((char) (CHARACTER_A + i));
        }
        throw new IllegalArgumentException(i + " is out of supported scope");
    }

    private boolean isInSupportedScope(int i) {
        return i >= 0 && i<= SCOPE;
    }
}
