/* Given a string, 
 * compute recursively a new string where all the adjacent chars are now separated by a "*".


allStar("hello") �� "h*e*l*l*o"
allStar("abc") �� "a*b*c"
allStar("ab") �� "a*b"*/

public String allStar(String str) {
  if(str.length() == 0) return "";
  if(str.length() != 1) return str.charAt(0) + "*" + allStar(str.substring(1));
  return str.charAt(0) + allStar(str.substring(1));
}
