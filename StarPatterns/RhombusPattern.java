package StarPatterns;

public class RhombusPattern {
    public static void main(String args[]){


        int Row = 8;
        int Col = 8;
        for(int i = 1;i<=Row;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("  ");
            }   
            for(int k = 1;k<=Col;k++){
                System.out.print("*");
            } 
            System.out.println();
        }
       

    }
    
}

/*
  OutPut
  ********
    ********
      ********
        ********
          ********
            ********
              ********
                ********
 * 
 * 
*/