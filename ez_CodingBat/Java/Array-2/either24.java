/*Given an array of ints, 
  return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) ¡ú true
either24([4, 4, 1]) ¡ú true
either24([4, 4, 1, 2, 2]) ¡ú false*/

public boolean either24(int[] nums) {
  int two = 0;
  int four = 0;
  boolean either = false;
  for(int n = 0; n < (nums.length - 1); n++){
    if(nums[n] == 2 && nums[n + 1] == 2){
      two = 1;
    }else if(nums[n] == 4 && nums[n + 1] == 4){
      four = 1;
    }
  }
  if(two + four == 1){
    either = true;
  }
  return either;
}