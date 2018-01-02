/*Given 2 int values greater than 0, 
  return whichever value is nearest to 21 without going over. 
  Return 0 if they both go over.

blackjack(19, 21) ¡ú 21
blackjack(21, 19) ¡ú 21
blackjack(19, 22) ¡ú 19*/

public int blackjack(int a, int b) {
  int aTo21 = 21 - a;
  int bTo21 = 21 - b;
  if(aTo21 < 0 && bTo21 < 0){
    return 0;
  }else if(aTo21 < 0){
    return b;
  }else if(bTo21 < 0){
    return a;
  }else{
    if(aTo21 < bTo21){
      return a;
    }else{
      return b;
    }
  }
}

/*Solution:

public int blackjack(int a, int b) {
  // The value of a/b, or 0 if over 21
  int aVal = a;
  if (aVal > 21) {
    aVal = 0;
  }
  int bVal = b;
  if (bVal > 21) {
    bVal = 0;
  }
  
  // Now it works to just return whichever is larger.
  if (aVal > bVal) {
    return aVal;
  }
  else {
    return bVal;
  }
  
  // You can write a very short version of this same strategy
  // using the "ternary operator" ?: and Math.max()
}*/