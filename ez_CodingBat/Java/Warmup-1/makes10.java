/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) ¡ú true
makes10(9, 9) ¡ú false
makes10(1, 9) ¡ú true*/

public boolean makes10(int a, int b) {
  return (a == 10 || b == 10 || (a + b) == 10);
}