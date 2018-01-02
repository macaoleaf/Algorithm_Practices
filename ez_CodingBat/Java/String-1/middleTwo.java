/*Given a string of even length, return a string made of the middle two chars, 
  so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") ¡ú "ri"
middleTwo("code") ¡ú "od"
middleTwo("Practice") ¡ú "ct"*/

public String middleTwo(String str) {
  int position = str.length() / 2;
  String result = "";
  result = result + str.charAt(position - 1) + str.charAt(position);
  return result;
}