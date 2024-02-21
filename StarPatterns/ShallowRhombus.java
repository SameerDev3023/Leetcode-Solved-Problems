package StarPatterns;

public class ShallowRhombus {

    public static void main(String args[]){
        int Row  = 6;
        int Col = 6;
        int num = 2;
        for(int i = 1;i<=Row;i++){
            for(int j = Col;j>=i;j--){
                System.out.print("*");
            }
            // print Spaces..
            int Spaces = num*i;
            for(int k = 1;k<Spaces;k++ ){
                System.out.print(" ");
            }
            for(int j = Col;j>=i;j--){
                System.out.print("*");
            }

            // Second half of the shallow rhombus..

            
            System.out.println();
        }
    for(int i = 1;i<=Row;i++){
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        // print Spaces..
        int Spaces = num * (Row - i+1);
            for (int k = 1; k <Spaces; k++) {
                System.out.print(" ");
            }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }
    }
    
}
