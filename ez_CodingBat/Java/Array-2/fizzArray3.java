/*Given start and end numbers, 
  return a new array containing the sequence of integers 
  from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. 
  The end number will be greater or equal to the start number. 
  Note that a length-0 array is valid. (See also: FizzBuzz Code)

fizzArray3(5, 10) ¡ú [5, 6, 7, 8, 9]
fizzArray3(11, 18) ¡ú [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) ¡ú [1, 2]*/

public int[] fizzArray3(int start, int end) {
  int[] result = new int[end - start];
  for(int n = 0; n < result.length; n++){
    result[n] = start + n;
  }
  return result;
}