/*Given a string str, if the string starts with "f" return "Fizz". 
  If the string ends with "b" return "Buzz". 
  If both the "f" and "b" conditions are true, return "FizzBuzz". 
  In all other cases, return the string unchanged.

fizzString("fig") �� "Fizz"
fizzString("dib") �� "Buzz"
fizzString("fib") �� "FizzBuzz"*/

public String fizzString(String str) {
  String change = "";
  if(str.charAt(0) == 'f'){
    change += "Fizz";
  }
  if(str.charAt(str.length() - 1) == 'b'){
    change += "Buzz";
  }else if(str.charAt(0) != 'f' && str.charAt(str.length() - 1) != 'b'){
    change = str;
  }
  return change;
}