// LeetCode 344 - Reverse String
//
// Given a character array, reverse the array in-place.
//
// Approach:
// 1. Use two pointers:
//    - i starts from the beginning.
//    - j starts from the end.
// 2. Swap characters at i and j.
// 3. Move i forward and j backward.
// 4. Continue until both pointers meet.
//
// Example:
// Input:  ['h','e','l','l','o']
// Output: ['o','l','l','e','h']
//
// Time Complexity: O(n)
// Space Complexity: O(1)
//
// Concepts Used:
// ✓ Two Pointers
// ✓ Character Array
// ✓ In-place Swapping

class Main {

    public static void reverseString(char s[]){
        int i=0; 
        int j= s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed String is:");
        for(char ch: s){
            System.out.print(ch + " ");
        }
    }

    public static void main(String args[]){
        String str = "hello";
        char s[] = str.toCharArray();
        reverseString(s);
    }
}