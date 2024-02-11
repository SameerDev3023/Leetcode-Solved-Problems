
// Question2 :- Write a code for selection sort

public class Question2 {
    public static void main(String args[]){
      int[] Numbers = {7,6,3,5,13,42,41,21,45,1};
      for(int i = 0;i<Numbers.length;i++){
        int smallest = i;
        for(int j = i+1; j<Numbers.length;j++){
            if(Numbers[smallest]>Numbers[j]){
                smallest =j;
               
            }
        }
        int temp = Numbers[smallest];
        Numbers[smallest]= Numbers[i];
        Numbers[i]=temp;
        System.out.println(Numbers[i]);
      }
     
     }
}
