import java.util.Scanner;
import java.util.Random;

class Machine {
int num1, num2, ans, att; 
int score = 0; 
Random rand = new Random();
Scanner in = new Scanner(System.in);

public void sumGenerator(){
num1 = rand.nextInt(10);
num2 = rand.nextInt(10);
ans = num1 * num2;

System.out.println(num1 +  " * " + num2 );
}//sumGenerator Method

public void answerGetter_score(){
    att = in.nextInt();
    if(att == ans){
        score = score + 1;
        System.out.println("Correct");
        System.out.println("Score is currently: " + score + "/10");
    }else{
        score = score - 1;
        System.out.println("Incorrect answer");
        System.out.println("Score is currently: " + score + "/10");
    }//else
}//answer Getter method
}//machine class


public class Multiplication {
public static void main(String[] args) {
Machine machine1 = new Machine();
System.out.println("***Welcome this is a  Multiplication test***");

for(int i=10; i>0; i--){
machine1.sumGenerator();
machine1.answerGetter_score();

System.out.println("Thanks for taking the test.");
                    }
                      }
}
//main method

