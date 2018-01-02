/*Given a string, return the longest substring that appears 
  at both the beginning and end of the string without overlapping. 
  For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") ¡ú "ab"
sameEnds("xx") ¡ú "x"
sameEnds("xxx") ¡ú "x"*/

public String sameEnds(String string) {
  int half = string.length() / 2;
  int length = -1;
  for(int n = 0; n < (half + 1); n++){
    if(string.substring(0, n).equals(string.substring(string.length() - n))){
      length = n;
    }
  }
  String result = string.substring(0, length);
  return result;
}