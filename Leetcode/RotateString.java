// LeetCode 796 - Rotate String
//
// Given two strings s and goal,
// return true if and only if s can
// become goal after some number of
// left rotations.
//
// Approach:
// 1. If lengths are different,
//    return false.
// 2. Concatenate s with itself.
// 3. Check if goal exists in the
//    concatenated string.
// 4. If yes, return true.
//    Otherwise, return false.
//
// Example:
// s = "abcde"
// goal = "cdeab"
//
// doubled = "abcdeabcde"
//
// "cdeab" exists inside doubled
// therefore return true.
//
// Time Complexity: O(n)
// Space Complexity: O(n)


public class RotateString {

    public static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
}