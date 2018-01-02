/*Given a string and a non-negative int n, 
  we'll say that the front of the string is the first 3 chars, 
  or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) ¡ú "ChoCho"
frontTimes("Chocolate", 3) ¡ú "ChoChoCho"
frontTimes("Abc", 3) ¡ú "AbcAbcAbc"*/

public String frontTimes(String str, int n) {
  String result = "";
  for(int x = 0; x < n; x++){
    if(str.length() <= 3){
      result += str;
    }else{
      result += str.substring(0,3);
    }
  }
  return result;
}