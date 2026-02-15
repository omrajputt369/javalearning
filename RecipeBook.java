import java.util.*;

/**
 * A simple Recipe Book to store and retrieve cooking recipes.
 */
class Recipe {
    String name;
    List<String> ingredients;

    public Recipe(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Recipe: " + name + "\nIngredients: " + String.join(", ", ingredients);
    }
}

public class RecipeBook {
    private static List<Recipe> recipes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nRecipe Book");
            System.out.println("1. Add Recipe");
            System.out.println("2. View All Recipes");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter recipe name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ingredients (comma separated): ");
                    String[] ingredientArray = scanner.nextLine().split(",");
                    recipes.add(new Recipe(name, Arrays.asList(ingredientArray)));
                    System.out.println("Recipe added.");
                    break;
                case 2:
                    if (recipes.isEmpty()) {
                        System.out.println("Recipe book is empty.");
                    } else {
                        for (Recipe r : recipes) {
                            System.out.println(r);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
