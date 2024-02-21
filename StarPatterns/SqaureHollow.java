package StarPatterns;

public class SqaureHollow {

   public static void main(String args[]){

    int Row = 12;
    int Col = 12;

    for(int  i =1;i<=Row;i++){
        for(int  j =1;j<=Col;j++){
        if(i==1 ||i==Row || j==1 || j==Col){
            System.out.print(" *");
        }else{
            System.out.print("  ");
        }

        }
        System.out.println();
    }
   }
    
}
