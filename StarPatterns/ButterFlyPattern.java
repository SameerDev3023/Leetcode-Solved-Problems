package StarPatterns;

public class ButterFlyPattern {
    
    public static void main(String args[]){
        int Row = 5;
        int Col = 5;
        int num = 2;
        for(int i = 1;i<=Row;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            // print Spaces
            int Spaces = num * (Row-i+1);
            for(int k =2;k<Spaces;k++){
                System.out.print("  ");
            }

            for(int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // Print Second Half of Butter fly pattern

        for(int i = 1;i<=Row;i++){
            for(int j = Col;j>=i;j--){
                System.out.print(" *");
            }
            // print Spaces
            int Spaces = num * i;
            for(int k =2;k<Spaces;k++){
                System.out.print("  ");
            }

            for(int j = Col;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
/*
              Output
 
        *                 *
        * *             * *
        * * *         * * *
        * * * *     * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * *     * * * *
        * * *         * * *
        * *             * *
        *                 *
*/