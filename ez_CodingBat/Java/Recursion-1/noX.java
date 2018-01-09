/* Given a string, compute recursively a new string where all the 'x' chars have been removed.


noX("xaxb") ¡ú "ab"
noX("abc") ¡ú "abc"
noX("xx") ¡ú ""*/

public String noX(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x') return noX(str.substring(1));
  return str.charAt(0) + noX(str.substring(1));
}