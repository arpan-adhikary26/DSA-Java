// LeetCode 2000 - Reverse Prefix of Word
//
// Given a string word and a character ch,
// reverse the prefix of word ending at the
// first occurrence of ch.
//
// If ch does not exist in the string,
// return the original string.
//
// Approach:
// 1. Convert the string into a character array.
// 2. Traverse the array to find the first
//    occurrence of ch.
// 3. Once found, use two pointers:
//    - Left starts at index 0.
//    - Right starts at the index of ch.
// 4. Swap characters until both pointers meet.
// 5. Convert the character array back to a string.
//
// Example:
// Input: word = "abcdefd", ch = 'd'
// Output: "dcbaefd"
//
// Explanation:
// Prefix = "abcd"
// Reverse = "dcba"
// Remaining = "efd"
//
// Final = "dcbaefd"


class Solution {
    public String reversePrefix(String word, char ch) {

        char[] rev = word.toCharArray();

        for(int i = 0; i < rev.length; i++) {

            if(rev[i] == ch) {

                int left = 0;
                int right = i;

                while(left < right) {
                    char temp = rev[left];
                    rev[left] = rev[right];
                    rev[right] = temp;

                    left++;
                    right--;
                }

                break;
            }
        }

        return new String(rev);
    }
}

