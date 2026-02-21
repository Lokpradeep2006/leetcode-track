import java.util.Hashtable;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashtable.put(c, hashtable.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);

            if (!hashtable.containsKey(c)) return false;

            hashtable.put(c, hashtable.get(c) - 1);

            if (hashtable.get(c) == 0) {
                hashtable.remove(c);
            }
        }

        return hashtable.isEmpty();
    }
}
