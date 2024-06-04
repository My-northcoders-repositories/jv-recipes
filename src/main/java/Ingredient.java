import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;

@Entity
class Ingredient{
    @Id
    @GeneratedValue
    long id;

    String name;
    int quantity;
    String unitOfMeasure;

    @ManyToOne
    Recipe recipe;

    public Ingredient(){

    }

    public Ingredient(int quantity, String name, String unitOfMeasure) {
        this.quantity = quantity;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
    }
}
