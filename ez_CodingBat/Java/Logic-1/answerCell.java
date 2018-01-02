/*Your cell phone rings. Return true if you should answer it. Normally you answer, 
  except in the morning you only answer if it is your mom calling. 
  In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) ¡ú true
answerCell(false, false, true) ¡ú false
answerCell(true, false, false) ¡ú false*/

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  boolean answer = false;
  if(!isAsleep){
    if(!isMorning){
      answer = true;
    }else{
      if(isMom){
        answer = true;
      }
    }
  }
  return answer;
}

/*Solution:

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isAsleep) {
    return false;
  }
  
  if (isMorning && !isMom) {
    return false;
  }
  
  return true;
  
  // Solution notes: write code to detect each of the false cases.
  // Deal with one case at a time to keep it simple.
  // Avoid using == true in tests; use the variables directly as shown here.
}

Comment: easier to write this code if use true as default*/