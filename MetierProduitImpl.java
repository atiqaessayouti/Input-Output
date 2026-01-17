import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IProduitMetier {

    private List<Product> products = new ArrayList<>();
    private final String filename = "products.dat";

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            products = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, returning empty list.");
            products = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
