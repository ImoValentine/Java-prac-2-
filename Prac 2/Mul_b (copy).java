import java.util.Scanner;
import java.util.Random;

public class Mul_b {

Random rand = new Random();

public static boolean mastered(int no, int low, int high){
	Scanner keyboard = new Scanner(System.in);	
	int correct = 0;
	for (int k=0; k<no; k++){
		int no1 = (int) (low + Math.random() * (((high-1)-low)+1));
		int no2 = (int) (low + Math.random() * (((high-1)-low)+1));
		int answer = no1 * no2;
		System.out.println("What is the answer to " + no1 + " x " + no2 + "?");
		int usersAns = keyboard.nextInt();

		if (usersAns == answer){
		correct = correct + 1;
}
		else{
		System.out.println("Your answer is wrong!");
}
}
	if (correct/(no*1.0) *100 > 80){  // forcing real number division
		return true;
}
	else{
		return false;
}
}

public static void run(){

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
		level = level + 1;
		System.out.println("That's the end of the multiplication session. You have mastered all three levels!");		
		break;
		
}
	else{
		if (level > 1)
			level = level - 1;
	
}
}
}

public static void main(String[] args) {

run();

}
}
