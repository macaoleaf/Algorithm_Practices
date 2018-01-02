/*Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) ¡ú true
no14([1, 2, 3, 4]) ¡ú false
no14([2, 3, 4]) ¡ú true*/
  
public boolean no14(int[] nums) {
  boolean no = true;
  int one = -1;
  int four = -1;
  if(nums.length != 0){
    for(int n = 0; n < nums.length; n++){
      if(nums[n] == 1){
        one++;
      }else if(nums[n] == 4){
        four++;
      }
    }
  }
  if(one != -1 && four != -1){
    no = false;
  }
  return no;
}