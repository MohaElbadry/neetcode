package arraysHashing;

import java.util.ArrayList;
import java.util.List;

public class _6_EncodingDecoding {

}
class Solution {

    public static String encode(List<String> strs) {
        StringBuilder encStr = new StringBuilder();
        for (String str : strs) {
            encStr.append(str).append(',');
        }
        return encStr.toString();
    }

    public static List<String> decode(String str) {
        List<String> decArr = new ArrayList<>();
        int i=0;
        while (i < str.length() ) {
            StringBuilder decWord = new StringBuilder();
            while (str.charAt(i) !=','){
                decWord.append(str.charAt(i));
                i++;
            }
            i++;
            decArr.add(decWord.toString());
        }
        return decArr;
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("abc");
        strs.add("BBB");
        strs.add("CCC");
        strs.add("DDD");
        Solution.encode(strs);
        System.out.println( Solution.decode("abc,BBB,CCC,DDD,"));
    }
}
