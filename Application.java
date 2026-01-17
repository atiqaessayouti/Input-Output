import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl service = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all products");
            System.out.println("2. Search product by ID");
            System.out.println("3. Add new product");
            System.out.println("4. Delete product by ID");
            System.out.println("5. Save products");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    List<Product> all = service.getAll();
                    all.forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Enter product ID: ");
                    long idSearch = Long.parseLong(sc.nextLine());
                    Product p = service.findById(idSearch);
                    if (p != null) System.out.println(p);
                    else System.out.println("Product not found.");
                    break;

                case 3:
                    System.out.print("ID: ");
                    long id = Long.parseLong(sc.nextLine());
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Price: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Stock: ");
                    int stock = Integer.parseInt(sc.nextLine());

                    Product newProd = new Product(id, name, brand, price, desc, stock);
                    service.add(newProd);
                    System.out.println("Product added.");
                    break;

                case 4:
                    System.out.print("Enter product ID to delete: ");
                    long idDel = Long.parseLong(sc.nextLine());
                    service.delete(idDel);
                    System.out.println("Product deleted if existed.");
                    break;

                case 5:
                    service.saveAll();
                    System.out.println("Products saved to file.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
