/*Given a string, consider the prefix string made of the first N chars of the string. 
  Does that prefix string appear somewhere else in the string? 
  Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) ¡ú true
prefixAgain("abXYabc", 2) ¡ú true
prefixAgain("abXYabc", 3) ¡ú false*/

public boolean prefixAgain(String str, int n) {
  boolean again = false;
  String prefix = str.substring(0, n);
  if(str.length() >= n * 2){
    for(int x = n; x < (str.length() - n + 1); x++){
      if(str.substring(x, x + n).equals(prefix)){
        again = true;
      }
    }
  }
  return again;
}