package questions;

public abstract class AbstractQuestion implements Question {
  protected final String question;

  protected AbstractQuestion(String question) throws IllegalArgumentException {
    if (question.trim().equals("")) {
      throw new IllegalArgumentException("Question cant be empty");
    }
    this.question = question;
  }

  public String getText() {
    return question;
  }

  public int compareToTrueFalse(Question o) {
    return -1;
  }

  public int compareToLikert(Question o) {
    return 1;
  }

  public int compareToMultipleChoice(Question o) {
    if (o instanceof TrueFalse) {
      return 1;
    }
    return -1;
  }

  public int compareToMultipleSelect(Question o) {
    if (o instanceof TrueFalse | o instanceof MultipleChoice) {
      return 1;
    }
    return -1;
  }
}
