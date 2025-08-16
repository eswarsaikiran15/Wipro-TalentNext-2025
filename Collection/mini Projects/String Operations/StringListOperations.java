import java.util.*;

public class StringListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> items = new ArrayList<>();

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    String insertItem = sc.nextLine();
                    items.add(insertItem);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter the item to search : ");
                    String searchItem = sc.nextLine();
                    if (items.contains(searchItem)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the item to delete : ");
                    String deleteItem = sc.nextLine();
                    if (items.remove(deleteItem)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4:
                    System.out.println("The Items in the list are :");
                    for (String item : items) {
                        System.out.println(item);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
