


public class NumberUtilities {

    public static String getRange(int stop) {
        String range="";
        String append;
        for(int i=0; i < stop; i++) {
            append = i + "";
            range+=append;
            append = "";
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range="";
        String append;
        for(int i=start; i < stop; i++) {
            append = i + "";
            range+=append;
            append = "";
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range="";
        String append;
        for(int i=start; i < stop; i+=step) {
            append = i + "";
            range+=append;
            append = "";
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String range="";
        String append;
        for(int i=start; i < stop; i++) {
            if((i%2)==0) {
                append = i + "";
                range+=append;
                append = "";    
            }
        }
        return range;
    }


    public static String getOddNumbers(int start, int stop) {
        String range="";
        String append;
        for(int i=start; i < stop; i++) {
            if((i%2)!=0) {
                append = i + "";
                range+=append;
                append = "";    
            }
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String range="";
        String append;
        for(int i=start; i <= stop; i++) {
            Long output = (long)(Math.pow(i, exponent));
            append = output + "";
            range+=append;
            append = "";    
        }
        return range;
    }
}
