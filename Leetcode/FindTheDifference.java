// LeetCode 389 - Find the Difference
//
// Given two strings s and t, where t is generated
// by randomly shuffling s and adding one extra character,
// return the extra character.
//
// Approach:
// 1. Create a frequency array of size 26.
// 2. Count frequency of all characters in t.
// 3. Decrease frequency using characters in s.
// 4. The character whose frequency remains 1
//    is the extra character.
//
// Example:
// s = "abcd"
// t = "abcde"
//
// Frequency after counting:
// a=1 b=1 c=1 d=1 e=1
//
// After removing characters of s:
// a=0 b=0 c=0 d=0 e=1
//
// Extra character = e
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Solution {
    public char findTheDifference(String s, String t) {
        int freq[] = new int[26];
        for(char ch: t.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch: s.toCharArray()){
            freq[ch-'a']--;
            
        }
        for(int i=0; i<26; i++){
            if(freq[i]==1){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}