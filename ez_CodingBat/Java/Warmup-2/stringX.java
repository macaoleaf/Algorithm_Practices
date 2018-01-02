/*Given a string, return a version where all the "x" have been removed. 
  Except an "x" at the very start or end should not be removed.

stringX("xxHxix") ¡ú "xHix"
stringX("abxxxcd") ¡ú "abcd"
stringX("xabxxxcdx") ¡ú "xabcdx"*/

public String stringX(String str) {
  String result = "";
  for(int n = 0; n < str.length(); n++){
    if(n != 0 && n != str.length() - 1 && str.charAt(n) == 'x'){
      continue;
    }else{
      result += str.charAt(n);
    }
  }
  return result;
}