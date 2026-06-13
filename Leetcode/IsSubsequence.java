// LeetCode 392 - Is Subsequence
//
// Check whether string s is a subsequence of t.
//
// Approach:
// 1. Use two pointers:
//    - i for string s
//    - j for string t
// 2. Compare characters at i and j.
// 3. If characters match, move i.
// 4. Always move j.
// 5. If i reaches the end of s,
//    all characters were found in order.
//
// Example:
// s = "abc"
// t = "ahbgdc"
//
// a == a ✓
// b == b ✓
// c == c ✓
//
// Return true.
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()) {

            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}