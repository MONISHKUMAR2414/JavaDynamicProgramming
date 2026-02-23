class Solution {
    public boolean hasAllCodes(String s, int k) {

    
         int n = s.length();
        if (n < k) return false;

        HashSet<String> set = new HashSet<>();

        // Slide window of size k
        for (int i = 0; i <= n - k; i++) {
            String sub = s.substring(i, i + k);
            set.add(sub);
        }

        // Check if total unique substrings == 2^k
        return set.size() == (1 << k);
}

}