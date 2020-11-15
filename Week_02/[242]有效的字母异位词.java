class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        for (int i = 0; i < cs.length; i ++) {
            Integer scount = map.get(cs[i]);
            if (scount != null) {
                map.put(cs[i], ++ scount);
            } else {
                map.put(cs[i], 1);
            }
            Integer tcount = map.get(ts[i]);
            if (tcount != null) {
                map.put(ts[i], -- tcount);
            } else {
                map.put(ts[i], -1);
            }
        }
        for (Integer count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
