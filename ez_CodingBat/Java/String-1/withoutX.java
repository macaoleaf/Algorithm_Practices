/*Given a string, if the first or last chars are 'x', 
  return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") ¡ú "Hi"
withoutX("xHi") ¡ú "Hi"
withoutX("Hxix") ¡ú "Hxi"*/

public String withoutX(String str) {
  String result = "";
  for(int n = 0; n < str.length(); n++){
    if(!((n == 0 || n == str.length() - 1) && str.charAt(n) == 'x')){
      result += str.charAt(n);
    }
  }
  return result;
}

/*Solution:   (alternative)

public String withoutX(String str) {
  if (str.length() > 0 && str.charAt(0) == 'x') {
    str = str.substring(1);
  }

  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
    str = str.substring(0, str.length()-1);
  }
  
  return str;
  
  // Solution  notes: check for the 'x' in both spots. If found, use substring()
  // to grab the part without the 'x'. Check that the length is greater than 0
  // each time -- the need for the second length check is tricky to see.
  // One could .substring() instead of .charAt() to look into the string.
}*/