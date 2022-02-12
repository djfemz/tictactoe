package assignment;

import java.util.Objects;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {
          public static   Scanner userChoice = new Scanner(System.in);
    public static void main(String[] args) {
        QuestionsOnBehaviouralTraits();
    }

    private static void QuestionsOnBehaviouralTraits() {
    String [] userTraits = new String[20];
    userTraits[0] = "A. expend energy, enjoy groups   B.   conserve energy, enjoy one on one";
    userTraits[1] = "A. interpret literally   B.   looking for meaning & possibilities";
    userTraits[2] = "A. logical, thinking, questioning   B.   empathetic, feeling, accommodating";
    userTraits[3] = "A. organized, orderly   B.   flexible, adaptable";
    userTraits[4] = "A. more outgoing, think out loud   B.  more reserved, think to yourself";
    userTraits[5] = "A. practical realistic, experiential   B.  imaginative, innovative, theoretical";
    userTraits[6] = "A. candid, straightforward,frank   B.  tactful, kind, encouraging";
    userTraits[7] = "A. plan, schedule   B.  unplanned, spontaneous";
    userTraits[8] = "A. seek many tasks, public activities, interaction with others   B. " +
            " seek private, solitary activities with quiet to concentrate";
    userTraits[9] = "A. standard usual conventional   B.  different, novel, unique";
    userTraits[10] = "A. firm, tend to criticize, hold the line   B.  gentle, tend to appreciate, conciliate";
    userTraits[11] = "A. regulated, structured   B.  easygoing, 'live' and 'let live'";
    userTraits[12] = "A. external, communicative, express yourself   B.  internal, reticent, keep to yourself";
    userTraits[13] = "A. focus on here and now   B.  look to the future, global perspective, 'big picture'";
    userTraits[14] = "A. tough minded, just   B.  tender-hearted, merciful";
    userTraits[15] = "A. preparation, plan ahead   B.  go with the flow, adapt as you go";
    userTraits[16] = "A. active initiate   B.  reflective, deliberate";
    userTraits[17] = "A. facts, things, 'what is'   B.  ideas, dreams, 'what could be', philosophical";
    userTraits[18] = "A. matter of fact, issue-oriented   B.  sensitive, people-oriented, compassionate";
    userTraits[19] = "A. control, govern  B.  latitude, freedom";

        loopingThroughTheQuestion(userTraits);
    }

    public static void loopingThroughTheQuestion(String[] array){
        String [] userResponse = new String[20];
        for (int i = 0; i < array.length; i++) {
            output(array[i]);
            String response = userChoice.next();
            response = validate(array[i], response);

            userResponse[i] = response.toUpperCase();
        }
        System.out.println();
        printUserResponse(userResponse);
        System.out.println();
        System.out.println();
        output("Your character traits are: ");
        checkTraitForIntrovertOrExtrovert(userResponse);
        checkTraitForSensitiveOrIntuition(userResponse);
        checkTraitForThinkerOrFeeler(userResponse);
        checkTraitForJudgementOrPerception(userResponse);
    }

    private static String validate(String input, String response) {
        while (!response.toUpperCase().equals("A") && !response.toUpperCase().equals("B")
            || response.length() != 1){
            System.out.println("Invalid response");
            output(input);
            response = userChoice.next();
        }
        return response;
    }

    private static void printUserResponse(String [] userResponse){
        int count = 1;
        output("Your responses are: ");
        for (String s : userResponse) {

            System.out.print(count++ + ". " + s + "  ");
            if (count % 11 == 0) System.out.println();
        }
    }
    private static void output(String input){
        System.out.println(input);
    }

    private static void checkTraitForIntrovertOrExtrovert(String [] userResponse){
        String value = "A";
        String value2 = "B";
        int total = 0;
        int total1 = 0;

        for (int i = 0; i < userResponse.length; i= i + 4) {
            if (Objects.equals(userResponse[i], value)){
                total++;
            }
            else if (Objects.equals(userResponse[i],value2)){
                total1++;
            }

        }
        if (total > total1) output("Extrovert");
        else output("Introvert");
    }
    private static void checkTraitForSensitiveOrIntuition(String [] userResponse){
        String value = "A";
        String value2 = "B";
        int total = 0;
        int total1 = 0;

        for (int i = 1; i < userResponse.length; i= i + 4) {
            if (Objects.equals(userResponse[i], value)){
                total++;
            }
            else if (Objects.equals(userResponse[i],value2)){
                total1++;
            }

        }
        if (total > total1) output("Sensitive");
        else output("Intuitive");
    }
    private static void checkTraitForThinkerOrFeeler(String [] userResponse){
        String value = "A";
        String value2 = "B";
        int total = 0;
        int total1 = 0;

        for (int i = 2; i < userResponse.length; i= i + 4) {
            if (Objects.equals(userResponse[i], value)){
                total++;
            }
            else if (Objects.equals(userResponse[i],value2)){
                total1++;
            }

        }
        if (total > total1) output("Thinker");
        else output("Feeler");
    }
    private static void checkTraitForJudgementOrPerception(String [] userResponse){
        String value = "A";
        String value2 = "B";
        int total = 0;
        int total1 = 0;

        for (int i = 3; i < userResponse.length; i= i + 4) {
            if (Objects.equals(userResponse[i], value)){
                total++;
            }
            else if (Objects.equals(userResponse[i],value2)){
                total1++;
            }

        }
        if (total > total1) output ("Judging");
        else output("Perception");
    }


}
