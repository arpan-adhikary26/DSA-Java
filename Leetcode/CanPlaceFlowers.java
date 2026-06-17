// LeetCode 605 - Can Place Flowers
//
// Given a flowerbed array containing 0s and 1s,
// determine if n new flowers can be planted
// without violating the rule that no two flowers
// can be adjacent.
//
// Approach:
// 1. Traverse the flowerbed array.
// 2. For every empty plot (0), check:
//    - Left plot is empty or doesn't exist.
//    - Right plot is empty or doesn't exist.
// 3. If both conditions are satisfied,
//    plant a flower and increase count.
// 4. If count becomes equal to n,
//    return true.
// 5. If traversal ends and count < n,
//    return false.
//
// Example:
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
//
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0){
            return true;
        }

        int count=0;

        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]==0){
                if((i==0|| flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                    count++;
                    if(count==n){
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}