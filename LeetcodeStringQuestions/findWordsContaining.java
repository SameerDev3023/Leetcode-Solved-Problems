package LeetcodeStringQuestions;

import java.util.ArrayList;
import java.util.List;

public class findWordsContaining {
   public List<Integer> findWordsContainings(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
            for(int i = 0;i<words.length;i++){
               if(words[i].indexOf(x)!= -1){
                indices.add(i);
               }
            }
        return indices;
    }


    public static void main(String args[]){
        findWordsContaining sw = new findWordsContaining();
        String[] ch = {"leet","code"};
        char c = 'e';
        List<Integer> result = sw.findWordsContainings(ch,c);
        System.out.println(result);
    }
}
