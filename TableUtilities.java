

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
     String table= "";
     for (int a = 1; a <= tableSize ; a++) {
         for (int b = 1; b <= tableSize; b++ ) {
                table+= String.format("%3d |", a*b);
         }
         table += "\n";
     }
     return table;
    }
}
