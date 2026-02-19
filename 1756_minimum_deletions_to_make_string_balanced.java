class Solution {
    public int minimumDeletions(String s) {
      int bcount = 0 ; 
      int delecount = 0 ;
      for(char c: s.toCharArray()){
        if(c =='b') bcount++;
        else{
           delecount = Math.min(delecount +1, bcount);
        }
      }
      return delecount;
    }
}