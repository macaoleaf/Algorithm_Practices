/*Given two strings, 
  return true if either of the strings appears at the very end of the other string, 
  ignoring upper/lower case differences 
  (in other words, the computation should not be "case sensitive"). 
  Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") ¡ú true
endOther("AbC", "HiaBc") ¡ú true
endOther("abc", "abXabc") ¡ú true*/

public boolean endOther(String a, String b) {
  boolean same = false;
  String aCS = a.toLowerCase();
  String bCS = b.toLowerCase();
  if(a.length() < b.length()){
    if(aCS.equals(bCS.substring(b.length() - a.length()))){
      same = true;
    }
  }else{
    if(bCS.equals(aCS.substring(a.length() - b.length()))){
      same = true;
    }
  }
  return same;
}