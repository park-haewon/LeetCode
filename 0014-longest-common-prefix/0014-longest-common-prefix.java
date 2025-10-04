class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int minLength = strs[0].length();

        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() < minLength){
                minLength = strs[i].length();
            }
        }

        for (int i=0; i< minLength; i++){
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j< strs.length; j++){
                if (strs[j].charAt(i) != currentChar){
                    return result;

                }
            }
            result = result + currentChar;
    }
    return result;
    }
}
