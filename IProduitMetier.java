import java.util.List;

public interface IProduitMetier {
    void add(Product product);
    List<Product> getAll();
    Product findById(long id);
    void delete(long id);
    void saveAll();
}
