package annotations;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "HIB_Ingredients")
public class Ingredient implements Serializable {

    int ingredientId;
    String name;
    int amountOfUnits;
    String unitName;
    Set<Product> products = new HashSet<Product>();

    @ManyToMany
    @JoinTable(name = "HIB_PRODUCT_INGREDIENTS",
    joinColumns =
    @JoinColumn(name = "FK_IngredientId"),
    inverseJoinColumns =
    @JoinColumn(name = "FK_ProductId"))
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfUnits() {
        return amountOfUnits;
    }

    public void setAmountOfUnits(int amountOfUnits) {
        this.amountOfUnits = amountOfUnits;
    }

    @Transient
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
