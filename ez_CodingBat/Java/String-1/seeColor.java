/*Given a string, if the string begins with "red" or "blue" return that color string, 
  otherwise return the empty string.

seeColor("redxx") ¡ú "red"
seeColor("xxred") ¡ú ""
seeColor("blueTimes") ¡ú "blue"*/

public String seeColor(String str) {
  if(str.length() < 3){
    return "";
  }else if(str.length() == 3){
    if(str.equals("red")){
      return "red";
    }else{
      return "";
    }
  }else{
    if(str.substring(0, 3).equals("red")){
      return "red";
    }else if(str.substring(0, 4).equals("blue")){
      return "blue";
    }else{
      return "";
    }
  }
}