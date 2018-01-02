/*Given 2 strings, return their concatenation, except omit the first char of each. 
  The strings will be at least length 1.

nonStart("Hello", "There") ¡ú "ellohere"
nonStart("java", "code") ¡ú "avaode"
nonStart("shotl", "java") ¡ú "hotlava"*/

public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}