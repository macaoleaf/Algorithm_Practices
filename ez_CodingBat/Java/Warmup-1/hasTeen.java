/*We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 Given 3 int values, return true if 1 or more of them are teen.
 
 hasTeen(13, 20, 10) ¡ú true
 hasTeen(20, 19, 10) ¡ú true
 hasTeen(20, 10, 13) ¡ú true */

public boolean hasTeen(int a, int b, int c) {
  boolean teen = false;
  if (a >= 13 && a<=19){
    teen = true;
  }else if (b >= 13 && b<=19){
    teen = true;
  }else if (c >= 13 && c<=19){
    teen = true;
  }else{
    teen = false;
  }
  return teen;
}

/*Answer:
 public boolean hasTeen(int a, int b, int c) {
 // Here it is written as one big expression,
 // vs. a series of if-statements.
 return (a>=13 && a<=19) ||
 (b>=13 && b<=19) ||
 (c>=13 && c<=19);
 }*/