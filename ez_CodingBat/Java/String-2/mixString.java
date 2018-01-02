/*Given two strings, a and b, create a bigger string made of the first char of a, 
  the first char of b, the second char of a, the second char of b, and so on. 
  Any leftover chars go at the end of the result.

mixString("abc", "xyz") ¡ú "axbycz"
mixString("Hi", "There") ¡ú "HTihere"
mixString("xxxx", "There") ¡ú "xTxhxexre"*/

public String mixString(String a, String b) {
  String result = "";
  if(a.length() < b.length()){
    for(int n = 0; n < a.length(); n++){
      result = result + a.charAt(n) + b.charAt(n);
    }
    result += b.substring(a.length());
  }else{
    for(int n = 0; n < b.length(); n++){
      result = result + a.charAt(n) + b.charAt(n);
    }
    result += a.substring(b.length());
  }
  return result;
}