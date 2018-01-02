/*We'll say that a "triple" in a string is a char appearing three times in a row. 
  Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") ¡ú 1
countTriple("xxxabyyyycd") ¡ú 3
countTriple("a") ¡ú 0*/

public int countTriple(String str) {
  int count = 0;
  for(int n = 0; n < (str.length() - 2); n++){
    if(str.charAt(n) == str.charAt(n + 1) && 
       str.charAt(n + 1) == str.charAt(n + 2)){
      count++;
    }
  }
  return count;
}