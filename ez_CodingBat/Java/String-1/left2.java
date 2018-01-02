/*Given a string, 
  return a "rotated left 2" version where the first 2 chars are moved to the end. 
  The string length will be at least 2.

left2("Hello") ¡ú "lloHe"
left2("java") ¡ú "vaja"
left2("Hi") ¡ú "Hi"*/

public String left2(String str) {
  if(str.length() == 2){
    return str;
  }else{
    return str.substring(2) + str.substring(0, 2);
  }
}

//Notice that the first if can be ignored. Pay attention to the usage of substring.