/*Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) ¡ú {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) ¡ú {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) ¡ú {"c": true}*/

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Integer> map = new HashMap();
  Map<String, Boolean> result = new HashMap();
  for(String tempCount : strings){
    if(map.containsKey(tempCount)){
      map.put(tempCount, map.get(tempCount)+1);
    }else{
      map.put(tempCount, 1);
    }
  }
  for(String tempJudge : strings){
    if(map.get(tempJudge) >= 2){
      result.put(tempJudge, true);
    }else{
      result.put(tempJudge, false);
    }
  }
  return result;
}