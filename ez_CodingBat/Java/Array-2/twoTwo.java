/*Given an array of ints, 
  return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) ¡ú true
twoTwo([2, 2, 4]) ¡ú true
twoTwo([2, 2, 4, 2]) ¡ú false*/

public boolean twoTwo(int[] nums) {
  boolean two = true;
  if(nums.length < 2){
    for(int n = 0; n < nums.length; n++){
      if(nums[n] == 2){
        two = false;
      }
    }
  }else{
    for(int n = 0; n < nums.length; n++){
      if(nums[n] == 2){
        if(n == 0 && nums[n + 1] != 2){
          two = false;
        }else if(n == (nums.length - 1) && nums[n - 1] != 2){
          two = false;
        }else if(n > 0 && n < (nums.length - 1) && 
                 nums[n - 1] != 2 && nums[n + 1] != 2){
          two = false;
        }
      }
    }
  }
  return two;
}