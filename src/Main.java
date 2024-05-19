import java.util.Scanner;

public class Main {
    Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        Main mainObject = new Main();
        Scanner scanner = new Scanner(System.in);
         while(true){
            System.out.println("Hello and welcome to lab 6 please enter your mode here. If you don`t know about mode just type 7 to get a help");
            int mode = scanner.nextInt();
            try {
                mainObject.cases(mode);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid mode number.");
            }

        }
    }
    private void cases(int mode) {
        double radius,height,square;

        switch (mode) {
            case 1:
                System.out.println("Enter your radius: ");
                radius = Double.parseDouble(scr.nextLine());
                Ball ball = new Ball(radius);
                System.out.println("your volume of your ball is: " + ball.getVolume());
                return;
            case 2:
                System.out.println("Enter your square: ");
                square = Double.parseDouble(scr.nextLine());
                System.out.println("Enter your height: ");
                height = Double.parseDouble(scr.nextLine());
                Pyramid pyramid = new Pyramid(square, height);
                System.out.println("The volume of your pyramid is: " + pyramid.getVolume());
                return;
            case 3:
                System.out.println("Enter your radius: ");
                radius = Double.parseDouble(scr.nextLine());
                System.out.println("Enter your height: ");
                height = Double.parseDouble(scr.nextLine());
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("The volume of your cylinder is: " + cylinder.getVolume());
                return;

            case 4:
                Person son = new Person();
                System.out.println("Enter your name: ");
                son.fullName = scr.nextLine();
                System.out.println("Enter your age: ");
                son.age = Integer.parseInt(scr.nextLine());
                System.out.println("Name: " + son.fullName + ", Age: " + son.age);
                son.Move();
                son.Talk();
                return;

            case 5:
                System.out.println("Enter your model: ");
                String model = scr.nextLine();
                System.out.println("Enter your color: ");
                String color = scr.nextLine();
                System.out.println("Enter your max speed: ");
                int maxSpeed = Integer.parseInt(scr.nextLine());
                Sedan sedan = new Sedan(model, color, maxSpeed);
                Truck truck = new Truck();
                sedan.Gas();
                sedan.Brake();
                sedan.GetInfo();
                truck.Brake();
            return;
            case 6:
                System.out.println("Good bye! See you soon!");
                System.exit(0);

            case 7:
                System.out.println("1 - get volume of your ball");
                System.out.println("2 - get volume of your pyramid");
                System.out.println("3 - get volume of your cylinder");
                System.out.println("4 - Name and age");
                System.out.println("5 - sedan and truck");
                System.out.println("6 - end of program");
                System.out.println("7-  commands\n");
                return;
        }
    }
}
