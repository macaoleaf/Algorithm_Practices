/*We'll say that a lowercase 'g' in a string is "happy" 
  if there is another 'g' immediately to its left or right. 
  Return true if all the g's in the given string are happy.

gHappy("xxggxx") ¡ú true
gHappy("xxgxx") ¡ú false
gHappy("xxggyygxx") ¡ú false*/

public boolean gHappy(String str) {
  boolean happy = true;
  if(str.length() < 2 && str.length() != 0){
    happy = false;
  }else if(str.length() != 0){
    for(int n = 0; n < (str.length() - 1); n++){
      if(str.charAt(n) == 'g'){
        if(n == 0 && str.charAt(1) != 'g'){
          happy = false;
        }else if(n > 0 && str.charAt(n - 1) != 'g' && str.charAt(n + 1) != 'g'){
          happy = false;
        }
      }
    }
    if(str.charAt(str.length() - 2) != 'g' && 
      str.charAt(str.length() - 1) == 'g'){
        happy = false;
    }
  }
  return happy;
}