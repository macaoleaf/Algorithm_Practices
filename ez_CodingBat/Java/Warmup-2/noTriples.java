/*Given an array of ints, 
  we'll say that a triple is a value appearing 3 times in a row in the array. 
  Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) ¡ú true
noTriples([1, 1, 2, 2, 2, 1]) ¡ú false
noTriples([1, 1, 1, 2, 2, 2, 1]) ¡ú false*/

public boolean noTriples(int[] nums) {
  boolean no = true;
  for(int n = 0; n < (nums.length - 2); n++){
    if(nums[n] == nums[n + 1] && nums[n + 1] == nums[n + 2]){
      no = false;
    }
  }
  return no;
}