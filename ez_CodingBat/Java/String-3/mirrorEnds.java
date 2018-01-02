/*Given a string, look for a mirror image (backwards) string 
  at both the beginning and end of the given string. 
  In other words, zero or more characters at the very begining of the given string, 
  and at the very end of the string in reverse order (possibly overlapping). 
  For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") ¡ú "ab"
mirrorEnds("abca") ¡ú "a"
mirrorEnds("aba") ¡ú "aba"*/

public String mirrorEnds(String string) {
  String result = "";
  for(int n = 0; n < string.length(); n++){
    if(string.charAt(n) == string.charAt(string.length() - 1 - n)){
      result += string.charAt(n);
    }else{
      n = string.length();
    }
  }
  return result;
}