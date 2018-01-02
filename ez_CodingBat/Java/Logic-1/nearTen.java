/*Given a non-negative number "num", 
  return true if num is within 2 of a multiple of 10.
  Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. 
  
nearTen(12) �� true
nearTen(17) �� false
nearTen(19) �� true*/

public boolean nearTen(int num) {
  int remainder = num % 10;
  return (remainder <= 2 || remainder >= 8);
}