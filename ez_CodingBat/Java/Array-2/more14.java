/*Given an array of ints, 
  return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) ¡ú true
more14([1, 4, 1, 4]) ¡ú false
more14([1, 1]) ¡ú true*/

public boolean more14(int[] nums) {
  int one = 0;
  int four = 0;
  boolean more = false;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 1){
      one++;
    }else if(nums[n] == 4){
      four++;
    }
  }
  if(one > four){
    more = true;
  }
  return more;
}