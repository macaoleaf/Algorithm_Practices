/*We'll say that a value is "everywhere" in an array 
  if for every pair of adjacent elements in the array, 
  at least one of the pair is that value. 
  Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) ¡ú true
isEverywhere([1, 2, 1, 3], 2) ¡ú false
isEverywhere([1, 2, 1, 3, 4], 1) ¡ú false*/

public boolean isEverywhere(int[] nums, int val) {
  boolean everywhere = true;
  for(int n = 0; n < (nums.length - 1); n++){
    if(nums[n] != val && nums[n + 1] != val){
      everywhere = false;
    }
  }
  return everywhere;
}