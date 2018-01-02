/*Given a string, if the string "del" appears starting at index 1, 
  return a string where that "del" has been deleted. 
  Otherwise, return the string unchanged.

delDel("adelbc") ¡ú "abc"
delDel("adelHello") ¡ú "aHello"
delDel("adedbc") ¡ú "adedbc"*/
  
public String delDel(String str) {
  String change = "";
  if(str.length() >= 4 && str.substring(1,4).equals("del")){
    change = str.charAt(0) + str.substring(4, str.length());
  }else{
    change = str;
  }
  return change;
}

/*Solution:
public String delDel(String str) {
  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    // First char + rest of string starting at 4
    return str.substring(0, 1) + str.substring(4);
  }
  // Otherwise return the original string.
  return str;
}

when substring only has an end, just mention the beginning is fine.*/