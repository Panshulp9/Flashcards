public class Division {
    public int firstNum;
    public int secondNum;
    public int answer;

    public Division(){
        firstNum = (int)(Math.random()*101);
        secondNum = (int)(Math.random()*101);
        System.out.println(firstNum + " / " + secondNum + " = ");
        answer = firstNum / secondNum;

    }
}
