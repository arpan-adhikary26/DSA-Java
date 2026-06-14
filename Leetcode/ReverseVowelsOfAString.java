// LeetCode 345 - Reverse Vowels of a String
//
// Given a string, reverse only the vowels
// while keeping all other characters in
// their original positions.
//
// Approach:
// 1. Convert the string into a character array.
// 2. Use two pointers:
//    - One from the beginning.
//    - One from the end.
// 3. Move pointers until vowels are found.
// 4. Swap the vowels.
// 5. Convert the character array back to a string.
//
// Example:
// Input:  "hello"
// Output: "holle"
//
// Input:  "leetcode"
// Output: "leotcede"
//
// Time Complexity: O(n)
// Space Complexity: O(n)
//
// Concepts Used:
// ✓ Strings
// ✓ Character Arrays
// ✓ Two Pointers
// ✓ Swapping
// ✓ Helper Functions

class Solution {

    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
           ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {

        char ch[] = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while(i < j){

            if(!isVowel(ch[i])){
                i++;
            }
            else if(!isVowel(ch[j])){
                j--;
            }
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }

        return new String(ch);
    }
}