// LeetCode 387 - First Unique Character in a String
//
// Find the index of the first non-repeating character.
//
// Approach:
// 1. Count frequency of each character.
// 2. Traverse the string again.
// 3. Return the index of the first character
//    whose frequency is 1.
// 4. Return -1 if no unique character exists.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int firstUniqChar(String s) {

        int freq[] = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}