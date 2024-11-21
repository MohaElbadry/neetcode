package arraysHashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _5_TopKFrequenTelements {

        public int[] topKFrequent(int[] nums, int k) {
            int[] freq=new int[k];
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int num : nums){
                int fk = map.getOrDefault(num, 0);
                fk++;
                map.put(num, fk);
            }
            System.out.println(map);
            int i = 0;
            while(i <k){
                int maxValue = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
                freq[i]=maxValue;
                map.remove(maxValue);
                k++;
            }
            return freq;
        }



    public static void main(String[] args) {

    }
}
