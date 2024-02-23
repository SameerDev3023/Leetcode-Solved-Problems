package StarPatterns;

public class ILoveYouPattern {

    public static void main(String args[]) {
        for (int i = 1; i <= 11; i++) {
            
            for (int j = 1; j <= 11; j++) {
                if (i == 1 || i == 11 || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int k = 1; k <= 5; k++) {
                System.out.print(" ");
            }

            for (int l = 5; l > i; l--) {
                System.out.print("  ");
            }

            int stars = 2 * i;
            for (int m = 1; m <= stars; m++) {
                if (i <= 4) {
                    System.out.print(" *");
                }else{
                  
                    for(int k = 1;k<i-3;k++){
                        System.out.print("  ");
                    }
                    
                    for(int h = 10;h>=i-3;h--){
                            System.out.print("* ");
                    }
                    break;
                    //System.out.print("1");
                }
            }

            int spaces = 2 * (5 - i);
            for (int n = 1; n <= spaces; n++) {
                System.out.print("  ");
            }

            for (int m = 1; m <= stars; m++) {
                if (i <= 4) {
                    System.out.print(" *");

                    //System.out.print(" ");
                }else{
                   
                    for(int h = 10;h>=i-3;h--){
                        System.out.print("* ");
                    }
                    // For spaces.....
                    for(int h = 1;h<=i-3;h++){
                        System.out.print("  ");
                    }
                      //  System.out.print(" ");
                    
                    break;
                }
            }
            for (int n = 1; n <= 3; n++) {
                if(i<=4){
                    for(int k = 5;k>=i;k--){
                        System.out.print("  ");
                    }
                    break;
                }else{
                    System.out.print("");
                }
               
            } 

            for (int n = 1; n <= 20; n++) {
                if (i == 11 || n == 1 || n == 20) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            } 

            System.out.println();
        }
    }
}
/*
 

        ..........................OutPut....................... 

***********              * *                 * *          *                  *
     *                 * * * *             * * * *        *                  *
     *               * * * * * *         * * * * * *      *                  *
     *             * * * * * * * *     * * * * * * * *    *                  *
     *            * * * * * * * * * * * * * * * * * *     *                  *
     *              * * * * * * * * * * * * * * * *       *                  *
     *                * * * * * * * * * * * * * *         *                  *
     *                  * * * * * * * * * * * *           *                  *
     *                    * * * * * * * * * *             *                  *
     *                      * * * * * * * *               *                  *
***********                   * * * * * *                 ********************
 */