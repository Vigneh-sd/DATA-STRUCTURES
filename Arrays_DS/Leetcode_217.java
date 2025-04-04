// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.

// Example 2:

// Input: nums = [1,2,3,4]

// Output: false

// Explanation:

// All elements are distinct.

// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]

// Output: true

 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int ans=0;
        Map <Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++)
        {
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
       for(Map.Entry<Integer,Integer> entry : map.entrySet())
       {
        if(entry.getValue()>1)
           ans++;
       }
       if (ans==0)
       return false;
       else 
       return true;
    }
}