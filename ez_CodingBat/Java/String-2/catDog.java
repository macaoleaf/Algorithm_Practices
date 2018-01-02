/*Return true if the string "cat" and "dog" appear the same number of times 
  in the given string.

catDog("catdog") ¡ú true
catDog("catcat") ¡ú false
catDog("1cat1cadodog") ¡ú true*/

public boolean catDog(String str) {
  int cat = 0;
  int dog = 0;
  boolean equal = false;
  for(int n = 0; n < (str.length() - 2); n++){
    if(str.substring(n, n + 3).equals("cat")){
      cat++;
    }else if(str.substring(n, n + 3).equals("dog")){
      dog++;
    }
  }
  if(cat == dog){
    equal = true;
  }
  return equal;
}