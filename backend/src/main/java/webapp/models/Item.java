package webapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = ItemPerson.class)
    @JoinColumn(name = "itemId", referencedColumnName = "id")
    private List<ItemPerson> itemPersonList = new ArrayList<>();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemPerson> getItemPersonList() {
        return itemPersonList;
    }

    public void setItemPersonList(List<ItemPerson> itemPersonList) {
        this.itemPersonList = itemPersonList;
    }
}
