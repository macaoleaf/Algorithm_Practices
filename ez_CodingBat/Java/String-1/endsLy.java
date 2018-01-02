/*Given a string, return true if it ends in "ly".

endsLy("oddly") ¡ú true
endsLy("y") ¡ú false
endsLy("oddy") ¡ú false*/

public boolean endsLy(String str) {
  boolean ly = false;
  if(str.length() >= 2 && str.substring(str.length() - 2).equals("ly")){
    ly = true;
  }
  return ly;
}