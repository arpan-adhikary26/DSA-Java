// LeetCode 859 - Buddy Strings
//
// Given two strings s and goal,
// return true if you can swap exactly
// one pair of characters in s so that
// it becomes equal to goal.
//
// Approach:
// 1. If lengths are different,
//    return false.
// 2. If both strings are already equal,
//    check if any character appears
//    more than once.
//    - If yes, swapping identical
//      characters keeps the string same.
// 3. Otherwise, find all indices where
//    the characters are different.
// 4. There must be exactly two
//    mismatched indices.
// 5. Check if swapping those two
//    characters makes the strings equal.
//
// Example:
// s = "ab"
// goal = "ba"
//
// Swap 'a' and 'b'
// Result = "ba"
//
// Return true.


class Solution {
    public boolean buddyStrings(String s, String goal) {

        if(s.length() != goal.length()) {
            return false;
        }

        if(s.equals(goal)) {
            int freq[] = new int[26];

            for(int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;

                if(freq[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }

            return false;
        }

        int first = -1;
        int second = -1;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != goal.charAt(i)) {

                if(first == -1) {
                    first = i;
                }
                else if(second == -1) {
                    second = i;
                }
                else {
                    return false;
                }
            }
        }

        return second != -1 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
}