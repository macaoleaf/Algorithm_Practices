/*Given a string, 
  return a new string made of 3 copies of the last 2 chars of the original string. 
  The string length will be at least 2.

extraEnd("Hello") ¡ú "lololo"
extraEnd("ab") ¡ú "ababab"
extraEnd("Hi") ¡ú "HiHiHi"*/

public String extraEnd(String str) {
  String result = "";
  for(int n = 0; n < 3; n++){
    result += str.substring(str.length() - 2);
  }
  return result;
}