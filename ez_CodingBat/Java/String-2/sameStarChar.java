/*Returns true if for every '*' (star) in the string, 
  if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") �� true
sameStarChar("xy*zzz") �� false
sameStarChar("*xa*az") �� true*/

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