public class Subtraction {
        public int firstNum;
        public int secondNum;
        public int answer;

        public Subtraction(){
            firstNum = (int)(Math.random()*101);
            secondNum = (int)(Math.random()*101);
            System.out.println(firstNum + " - " + secondNum + " = ");
            answer = firstNum - secondNum;

        }
}
