import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    ArrayList<Addition> addProbs;
    ArrayList<Subtraction> subProbs;
    ArrayList<Multiplication> multiProbs;
    ArrayList<Division> divProbs;
    public int numOfQuestions;
    public static void main(String[] args) {
        Main flashcards = new Main();
        String[] subjects = {"Math, Science, History, Language"};
    }
    public Main(){
        addProbs = new ArrayList<>();
        subProbs = new ArrayList<>();
        multiProbs = new ArrayList<>();
        divProbs = new ArrayList<>();
        System.out.println("Here are the subjects: Math, Science, History, and Language");
        System.out.println("What would you like to work on today?");
        Scanner subjects = new Scanner(System.in);
        String subjectResponce = subjects.nextLine();
        if (subjectResponce.equalsIgnoreCase("Math")){
            System.out.println("What skill would you like to work on today? (Addition, Subtraction, Division, Multiplication)");
            Scanner skill = new Scanner(System.in);
            String function = skill.nextLine();
            if (function.equalsIgnoreCase("Addition")){
                System.out.println("How many questions would you like?");
                Scanner mathProblems = new Scanner(System.in);
                String numQuestions = mathProblems.nextLine();
                numOfQuestions = Integer.parseInt(numQuestions);
                mathMains();
                for (int x = 0; x < numOfQuestions; x++){
                    addProbs.add(new Addition());
                    addProbs.get(x);
                }
            }

        }

    }
    public void mathMains(){



    }
}