package webapp.models;

import javax.persistence.*;

@Entity
@Table
public class ItemPerson {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private int personId;

    @Column
    private int itemId;

    @Column
    private String brand;

    @Column
    private String deliverTo;

    @Column
    private int quantity;

    @Column
    private int price;

    public ItemPerson() {
    }

    public ItemPerson(int id, int personId, int itemId, String brand, String deliverTo, int quantity, int price) {
        this.id = id;
        this.personId = personId;
        this.itemId = itemId;
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

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
}
