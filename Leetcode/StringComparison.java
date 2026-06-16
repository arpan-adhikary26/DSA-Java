// LeetCode 443 - String Compression
//
// Compress the character array in-place.
//
// Approach:
// 1. Count consecutive occurrences of a character.
// 2. Write the character to the array.
// 3. If count > 1, write the count digits.
// 4. Return the length of the compressed array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while(i < chars.length) {

            char current = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index++] = current;

            if(count > 1) {

                String str = String.valueOf(count);

                for(char ch : str.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
}