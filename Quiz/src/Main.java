import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;
        System.out.println("How old are you?");
        age = myScanner.nextInt();
        System.out.println("What is your first name?");
        firstName = myScanner.next();
        System.out.println("What is your favorite food?");
        favoriteFood = myScanner.next();
        System.out.println("First name: " + firstName + "\n\nAge: " + age + "\n\nFavorite food: " + favoriteFood);
        
        }
    }