import java.util.Scanner;

/**
 * A virtual pet simulation game.
 */
public class VirtualPetSimulation {
    private String name;
    private int hunger;
    private int happiness;
    private int energy;

    public VirtualPetSimulation(String name) {
        this.name = name;
        this.hunger = 50;
        this.happiness = 50;
        this.energy = 50;
    }

    public void status() {
        System.out.println("\n--- " + name + "'s Status ---");
        System.out.println("Hunger: " + hunger + "/100");
        System.out.println("Happiness: " + happiness + "/100");
        System.out.println("Energy: " + energy + "/100");
    }

    public void feed() {
        System.out.println("You fed " + name + ".");
        hunger = Math.max(0, hunger - 20);
        happiness = Math.min(100, happiness + 5);
    }

    public void play() {
        if (energy < 10) {
            System.out.println(name + " is too tired to play!");
            return;
        }
        System.out.println("You played with " + name + ".");
        happiness = Math.min(100, happiness + 20);
        energy = Math.max(0, energy - 15);
        hunger = Math.min(100, hunger + 10);
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
        energy = Math.min(100, energy + 30);
        hunger = Math.min(100, hunger + 5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your pet's name: ");
        String petName = scanner.nextLine();
        VirtualPetSimulation pet = new VirtualPetSimulation(petName);

        boolean running = true;
        while (running) {
            pet.status();
            System.out.println("\nActions: 1. Feed | 2. Play | 3. Sleep | 4. Quit");
            System.out.print("Choose action: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (pet.hunger >= 100) {
                System.out.println(petName + " is starving! Game over.");
                break;
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}
