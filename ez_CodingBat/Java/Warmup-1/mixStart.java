/*Return true if the given string begins with "mix", 
  except the 'm' can be anything, 
  so "pix", "9ix" .. all count.

mixStart("mix snacks") ¡ú true
mixStart("pix snacks") ¡ú true
mixStart("piz snacks") ¡ú false*/

public boolean mixStart(String str) {
  if(str.length() < 3){
    return false;
  }else{
    return (str.substring(1,3).equals("ix"));
  }
}

/*remember to use .equals() when comparing two strings*/