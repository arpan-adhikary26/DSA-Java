// LeetCode 541 - Reverse String II
//
// Given a string s and an integer k,
// reverse the first k characters for every
// 2k characters counting from the start.
//
// Approach:
// 1. Convert the string into a character array.
// 2. Traverse the array in steps of 2*k.
// 3. Reverse the first k characters of each block.
// 4. If fewer than k characters remain,
//    reverse all remaining characters.
// 5. Convert the array back to a string.
//
// Example:
// Input: s = "abcdefg", k = 2
//
// Block 1: "ab" -> "ba"
// Block 2: "ef" -> "fe"
//
// Output: "bacdfeg"
//
// Time Complexity: O(n)
// Space Complexity: O(n)


class Solution {
    public String reverseStr(String s, int k) {
        char arr[] = s.toCharArray();

        for(int i=0; i<s.length(); i=i+(2*k)){
            int start=i;
            int end = Math.min(i+k-1, arr.length-1);

            while(start<end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr);
    }
}