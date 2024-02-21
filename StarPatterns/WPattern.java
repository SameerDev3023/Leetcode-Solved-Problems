package StarPatterns;

public class WPattern {
    public static void main(String args[]){
        int Row = 8;
        int Col = 8;

        for(int  i=1;i<=Row;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = Col; k>i;k--){
                System.out.print(" ");
            }
            for(int l = Col; l>=i;l--){
                System.out.print("*");
            }
            for(int m = 2; m<=i;m++){
                System.out.print("  ");
            }
            for(int n = Col; n>=i;n--){
                System.out.print("*");
            }
            for(int o = Col; o>i;o--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*


................... Output...............

        *       ****************       *
        **      *******  *******      **
        ***     ******    ******     ***
        ****    *****      *****    ****
        *****   ****        ****   *****
        ******  ***          ***  ******
        ******* **            ** *******
        *********              *********
 */