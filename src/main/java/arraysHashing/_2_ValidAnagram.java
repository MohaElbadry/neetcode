package arraysHashing;

import java.util.HashMap;


public class _2_ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> firstMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> secondMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            firstMap.put(s.charAt(i), firstMap.getOrDefault(s.charAt(i), 0) + 1);
            secondMap.put(t.charAt(i), secondMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        // for (int i = 0; i < t.length(); i++) {
        //     System.out.println(t.charAt(i));
        //     if (firstMap.get(t.charAt(i)) == null)
        //         return false;
        //     if (firstMap.get(t.charAt(i)) > 1) {
        //         firstMap.replace(t.charAt(i), firstMap.get(t.charAt(i)) - 1);
        //     } else {
        //         firstMap.remove(t.charAt(i));
        //     }
        // }
//        if (firstMap.equals(secondMap))
//            return true;
//        return false;
        return firstMap.equals(secondMap);
    }


}
