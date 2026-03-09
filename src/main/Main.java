package main;

import service.UserService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void mainMenu(){
        System.out.println("WELCOME!");
        System.out.println("Choose your action: ");
        System.out.println("1 - CREATE USER");
        System.out.println("2 - READ USER");
        System.out.println("3 - UPDATE USER");
        System.out.println("4 - DELETE USER");
        System.out.println("5 - LIST USERS");
    }

    public static void main(String[] args) {

        UserService userService = new UserService();
        int option = 1;

        Scanner scanner = new Scanner(System.in);

        while(option != 0){
            mainMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1){
                System.out.println("Please provide the user information!");
                System.out.println("NAME:");
                String name = scanner.nextLine();

                System.out.println("BIRTH DATE (AAAA-MM-DD): ");
                String dateInput = scanner.nextLine();
                LocalDate birthDate = LocalDate.parse(dateInput);

                System.out.println("PROFESSION: ");
                String profession = scanner.nextLine();

                try{
                    userService.createUser(name, birthDate, profession);

                    System.out.println("USER REGISTERED");
                }catch(Exception e){
                    System.out.println(e);
                }

            }
            else if(option == 2){
                System.out.println("Please provide the user information!");
                System.out.println("ID: ");
                int id = scanner.nextInt();

                try{
                    userService.readUser(id);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            else if (option == 3){
                System.out.println("Please provide the user information!");
                System.out.println("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("NEW NAME:");
                String name = scanner.nextLine();

                System.out.println("NEW BIRTH DATE (AAAA-MM-DD): ");
                String dateInput = scanner.nextLine();
                LocalDate birthDate = LocalDate.parse(dateInput);

                System.out.println("NEW PROFESSION: ");
                String profession = scanner.nextLine();

                try{
                    userService.updateUser(id, name, birthDate, profession);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            else if(option == 4){
                System.out.println("Please provide the user information!");
                System.out.println("ID: ");
                int id = scanner.nextInt();

                userService.deleteUser(id);
            }
            else if(option == 5){
                userService.listUsers();
            }

        }

    }
}