/*Given two strings, base and remove, 
  return a version of the base string where all instances of the remove string 
  have been removed (not case sensitive). 
  You may assume that the remove string is length 1 or more. 
  Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") ¡ú "He there"
withoutString("Hello there", "e") ¡ú "Hllo thr"
withoutString("Hello there", "x") ¡ú "Hello there"*/

public String withoutString(String base, String remove) {
  String result = "";
  if(base.length() <= remove.length()){
    if(!base.toLowerCase().equals(remove.toLowerCase())){
      result = base;
    }
  }else{
    for(int n = 0; n < base.length(); n++){
      if(n <= base.length() - remove.length()){
        if(base.substring(n, n + remove.length()).toLowerCase().equals
        (remove.toLowerCase())){
        n += remove.length() - 1;
        }else{
        result += base.charAt(n);
        }
      }else{
        result += base.charAt(n);
      }
    }
  }
  return result;
}