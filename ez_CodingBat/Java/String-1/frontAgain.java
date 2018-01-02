/*Given a string, 
  return true if the first 2 chars in the string also appear at the end of the string, 
  such as with "edited".

frontAgain("edited") ¡ú true
frontAgain("edit") ¡ú false
frontAgain("ed") ¡ú true*/

public boolean frontAgain(String str) {
  if(str.length() <= 1){
    return false;
  }else if(str.length() == 2){
    return true;
  }else{
    return (str.substring(0, 2).equals(str.substring(str.length() - 2)));
  }
}