package assignment.personalityTest;

import java.util.ArrayList;
import java.util.Objects;

import static assignment.personalityTest.PersonalityTrait.*;

public class Questionnaire implements iQuestionable{
    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<UserResponse> userResponses = new ArrayList<>();
    private static int count = 0;

    public Question getQuestion() {
        Question question = questions.get(count);
        count++;
        return question;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void addQuestions(Question... questionList) {
        for (Question question : questionList) {
            addQuestion(question);
        }
    }

    public void setResponse(UserResponse userResponse) {
        userResponses.add(userResponse);
    }

    public String getPersonalityTrait(String... response) {
        PersonalityTrait introvertOrExtrovert = getIntrovertOrExtrovert(response);
        PersonalityTrait sensitiveOrIntuition = getSensitiveOrIntuition(response);
        PersonalityTrait feelerOrThinker = getFeelerOrThinker(response);
        PersonalityTrait judgingOrPerception = getJudgingOrPerception(response);
        return introvertOrExtrovert.getCode() + sensitiveOrIntuition.getCode()
                + feelerOrThinker.getCode() + judgingOrPerception.getCode();
    }

    private PersonalityTrait getJudgingOrPerception(String... response) {
        OptionDto optionDto = new OptionDto(3,  JUDGING, PERCEPTION, response);
        return getPersonalityTrait(optionDto);

//        int counterForJ = 0;
//        int counterForP = 0;
//        for (int index = 3; index < response.length; index += 4) {
//            if (Objects.equals(response[index], "A")) counterForJ++;
//            if (Objects.equals(response[index], "B")) counterForP++;
//        }
//        if (counterForP > counterForJ) return PERCEPTION;
//        else return JUDGING;
    }

    private PersonalityTrait getPersonalityTrait(OptionDto optionDto) {
        int optionA = 0;
        int optionB = 0;

        for (int index = optionDto.start(); index < optionDto.response().length; index += 4) {
            if (Objects.equals(optionDto.response()[index], "A")) optionA++;
            if (Objects.equals(optionDto.response()[index], "B")) optionB++;
        }
        if (optionA > optionB) return optionDto.firstTrait();
        else return optionDto.secondTrait();
    }


    private PersonalityTrait getFeelerOrThinker(String... response) {
        OptionDto optionDto = new OptionDto(2,  THINKER, FEELER, response);
        return getPersonalityTrait(optionDto);
    }

    private PersonalityTrait getSensitiveOrIntuition(String... response) {
        OptionDto optionDto = new OptionDto(2, INTUITION, SENSITIVE, response);
        return getPersonalityTrait(optionDto);
    }


    public PersonalityTrait getIntrovertOrExtrovert(String... response) {
        OptionDto optionDto = new OptionDto(2,  EXTROVERT, INTROVERT, response);
        return getPersonalityTrait(optionDto);
    }
}
