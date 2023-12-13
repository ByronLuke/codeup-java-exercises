import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        //System.out.printf("% 4d", intValue);
        System.out.printf("The value of pi is approximately %.2f", pi);
        System.out.println();
        System.out.println(nextInt());
        System.out.println(threeWords());
        System.out.println(sentence());
        System.out.println(perimeterAndArea());
    }
    public static int nextInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }
    public static String threeWords(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();
        System.out.print("Enter third word: ");
        String thirdWord = scanner.nextLine();
        return firstWord + "\n" + secondWord + "\n" + thirdWord;
    }
    public static String sentence(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        // String sentence = scanner.next(); This will not work as you need next line
        String sentence = scanner.nextLine();
        return "Your sentence was: " + sentence;
    }
    public static String perimeterAndArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("What is the length: ");
        double length = Double.parseDouble(scanner.nextLine());
        double perimeter = (width * 2) + (length*2);
        double area = length * width;
        return "Area is: " + area + "\n Perimeter is: " + perimeter;
    }
}
