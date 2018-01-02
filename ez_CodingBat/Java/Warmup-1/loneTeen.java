/*We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 Given 2 int values, return true if one or the other is teen, but not both.
 
 loneTeen(13, 99) ¡ú true
 loneTeen(21, 19) ¡ú true
 loneTeen(13, 13) ¡ú false*/

public boolean loneTeen(int a, int b) {
  if(a >= 13 && a <= 19){
    return (b < 13 || b > 19);
  }
  if(b >= 13 && b <= 19){
    return (a < 13 || a > 19);
  }else{
    return false;
  }
}

/*Answer:
 public boolean loneTeen(int a, int b) {
 // Store teen-ness in boolean local vars first. Boolean local
 // vars like this are a little rare, but here they work great.
 boolean aTeen = (a >= 13 && a <= 19);
 boolean bTeen = (b >= 13 && b <= 19);
 
 return (aTeen && !bTeen) || (!aTeen && bTeen);
 // Translation: one or the other, but not both.
 // Alternately could use the Java xor operator, but it's obscure.
 }*/