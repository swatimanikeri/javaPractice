import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            // Check if the mapping s -> t is consistent
            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) return false;
            } else {
                mapST.put(chS, chT);
            }

            // Check if the mapping t -> s is consistent
            if (mapTS.containsKey(chT)) {
                if (mapTS.get(chT) != chS) return false;
            } else {
                mapTS.put(chT, chS);
            }
        }

        return true;
    }
}
