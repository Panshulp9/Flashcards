public class Multiplication {
    public int firstNum;
    public int secondNum;
    public int answer;

    public Multiplication(){
        firstNum = (int)(Math.random()*101);
        secondNum = (int)(Math.random()*101);
        System.out.println(firstNum + " * " + secondNum + " = ");
        answer = firstNum * secondNum;

    }
}
