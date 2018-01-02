/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
  and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) ¡ú true
haveThree([3, 1, 3, 3]) ¡ú false
haveThree([3, 4, 3, 3, 4]) ¡ú false*/

public boolean haveThree(int[] nums) {
  boolean have = false;
  boolean conti = false;
  int count = 0;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 3){
      count++;
      if(n != (nums.length - 1) && nums[n + 1] == 3){
        conti = true;
      }
    }
  }
  if(count == 3 && !conti){
    have = true;
  }
  return have;
}