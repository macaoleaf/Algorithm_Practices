/*Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") ¡ú true
startHi("hi") ¡ú true
startHi("hello hi") ¡ú false*/

public boolean startHi(String str) {
  if(str.length() > 1){
  return (str.charAt(0) == 'h' && str.charAt(1) == 'i');
  }else{
  return false;
  }
}

/*Solution:
public boolean startHi(String str) {
  // First test if the string is not at least length 2
  // (so the substring() below does not go past the end).
  if (str.length() < 2) return false;
  
  // Pull out the string of the first two chars
  String firstTwo = str.substring(0, 2);
  
  // Test if it is equal to "hi"
  if (firstTwo.equals("hi")) {
    return true;
  } else {
    return false;
  }
  // This last part can be shortened to: return(firstTwo.equals("hi"));
}
start to understand the usage of substring lol*/