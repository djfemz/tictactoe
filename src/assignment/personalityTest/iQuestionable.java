package assignment.personalityTest;

public interface iQuestionable {
    Question getQuestion();
    void addQuestion(Question question);
    void addQuestions(Question... questionList);
    String getPersonalityTrait(String... response);
}
