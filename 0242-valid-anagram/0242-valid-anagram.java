class Solution {
    public boolean isAnagram(String s, String t) {
        char [] array_s = s.toCharArray();
        Arrays.sort(array_s);
        char [] array_t = t.toCharArray();
        Arrays.sort(array_t);

        boolean result = Arrays.equals(array_s, array_t);
        return result;

        
           }
}