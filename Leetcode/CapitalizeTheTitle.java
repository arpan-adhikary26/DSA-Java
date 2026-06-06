// LeetCode 2129 - Capitalize the Title
//
// Given a string title, capitalize each word
// according to the following rules:
//
// 1. If the word length is 1 or 2,
//    convert the entire word to lowercase.
//
// 2. If the word length is greater than 2,
//    capitalize the first letter and convert
//    the remaining letters to lowercase.
//
// Approach:
// - Split the string into words.
// - Convert each word to lowercase.
// - If length > 2, capitalize the first character.
// - Append processed words using StringBuilder.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 2) {
                sb.append(word.toLowerCase());
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}