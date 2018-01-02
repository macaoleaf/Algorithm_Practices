/*Given an array of ints, return true if the array contains two 7's next to each other, 
  or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) ¡ú true
has77([1, 7, 1, 7]) ¡ú true
has77([1, 7, 1, 1, 7]) ¡ú false*/

public boolean has77(int[] nums) {
  boolean has = false;
  for(int n = 0; n < (nums.length - 1); n++){
    if(nums[n] == 7){
      if(n < (nums.length - 2) && (nums[n + 1] == 7 || nums[n + 2] == 7)){
        has = true;
      }else if(n == (nums.length - 2) && nums[n + 1] == 7){
        has = true;
      }
    }
  }
  return has;
}