import java.util.Scanner;
public class Lab1_2 {
    public static void main(String[] arg){
        System.out.print("enter your name:");
        Scanner input = new Scanner(System.in);
        String nameOfUser = input.next();//insert a name into nameOfUser
        System.out.print("enter your age:");
        Scanner input2 = new Scanner(System.in);
        String ageOfUser = input.next();//insert an age into ageOfUser
        System.out.println("Hi " + nameOfUser + "! Welcome to CSCI 201!");
        System.out.print("You are " + ageOfUser + " years old!");
    }
}
