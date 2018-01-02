/*Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) ¡ú true
in1020(21, 12) ¡ú true
in1020(8, 99) ¡ú false*/

public boolean in1020(int a, int b) {
  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
}