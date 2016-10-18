public class Spreadsheet {

    public static final int CHARACTER_A = 65;
    public static final int SCOPE = 25;

    public String indexToColumn(int number) {
        return getCharFromNumber(number);
    }

    private String getCharFromNumber(int number) {
        if(number <= SCOPE) {
            return String.valueOf((char) (CHARACTER_A + number));
        } else {
            String fullColumn = "";
            int rota = number/SCOPE;
            int modulo = number % SCOPE;

            fullColumn = String.valueOf((char) (CHARACTER_A + rota -1));
            fullColumn += String.valueOf((char) (CHARACTER_A + modulo -1));
            return fullColumn;
        }
    }
}
