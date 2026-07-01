// LeetCode 917 - Reverse Only Letters
//
// Given a string, reverse only the
// English letters while keeping all
// non-letter characters in the same position.
//
// Approach:
// 1. Convert the string into a character array.
// 2. Use two pointers:
//    - Left pointer starts from the beginning.
//    - Right pointer starts from the end.
// 3. Skip non-letter characters.
// 4. Swap only the letters.
// 5. Convert the character array back to a string.
//
// Example:
// Input:  "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"

class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while(i < j) {

            if(!Character.isLetter(arr[i])) {
                i++;
            }
            else if(!Character.isLetter(arr[j])) {
                j--;
            }
            else {

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }
}