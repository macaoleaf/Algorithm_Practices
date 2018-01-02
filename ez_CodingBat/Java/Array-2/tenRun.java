/*For each multiple of 10 in the given array, 
  change all the values following it to be that multiple of 10, 
  until encountering another multiple of 10. 
  So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) ¡ú [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) ¡ú [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) ¡ú [10, 10, 10, 20]*/

public int[] tenRun(int[] nums) {
  int[] result = new int[nums.length];
  int ruler = -1;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] % 10 == 0){
      ruler = nums[n];
    }
    if(ruler == -1){
      result[n] = nums[n];
    }else{
      result[n] = ruler;
    }
  }
  return result;
}