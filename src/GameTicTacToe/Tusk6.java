package GameTicTacToe;

public class Tusk6 {
    public static void main(String[] args) {

        System.out.println(parseMove("3 -5        1"));
    }

    public static class Cell {
        public int row;
        public int col;
    }

    public static Cell parseMove(String line) {

        char[] arrayCr = line.toCharArray();

        if (arrayCr.length < 3) {
            return null;
        }

        Cell cell = new Cell();
        int counterInts = 0;

        for (int i = 0; i < arrayCr.length; i++) {
            if (arrayCr[i] != 32 && arrayCr[i] < 48 || arrayCr[i] > 52) {
                return null;
            }
            if (arrayCr[i] > 48 && arrayCr[i] < 52) {
                counterInts++;
                cell.col = Character.getNumericValue(arrayCr[i]);
            }
            if (i == arrayCr.length - 1 && counterInts != 2) {
                return null;
            }
        }
        for (int i = arrayCr.length - 1; i >= 0; i--) {


            if (arrayCr[i] > 48 && arrayCr[i] < 52) {
                cell.row = Character.getNumericValue(arrayCr[i]);
            }
        }

        return cell;
    }
}
