/*Given an array of ints, 
  return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) ¡ú true
has12([3, 1, 2]) ¡ú true
has12([3, 1, 4, 5, 2]) ¡ú true*/

public boolean has12(int[] nums) {
  int one = -1;
  int two = -1;
  boolean has12 = false;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 1){
      one = n;
    }else if(nums[n] == 2){
      two = n;
    }
  }
  if(one != -1 && two != -1 && one < two){
    has12 = true;
  }
  return has12;
}