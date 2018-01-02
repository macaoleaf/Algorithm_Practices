/*Given 2 strings, a and b, 
  return a new string made of the first char of a and the last char of b, 
  so "yo" and "java" yields "ya". 
  If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") ¡ú "ls"
lastChars("yo", "java") ¡ú "ya"
lastChars("hi", "") ¡ú "h@"*/

public String lastChars(String a, String b) {
  String result = "";
  char forA, forB;
  if(a.length() == 0){
    forA = '@';
  }else{
    forA = a.charAt(0);
  }
  if(b.length() == 0){
    forB = '@';
  }else{
    forB = b.charAt(b.length() - 1);
  }
  result = result + forA + forB;
  return result;
}