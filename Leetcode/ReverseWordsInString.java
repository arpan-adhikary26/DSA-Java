// LeetCode 151 - Reverse Words in a String
//
// Reverse the order of words in a string.
// Remove extra spaces and keep only one
// space between words.
//
// Approach:
// 1. Trim leading/trailing spaces.
// 2. Split string into words.
// 3. Traverse words array from end.
// 4. Build final reversed string.

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}