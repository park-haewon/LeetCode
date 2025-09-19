class Solution {
    public String mergeAlternately(String word1, String word2) {
         // create a StringBuilder 
        StringBuilder result = new StringBuilder();

        // get the lengths of both strings
        int len1 = word1.length();
        int len2 = word2.length();

        // find minimum length 
        int minLength = Math.min(len1, len2);

        // loop thru alternative characters from both strings
        for (int i=0; i < minLength; i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if (len1 > len2){
            result.append(word1.substring(minLength));
        } else if (len2 > len1){
            result.append(word2.substring(minLength));
        }

        return result.toString();

    }
}