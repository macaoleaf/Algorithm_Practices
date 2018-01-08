/* Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
 * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. 
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count8(8) ¡ú 1
count8(818) ¡ú 2
count8(8818) ¡ú 4*/

public int count8(int n) {
  int remainder = n % 10;
  if(n == 0){
    return 0;
  }else if(remainder == 8){
    if((n / 10) % 10 == 8){
      return 2 + count8(n / 10);
    }else{
      return 1 + count8(n / 10);
    }
  }
  return count8(n / 10);
}