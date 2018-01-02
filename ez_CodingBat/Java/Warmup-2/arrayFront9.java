/*Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
  The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) ¡ú true
arrayFront9([1, 2, 3, 4, 9]) ¡ú false
arrayFront9([1, 2, 3, 4, 5]) ¡ú false*/

public boolean arrayFront9(int[] nums) {
  boolean is9 = false;
  int length = 0;
  if(nums.length <= 4){
    length = nums.length;
  }else{
    length = 4;
  }
  for(int n = 0; n < length; n++){
    if(nums[n] == 9){
      is9 = true;
    }
  }
  return is9;
}