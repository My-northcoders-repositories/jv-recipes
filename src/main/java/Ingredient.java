import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    long id;

    String name;
    int quantity;
    String unitOfMeasure;

    public Ingredient(int quantity, String name, String unitOfMeasure) {
        this.quantity = quantity;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
    }
}
