// LeetCode 520 - Detect Capital
//
// Check if the capitalization in a word
// is used correctly.
//
// Valid Cases:
// 1. All letters are uppercase.
// 2. All letters are lowercase.
// 3. Only the first letter is uppercase.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean detectCapitalUse(String word) {
        int count =0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        if(count==0||count==word.length()){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && count==1){
            return true;
        }

        return false;
    }
}