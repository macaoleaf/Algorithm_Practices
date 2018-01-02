/*Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") ¡ú true
stringE("Heelle") ¡ú true
stringE("Heelele") ¡ú false*/

public boolean stringE(String str) {
  int count = 0;
  for(int n = 0; n <= str.length() - 1; n++){
    if(str.charAt(n) == 'e'){
      count++;
    }
  }
  return (count >= 1 && count <= 3);
}

/* since char type is not a string, "==" should be used instead of ".equals()" */