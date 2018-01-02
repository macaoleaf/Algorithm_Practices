/*For this problem, we'll round an int value up to the next multiple of 10 
  if its rightmost digit is 5 or more, so 15 rounds up to 20. 
  Alternately, round down to the previous multiple of 10 
  if its rightmost digit is less than 5, so 12 rounds down to 10. 
  Given 3 ints, a b c, return the sum of their rounded values. 
  To avoid code repetition, write a separate helper "
  public int round10(int num) {
  " and call it 3 times. 
  Write the helper entirely below and at the same indent level as roundSum().

roundSum(16, 17, 18) ¡ú 60
roundSum(12, 13, 14) ¡ú 30
roundSum(6, 4, 4) ¡ú 10*/

public int roundSum(int a, int b, int c) {
  return (round10(a) + round10(b) + round10(c));
}
public int round10(int n){
  if(n % 10 >= 5){
    return (n + (10 - n % 10));
  }else{
    return (n - n % 10);
  }
}

/* Solution:

public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

// Helper function to round a value based on its last digit.
public int round10(int num) {
  int remainder = num % 10;
  num -= remainder;
  if (remainder >= 5) {
    num += 10;
  }
  return num;
}

Comment:
This way is easier cuz it takes only one if statement.*/