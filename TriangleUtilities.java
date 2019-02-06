 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String outcome="";
        for(int i=0; i < numberOfStars; i++) {
            String append = "*";
            outcome+=append;
            append = "";
        }
        return outcome;
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for (int i=0; i<numberOfRows; i++) {
            for (int j=0; j <= i; j++) {
            triangle.append("*");    
            }
            triangle.append("\n");
            System.out.println(triangle);
        }
        return triangle.toString();
    }


    public static String getSmallTriangle() {
        StringBuilder triangle = new StringBuilder();
        for (int i=0; i<4; i++) {
            for (int j=0; j <= i; j++) {
            triangle.append("*");    
            }
            triangle.append("\n");
            System.out.println(triangle);
        }
        return triangle.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder triangle = new StringBuilder();
        for (int i=0; i<9; i++) {
            // moves the rows 
            for (int j=0; j <= i; j++) {
            // moves the columns which is based the number of i
            triangle.append("*");    
            }
            triangle.append("\n");
            System.out.println(triangle);
        }
        return triangle.toString();
    }
}
