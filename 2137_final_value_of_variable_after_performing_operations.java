class Solution {
    public int finalValueAfterOperations(String[] operations) {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("--X", -1);
        hs.put("X--", -1);
        hs.put("X++", 1);
        hs.put("++X", 1);
        int x = 0 ;
        for(int i = 0 ; i < operations.length; i++){
            int value = hs.get(operations[i]); 
            x = x + value;
        }
        return x;
    }
}