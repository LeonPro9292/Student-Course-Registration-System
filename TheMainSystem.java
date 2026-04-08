import java.util.Scanner;
public class TheMainSystem {
	//int chose;
	//if (console.hasNextInt()){
	//choice=console,nextInt();
	//} else { 
	//return;
	//}
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		String choice;
		boolean loop = true;

		System.out.println("welcome to my skibbity land!!");
		System.out.println("please pick what you want to do");
		System.out.println("___________________________________________________________________");
		System.out.println("1. Do a backflip");
		System.out.println("2. Add student");
		System.out.println("3. Add course ");
		System.out.println("4. View all students");
		System.out.println("5. View all courses");
		System.out.println("6. Exit");
		System.out.println("___________________________________________________________________");


		while (loop==true) {

			choice=console.nextLine();
			if (choice.equals("1")) {
				System.out.println("YAY YOU DID A BACKFLIP... now what??");

			}
			else if (choice.equals("2")) {
				System.out.println("Student has been added");

			}
			else if (choice.equals("3")) {
				System.out.println("course has been added");

			}
			else if (choice.equals("4")) {
				System.out.println("placeholder, you are looking at all the students");

			}
			else if (choice.equals("5")) {
				System.out.println("placeholder, you are looking at all the courses");

			}
			else if (choice.equals("6")) {
				System.out.println("You have left, goodbye");
				break;

			}
			else {
				System.out.println("That is not a number you can choose");
			}
		}




		//switch (chose) {
		//do case # then :
		//end with default
		//end eatch case with break;
	}

}
