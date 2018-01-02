/*Given a string and an int n, 
  return a string made of n repetitions of the last n characters of the string. 
  You may assume that n is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) ¡ú "llollollo"
repeatEnd("Hello", 2) ¡ú "lolo"
repeatEnd("Hello", 1) ¡ú "o"*/

public String repeatEnd(String str, int n) {
  String result = "";
  for(int x = 0; x < n; x++){
    result += str.substring(str.length() - n);
  }
  return result;
}