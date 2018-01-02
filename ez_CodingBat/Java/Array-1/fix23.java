/*Given an int array length 3, if there is a 2 in the array immediately followed by a 3, 
  set the 3 element to 0. Return the changed array.

fix23([1, 2, 3]) ¡ú [1, 2, 0]
fix23([2, 3, 5]) ¡ú [2, 0, 5]
fix23([1, 2, 1]) ¡ú [1, 2, 1]*/

public int[] fix23(int[] nums) {
  int[] result = new int[nums.length];
  for(int n = 0; n < nums.length; n++){
    if(n != 0 && nums[n] == 3 && nums[n - 1] == 2){
      result[n] = 0;
    }else{
      result[n] = nums[n];
    }
  }
  return result;
}
