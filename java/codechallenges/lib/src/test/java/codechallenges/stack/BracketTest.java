package codechallenges.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketTest {

  @Test
  public void bracketValidatorTest(){
    assertTrue(BracketValidator.bracketValidator("{}"));
    assertTrue(BracketValidator.bracketValidator("{}(){}"));
    assertTrue(BracketValidator.bracketValidator("()[[Extra Characters]]"));
    assertTrue(BracketValidator.bracketValidator("(){}[[]]"));
    assertTrue(BracketValidator.bracketValidator("{}{Code}[Fellows](())"));
    assertFalse(BracketValidator.bracketValidator("[({}]"));
    assertFalse(BracketValidator.bracketValidator("(]("));
    assertFalse(BracketValidator.bracketValidator("{(})"));
  }
}
