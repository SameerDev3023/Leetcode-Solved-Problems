package StarPatterns;

public class HollowHourGlassPattern {

    public static void main(String args[]) {
        int row = 6;
        int col = 6;

        // Upper half of the hourglass
        for (int i = 1; i <= row; i++) {
            // Print leading spaces
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }

            // Print stars or spaces based on condition
            for (int j = col; j >= i; j--) {
                if (i == 1  || j == col || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half of the hourglass
        for (int i = 1; i <= row; i++) {
            // Print leading spaces
            for (int j = 6; j >=i; j--) {
                System.out.print(" ");
            }

            // Print stars or spaces based on condition
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == row  || j == 1||j==i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
 
  Output

 * * * * * * 
  *       * 
   *     * 
    *   * 
     * * 
      * 
      * 
     * * 
    *   * 
   *     * 
  *       * 
 * * * * * * 
 


 */