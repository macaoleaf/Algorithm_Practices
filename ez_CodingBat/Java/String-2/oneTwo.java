/*Given a string, 
  compute a new string by moving the first char to come after the next two chars, 
  so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, 
  so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") ¡ú "bca"
oneTwo("tca") ¡ú "cat"
oneTwo("tcagdo") ¡ú "catdog"*/

public String oneTwo(String str) {
  String result = "";
  for(int n = 0; n < str.length(); n += 3){
    int diff = str.length() - result.length();
    if(diff >= 3){
      result = result + str.charAt(n + 1) + str.charAt(n + 2) + str.charAt(n);
    }
  }
  return result;
}