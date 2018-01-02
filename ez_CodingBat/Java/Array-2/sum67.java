/*Return the sum of the numbers in the array, 
  except ignore sections of numbers starting with a 6 and extending to the next 7 
  (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) ¡ú 5
sum67([1, 2, 2, 6, 99, 99, 7]) ¡ú 5
sum67([1, 1, 6, 7, 2]) ¡ú 4*/

public int sum67(int[] nums) {
  int sum = 0;
  int count6 = 0;
  for(int n = 0; n < nums.length; n++){
    if(count6 == 0 && nums[n] == 6){
      while(nums[n] != 7){
        n++;
      }
    }else{
      sum += nums[n];
    }
  }
  return sum;
}