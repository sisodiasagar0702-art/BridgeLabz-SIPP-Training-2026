import java.util.HashMap;
import java.util.Map;

public class CountFreq2usingHashMap {
      public static void main(String[] args){
        int arr [] = {1,22,31,22,1,5};
        
        Map<Integer  ,Integer> count = new HashMap<>();

        for(int a : arr){
            count.put(a, count.getOrDefault(a, 0) + 1);
        }

        for(int a : count.keySet()){
            System.out.println(a + "ki freq hai::::"  + count.get(a));
        }
      
    }
    
}
