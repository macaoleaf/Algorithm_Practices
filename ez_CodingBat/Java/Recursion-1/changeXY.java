/* Given a string, compute recursively (no loops) a new string 
 * where all the lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") ¡ú "codey"
changeXY("xxhixx") ¡ú "yyhiyy"
changeXY("xhixhix") ¡ú "yhiyhiy"*/

public String changeXY(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
  return str.charAt(0) + changeXY(str.substring(1));
}