class Solution {
    public String toGoatLatin(String sentence) {
       String st[] = sentence.split(" ");
       StringBuilder sb = new StringBuilder();
        int count =1;

       for(int i =0 ; i <st.length ; i++ ){
        String s = st[i];
        char first = s.charAt(0);
       

        if (first == 'a' || first == 'e' || first == 'i' || 
            first == 'o' || first == 'u'||first == 'A' || first == 'E' || first=='I' || first == 'O' || first == 'U'){
                s = s+ "ma";
                sb.append(s);
                for(int j = 0 ; j < count ;j++) {
                    sb.append("a");
                }
                sb.append(" ");
                count++;

            }

            else{
                for(int k =1 ; k< s.length() ; k++){
                    sb.append(s.charAt(k));
                }
                sb.append(first);
                sb.append("ma");
                for(int l = 0 ; l < count; l++){
                    sb.append("a");
                }
                count++;
                sb.append(" ");
            }
        
       } 
       return sb.toString().trim();
    }
}