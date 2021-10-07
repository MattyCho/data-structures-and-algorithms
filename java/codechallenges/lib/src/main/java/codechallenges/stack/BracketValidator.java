package codechallenges.stack;

public class BracketValidator {

  public static boolean bracketValidator(String string) {
    Stack newStack = new Stack();
    for (int i = 0; i < string.length(); i++) {
      char currentChar = string.charAt(i);
      if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
        newStack.push(currentChar);
      } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
        if (newStack.isEmpty()) {
          return false;
        } else {
          char topStack = (char) newStack.peek();
          if (currentChar == ')' && topStack == '(') {
            newStack.pop();
          } else if (currentChar == '}' && topStack == '{') {
            newStack.pop();
          } else if (currentChar == ']' && topStack == '[') {
            newStack.pop();
          } else {
            return false;
          }
        }
      }
    }
    if (!newStack.isEmpty()) {
      return false;
    }
    return true;
  }
}
