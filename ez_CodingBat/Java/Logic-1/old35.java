/*Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
  Use the % "mod" operator

old35(3) ¡ú true
old35(10) ¡ú true
old35(15) ¡ú false*/

public boolean old35(int n) {
  if(n % 3 == 0 || n % 5 == 0){
    if(n % 3 == 0 && n % 5 == 0){
      return false;
    }else{
      return true;
    }
  }else{
    return false;
  }
}