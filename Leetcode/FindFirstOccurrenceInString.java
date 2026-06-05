// LeetCode 28 - Find the Index of the First Occurrence in a String
//
// Find the first occurrence of needle
// inside haystack.
//
// Approach:
// Try matching needle from every possible
// starting position in haystack.
// If all characters match, return index.
//
// Time Complexity: O(n * m)
// Space Complexity: O(1)

class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n - m; i++) {

            int j;

            for(j = 0; j < m; j++) {

                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if(j == m) {
                return i;
            }
        }

        return -1;
    }
}