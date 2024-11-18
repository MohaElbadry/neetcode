package arraysHashing;

import org.example.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class arraysHashing {
        public static String getBit(String str) {
            int [] arr = new int[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            return String.join(".", Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new));
        }
        public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> firstMap = new HashMap<String, List<String>>();
            for (String str : strs) {
                String key = arraysHashing.getBit(str);
                System.out.println(key);
                if (firstMap.containsKey(key)) {
                    List<String> list = firstMap.get(key);
                    list.add(str);
                } else {
                    List<String> newList = new ArrayList<String>() {
                    };
                    newList.add(str);
                    firstMap.put(key, newList);
                }
            }
            return new ArrayList<>(firstMap.values());
        }

    public static void main(String[] args) {
        char c = 'b';
        String[] strings = {"bdddddddddd","bbbbbbbbbbc"};

        System.out.println( arraysHashing.groupAnagrams(strings) );
        System.out.println( arraysHashing.getBit("bbbbbbbbbbc") );
        System.out.println( arraysHashing.getBit("bdddddddddd") );
        System.out.println( arraysHashing.getBit("c") );

        ;
    }
}
