class Solution {
     boolean allZero(HashMap<Character, Integer> map) {
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
 

    public List<Integer> findAnagrams(String txt, String pat) {
         int count = 0;
        int n = pat.length();

        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency of pattern
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        ArrayList<Integer>ans=new ArrayList<>();

        for (int right = 0; right < txt.length(); right++) {

            // Add right character to window
            char ch = txt.charAt(right);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }

            // Window size = n
            if (right - left + 1 == n) {

                // Check if current window is an anagram
                if (allZero(map)) {
                    ans.add(left);
                }

                // Remove left character
                char leftChar = txt.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                }

                left++;
            }
        }

      return ans;  
    }
}