/*Returns true if for every '*' (star) in the string, 
  if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") ¡ú true
sameStarChar("xy*zzz") ¡ú false
sameStarChar("*xa*az") ¡ú true*/

public boolean sameStarChar(String str) {
  boolean star = true;
  if(str.length() != 0){
    for(int n = 1; n < (str.length() - 1); n++){
      if(str.charAt(n) == '*' && str.charAt(n - 1) != str.charAt(n + 1)){
        star = false;
      }
    }
  }
  return star;
}