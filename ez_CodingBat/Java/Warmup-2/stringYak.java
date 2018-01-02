/*Suppose the string "yak" is unlucky. 
  Given a string, return a version where all the "yak" are removed, 
  but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") ¡ú "pak"
stringYak("pakyak") ¡ú "pak"
stringYak("yak123ya") ¡ú "123ya"*/

public String stringYak(String str) {
  String result = "";
  if(str.length() <= 2){
    return str;
  }else if(str.length() == 3 && str.charAt(0) == 'y' &&
           str.charAt(2) == 'k'){
    return result;
  }else{
    int n = 0;
    while(n < str.length()){
      if(n < (str.length() - 2) && str.charAt(n) == 'y' && 
         str.charAt(n + 2) == 'k'){
        n = n + 3;
        continue;
      }else{
        result += str.charAt(n);
        n++;
      }
    }
  }
  return result;
}

/*Solution:
public String stringYak(String str) {
  String result = "";
  
  for (int i=0; i<str.length(); i++) {
    // Look for i starting a "yak" -- advance i in that case
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else { // Otherwise do the normal append
      result = result + str.charAt(i);
    }
  }
  
  return result;
}

Comment:
I firstly did it in a wrong way, so when I did it right at the second time, I didn't
realize that the first part can be ignored.
Also, although the variable n changed in the loop,
we can still use a for loop but not a while loop,
in order to make codes shorter.*/