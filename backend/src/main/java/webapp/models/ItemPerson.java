package webapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class ItemPerson {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String brand;

    @Column
    private String deliverTo;

    @Column
    private int quantity;

    @Column
    private int price;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Deals.class)
    @JoinColumn(name = "itemPersonId", referencedColumnName = "id")
    private List<Deals> deals = new ArrayList<>();

    public ItemPerson() {
    }

    public ItemPerson(String brand, String deliverTo, int quantity, int price) {
        this.brand = brand;
        this.deliverTo = deliverTo;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(String deliverTo) {
        this.deliverTo = deliverTo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Deals> getDeals() {
        return deals;
    }

    public void setDeals(List<Deals> deals) {
        this.deals = deals;
    }
}
