package chapter12;

import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("scores1.txt");

        Scanner input = new Scanner(file);

        while (input.hasNext()){
            String firstName = input.next();
            String lastName = input.next();
            int number = input.nextInt();
            System.out.println("First name " + firstName + " Last name " + lastName + " number " + number);
        }
        input.close();
    }
}
