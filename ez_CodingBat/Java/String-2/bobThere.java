/*Return true if the given string contains a "bob" string, 
  but where the middle 'o' char can be any char.

bobThere("abcbob") �� true
bobThere("b9b") �� true
bobThere("bac") �� false*/

public boolean bobThere(String str) {
  boolean bob = false;
  for(int n = 1; n < (str.length() - 1); n++){
    if(str.charAt(n - 1) == 'b' && str.charAt(n + 1) == 'b'){
      bob = true;
    }
  }
  return bob;
}