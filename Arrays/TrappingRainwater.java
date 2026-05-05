// Problem:
// Given an array representing heights of bars,
// find how much water can be trapped after raining.

// Example:
// Input  : [4, 2, 0, 6, 3, 2, 5]
// Output : 11

// Approach:
// Water at any index depends on the minimum of:
// - Maximum height to its left
// - Maximum height to its right

// Formula:
// water[i] = min(leftMax[i], rightMax[i]) - height[i]

// Steps:
// 1. Create leftMax array → stores max height from left
// 2. Create rightMax array → stores max height from right
// 3. For each index:
//    - Find water level using min(leftMax, rightMax)
//    - Add (level - height[i]) to total water

// Time Complexity  : O(n)
// Space Complexity : O(n)

package Arrays;

public class TrappingRainwater{
    public static int TrappedRainWater(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        //Calculating max left array
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        
        // Calculating max right array
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        
        // Calculating Trapped Water
        int water =0;
        for(int i=0; i<n; i++){
            int level = Math.min(leftMax[i],rightMax[i]);
            water+= level-height[i];
        }
        return water;
     }
    
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        TrappedRainWater(height);
        System.out.println("Trapped Water: " + TrappedRainWater(height));
    }
}
