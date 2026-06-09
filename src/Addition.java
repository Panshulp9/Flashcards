public class Addition{
    public int firstNum;
    public int secondNum;
    public int answer;

    public static void main(String[] args) {
        Addition a = new Addition();
    }

    public Addition(){
        firstNum = (int)(Math.random()*101);
        secondNum = (int)(Math.random()*101);
        System.out.println(firstNum + " + " + secondNum + " = ");
        answer = firstNum + secondNum;

    }
}