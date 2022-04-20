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


public class Multiplication_b {
public static void main(String[] args) {

int level = 1;
int left, right, noOfSums;
while (true){
	if (level == 1){
		left = 2;
		right = 5;
		noOfSums = 10;
}
	else{
		if (level == 2){
			left = 6;
			right = 9;
			noOfSums = 13;
}
		else{
			left = 10;
			right = 13;
			noOfSums = 18;
}}
	if (mastered(noOfSums, left, right)){
		System.out.println("Now stepping up to the next level");
		level = level + 1;
	}
	else{
		if (level > 1){
			System.out.println("Now stepping down a level");
			level = level - 1;
}}
	if (level > 3){ //then exit the while loop
		break;

System.out.println("That's the end of the multiplication session. You have mastered all three levels!");

		level = level + 1;
}
	else{
		if (level > 1)
			level = level - 1;
	}
	if (level > 3) //then exit the while loop
		break;

System.out.println("That's the end of the multiplication session. You have mastered all three levels!");
}

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


