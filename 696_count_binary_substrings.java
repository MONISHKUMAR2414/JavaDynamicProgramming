class Solution {
    public int countBinarySubstrings(String s) {
        int pr = 0 ;
        int cr = 1; 
        int ans = 0 ; 
        for(int i = 1 ; i < s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cr++;
            }
            else{
                ans += Math.min(pr,cr);
                pr = cr ; 
                cr = 1; 

            }
        }
        ans += Math.min(pr,cr);
        return ans;
    }
}