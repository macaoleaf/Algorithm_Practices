/*Given a string and a non-negative int n, 
  return a larger string that is n copies of the original string.

stringTimes("Hi", 2) ¡ú "HiHi"
stringTimes("Hi", 3) ¡ú "HiHiHi"
stringTimes("Hi", 1) ¡ú "Hi"*/

public String stringTimes(String str, int n) {
  String result = "";
  for(int x = 0; x < n; x++){
    result += str;
  }
  return result;
}