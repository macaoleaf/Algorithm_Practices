/*Given a string, 
  return a string made of the chars at indexes 0,1, 4,5, 8,9 ... 
  so "kittens" yields "kien".

altPairs("kitten") ¡ú "kien"
altPairs("Chocolate") ¡ú "Chole"
altPairs("CodingHorror") ¡ú "Congrr"*/

public String altPairs(String str) {
  String result = "";
  for(int n = 0; n < str.length(); n++){
    if(n % 2 != 0){
      result += str.charAt(n);
      n += 2;
      }else{
      result += str.charAt(n);
    }
  }
  return result;
}