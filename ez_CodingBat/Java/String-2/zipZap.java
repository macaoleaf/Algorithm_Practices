/*Look for patterns like "zip" and "zap" in the string -- length-3, 
  starting with 'z' and ending with 'p'. 
  Return a string where for all such words, the middle letter is gone, 
  so "zipXzap" yields "zpXzp".

zipZap("zipXzap") ¡ú "zpXzp"
zipZap("zopzop") ¡ú "zpzp"
zipZap("zzzopzop") ¡ú "zzzpzp"*/

public String zipZap(String str) {
  String result = "";
  if(str.length() >= 3){
    result += str.charAt(0);
    for(int n = 1; n < (str.length() - 1); n++){
      if(!(str.charAt(n - 1) == 'z' && str.charAt(n + 1) == 'p')){
        result += str.charAt(n);
      }  
    }
    result += str.charAt(str.length() - 1);
  }else{
    result = str;
  }
  return result;
}