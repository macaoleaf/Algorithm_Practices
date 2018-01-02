/*Return true if the array contains, somewhere, 
  three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) ¡ú true
tripleUp([1, 2, 3]) ¡ú true
tripleUp([1, 2, 4]) ¡ú false*/

public boolean tripleUp(int[] nums) {
  boolean up = false;
  for(int n = 0; n < (nums.length - 2); n++){
    if(nums[n] + 1 == nums[n + 1] && nums[n] + 2 == nums[n + 2]){
      up = true;
    }
  }
  return up;
}