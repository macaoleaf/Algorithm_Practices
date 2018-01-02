/*Given three ints, a b c, 
  return true if two or more of them have the same rightmost digit. 
  The ints are non-negative. 
  Note: the % "mod" operator computes the remainder, 
  e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) ¡ú true
lastDigit(23, 19, 12) ¡ú false
lastDigit(23, 19, 3) ¡ú true*/

public boolean lastDigit(int a, int b, int c) {
  int rmA = a % 10;
  int rmB = b % 10;
  int rmC = c % 10;
  return (rmA == rmB || rmB == rmC || rmA == rmC);
}