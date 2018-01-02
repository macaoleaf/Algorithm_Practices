/*Given two ints, each in the range 10..99, 
  return true if there is a digit that appears in both numbers, 
  such as the 2 in 12 and 23. 
  (Note: division, e.g. n/10, 
   gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) ¡ú true
shareDigit(12, 43) ¡ú false
shareDigit(12, 44) ¡ú false*/

public boolean shareDigit(int a, int b) {
  int onethA = a % 10;
  int onethB = b % 10;
  int tenthA = (a - onethA) / 10;
  int tenthB = (b - onethB) / 10;
  return (onethA == onethB || onethA == tenthB ||
          tenthA == onethB || tenthA == tenthB);
}