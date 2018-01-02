/*Given a string, 
  return a new string made of every other char starting with the first, 
  so "Hello" yields "Hlo".

stringBits("Hello") �� "Hlo"
stringBits("Hi") �� "H"
stringBits("Heeololeo") �� "Hello"*/

public String stringBits(String str) {
  String result = "";
  for(int n = 0; n < str.length(); n += 2){
    result += str.charAt(n);
  }
  return result;
}