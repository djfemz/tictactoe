package assignment.myerBriggs;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MyersBrigg {
            Scanner input = new Scanner(System.in);
    public  void questionA() {

    ArrayList<Response> userResponse = new ArrayList<>();
  AllResponse response = new AllResponse();

        QuestionA question1 = new QuestionA();
        ArrayList<Question> questionA = new ArrayList<>();
        questionA.add(new Question("A. expend energy, enjoy groups B. conserve energy, enjoy one on one"));
        questionA.add(new Question("A. interpret literally B. looking for meaning & possibilities"));
        questionA.add(new Question("A. logical, thinking, questioning B. empathetic, feeling, accommodating"));
        questionA.add(new Question("A. organized, orderly B. flexible, adaptable"));
        questionA.add(new Question("A. more outgoing, think out loud B. more reserved, think to yourself"));
        questionA.add(new Question("A. practical realistic, experiential B. imaginative, innovative, theoretical"));
        questionA.add(new Question("A. candid, straightforward,frank B. tactful, kind, encouraging"));
        questionA.add(new Question("A. plan, schedule B. unplanned, spontaneous"));
        questionA.add(new Question("A. seek many tasks, public activities, interaction with others"
        + "B. seek private, solitary activities with quiet to concentrate"));
        questionA.add(new Question("A. standard usual conventional B. different, novel, unique"));
        questionA.add(new Question("A. firm, tend to criticize, hold the line B. gentle, tend to appreciate, conciliate"));
        questionA.add(new Question("A. regulated, structured B. easygoing, 'live' and 'let live'"));
        questionA.add(new Question("A. external, communicative, express yourself B. internal, reticent, keep to yourself"));
        questionA.add(new Question("A. focus on here and now B. look to the future, global perspective, 'big picture'"));
        questionA.add(new Question("A. tough minded, just B. tender-hearted, merciful"));
        questionA.add(new Question("A. preparation, plan ahead B. go with the flow, adapt as you go"));
        questionA.add(new Question("A. active initiate B. reflective, deliberate"));
        questionA.add(new Question("A. facts, things, 'what is' B. ideas, dreams, 'what could be', philosophical"));
        questionA.add(new Question("A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate"));
        questionA.add(new Question("A. control, govern B. latitude, freedom"));
        question1.setQuestion(questionA);


            loopThroughQuestions(userResponse, response, questionA);
            getUserResponses(userResponse);

    }

        public void getUserResponses(ArrayList<Response> userResponse) {
                printMessage("=".repeat(35));
               printMessage("Your responses are: ");
                for (int i = 0; i < userResponse.size(); i++) {
                print("i.  " + userResponse.get(i).
                        getRecordResponse() +
                        " ");
            }
                System.out.println();
                printMessage("=".repeat(35));
                System.out.println();
                printMessage("Your trait are: ");
                loopTrait(userResponse);

        }
        private void printMessage(String message){
                System.out.println(message);
        }
        private void print(String message){
                System.out.print(message);
        }

        private void loopTrait(ArrayList<Response> userResponse) {
                int count1 = 0;
                int count2 = 0;
                for (int i = 0; i < userResponse.size(); i++) {
                    for (int j = i; j < userResponse.size(); j+=4) {
                        if (Objects.equals(userResponse.get(i).getRecordResponse(), "A")) {
                            count1++;
                        } else count2++;
                    }
                    checkForTrait(count1, count2, i);
                }
        }

    private void checkForTrait(int count1, int count2, int i) {
        if (i == 0){
            if (count1 > count2) print("E,  ");
            else print("I,  ");
        }
        if (i == 1){
            if (count1 > count2) print("S,  ");
            else print("N,  ");
        }
        if (i == 2){
           if (count1 > count2) print("T,  ");
           else print("F,  ");
       }
        if (i == 3){
           if (count1 > count2) System.out.println("J  ");
           else System.out.println("P  ");
       }
    }

    private void loopThroughQuestions(ArrayList<Response> userResponse,
                                          AllResponse response, ArrayList<Question> questionA) {
                for (int i = 0; i < questionA.size(); i++) {
                    printMessage(questionA.get(i).getQuestion());
                    String userChoice = input.next();
                    userChoice = validate(questionA, i, userChoice);
                    userResponse.add(new Response(userChoice.toUpperCase()));
                response.setResponse(userResponse);

                }
        }

    private String validate(ArrayList<Question> questionA, int i, String userChoice) {
        while (!userChoice.toUpperCase().equals("A") && !userChoice.toUpperCase().equals("B")
        || userChoice.length()!= 1){
                System.out.println("Invalid input");
                printMessage(questionA.get(i).getQuestion());
                userChoice = input.next();
        }
        return userChoice;
    }

}
