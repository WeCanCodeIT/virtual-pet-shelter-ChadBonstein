/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package virtual.pet.shelter;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VirtualpetShelter shelter = new VirtualpetShelter();
        int userChoice;

        do {
            // We will display current students at all times


            // Display menu
            shelter.displayPets();
            menu();
            userChoice = scanner.nextInt();
            scanner.nextLine();

            
            switch (userChoice) {
                case 1:
                admitPet(scanner, shelter);

                    break;
                case 2:
                adoptPet(scanner,shelter);
                    break;
                case 3:
                shelter.feedTime();
                    break;
                case 4:
                shelter.playTime();
                    break;
                case 5:
                shelter.thirstTime();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, enter a number 1-4");
                    break;
            }

        } while (userChoice != 4);
    }

    public static void menu() {
        System.out.println("Option 1 admit");
        System.out.println("Option 2 adopt");
        System.out.println("Option 3 feed");
        System.out.println("Option 4 play");
        System.out.println("Option 5 thirst");
        System.out.println("Option 0 exit");
        System.out.print("Enter your choice: ");
    }

    public static void admitPet(Scanner scanner, VirtualpetShelter shelter){
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        Virtualpet pet = new Virtualpet(name);
        shelter.admitPet(pet);
    
    }

    public static void adoptPet(Scanner scanner, VirtualpetShelter shelter){
        shelter.displayPets();
        System.out.println("Enter pet ID of the pet you'd like adopt");
        int id = scanner.nextInt();
        shelter.checkoutPet(id);
    }
}
