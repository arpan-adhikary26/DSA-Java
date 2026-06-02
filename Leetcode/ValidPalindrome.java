// LeetCode 125 - Valid Palindrome
//
// Check if a string is a palindrome after
// ignoring spaces, special characters,
// and case differences.
//
// Approach:
// - Use two pointers (start and end).
// - Skip non-alphanumeric characters.
// - Compare characters after converting
//   them to lowercase.
// - If any mismatch is found, return false.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end = s.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}