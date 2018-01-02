/*Given a string, return a new string where "not " has been added to the front. 
  However, if the string already begins with "not", return the string unchanged. 
  Note: use .equals() to compare 2 strings.

notString("candy") ¡ú "not candy"
notString("x") ¡ú "not x"
notString("not bad") ¡ú "not bad"*/

public String notString(String str) {
  String change = "";
  if(str.length() < 3){
    change = "not " + str;
  }else{
    if(str.substring(0,3).equals("not")){
      change = str;
    }else{
      change = "not " + str;
    }
  }
  return change;
}

/*public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
  }
  
  return "not " + str;
}

Comments: should make use of .equal() well.*/