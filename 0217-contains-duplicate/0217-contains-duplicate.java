class Solution {
    public boolean containsDuplicate (int[] numbers){
        Set<Integer> seen = new HashSet<>();
        for (int i=0 ; i < numbers.length ; i++){
            if (seen.contains(numbers[i])){
                return true;
            } seen.add(numbers[i]);
        } return false;
    }
}

// List of Mistakes I Made..
// 1) how to declare method : parameter e.g. int[] numbers)
// 2) property of arrays : numbers.length)
// 3) confused with built-in methods of hashset : seen.contains , seen.add
// 4) confused about the naming for classes and methods
//      Classes: PascalCase
//      Methods: camelCase
