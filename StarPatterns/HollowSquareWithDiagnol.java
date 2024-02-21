package StarPatterns;

public class HollowSquareWithDiagnol {
    
    public static void main(String args[]){

        int Row = 8 ;
        int Col = 8;

        for(int  i =1;i<=Row;i++){
            for(int  j =1;j<=Col;j++){
            if(i==1 ||i==Row || j==1 || j==Col || i==j||j==Col-i+1){
                System.out.print(" * ");
            }else{
                System.out.print("   ");
            }
    
            }
            System.out.println();
        }
        
    }
}
/*
 
.........Output........


 *  *  *  *  *  *  *  * 
 *  *              *  * 
 *     *        *     * 
 *        *  *        * 
 *        *  *        * 
 *     *        *     * 
 *  *              *  * 
 *  *  *  *  *  *  *  * 
 
*/