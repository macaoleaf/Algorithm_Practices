/* Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".


changePi("xpix") ¡ú "x3.14x"
changePi("pipi") ¡ú "3.143.14"
changePi("pip") ¡ú "3.14p"*/

public String changePi(String str) {
  if(str.length() < 2) return str;
  if(str.substring(0,2).equals("pi")) return "3.14" + changePi(str.substring(2));
  return str.charAt(0) + changePi(str.substring(1));
}