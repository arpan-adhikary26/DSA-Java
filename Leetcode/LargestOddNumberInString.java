// LeetCode 1903 - Largest Odd Number in String
//
// Find the largest-valued odd number
// that is a non-empty substring of num.
//
// Approach:
// Traverse from the end of the string.
// The first odd digit found from the right
// gives the largest possible odd number.
// Return substring from 0 to that index.

class Solution {
    public String largestOddNumber(String num) {
        int n = num.length()-1;
        while(n>=0){
            int digit = num.charAt(n)-'0';
            if(digit%2!=0){
                return num.substring(0,n+1);
            }
            n--;
        }
        return "";
    }
}