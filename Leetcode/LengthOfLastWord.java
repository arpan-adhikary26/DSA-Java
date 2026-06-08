// LeetCode 58 - Length of Last Word
//
// Given a string consisting of words and spaces,
// return the length of the last word.
//
// Approach:
// 1. Remove leading and trailing spaces using trim().
// 2. Traverse the string from the end.
// 3. Count characters until a space is encountered.
// 4. Return the count.
//
// Example:
// Input: "Hello World"
// Output: 5
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();

        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(s.charAt(i) == ' ') {
                break;
            }

            count++;
        }

        return count;
    }
}