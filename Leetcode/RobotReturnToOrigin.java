// LeetCode 657 - Robot Return to Origin
//
// A robot starts at (0,0).
// Determine whether it returns
// to the origin after performing
// all the given moves.
//
// Moves:
// U -> Up
// D -> Down
// L -> Left
// R -> Right
//
// Approach:
// 1. Track x and y coordinates.
// 2. Update coordinates according
//    to each move.
// 3. If final position is (0,0),
//    return true.
// 4. Otherwise return false.
//
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        for(int i = 0; i < moves.length(); i++) {

            char move = moves.charAt(i);

            if(move == 'U') {
                y++;
            }
            else if(move == 'D') {
                y--;
            }
            else if(move == 'L') {
                x--;
            }
            else {
                x++;
            }
        }

        return x == 0 && y == 0;
    }
}