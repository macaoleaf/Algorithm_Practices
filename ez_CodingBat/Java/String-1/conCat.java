/*Given two strings, append them together (known as "concatenation") and return the result. 
  However, if the concatenation creates a double-char, then omit one of the chars, 
  so "abc" and "cat" yields "abcat".

conCat("abc", "cat") ¡ú "abcat"
conCat("dog", "cat") ¡ú "dogcat"
conCat("abc", "") ¡ú "abc"*/

public String conCat(String a, String b) {
  String result = "";
  if(a.length() == 0){
    result = b;
  }else if(b.length() == 0){
    result = a;
  }else{
    if(a.charAt(a.length() - 1) == b.charAt(0)){
      result = a + b.substring(1);
    }else{
      result = a + b;
    }
  }
  return result;
}