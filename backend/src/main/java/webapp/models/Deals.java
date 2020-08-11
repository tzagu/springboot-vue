package webapp.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Deals {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private int personItemId;

    //not adding person 1 id as a column because the personItemId (above) can reach to the person 1
    //hence the person 1 is assumed to be the seller while person 2 should be the buyer of the deal
    @Column
    private int person2;

    @Column
    @CreationTimestamp
    private Date date;

    public Deals(int id, int personItemId, int person2, Date date) {
        this.id = id;
        this.personItemId = personItemId;
        this.person2 = person2;
        this.date = date;
    }

    public Deals() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonItemId() {
        return personItemId;
    }

    public void setPersonItemId(int personItemId) {
        this.personItemId = personItemId;
    }

    public int getPerson2() {
        return person2;
    }

    public void setPerson2(int person2) {
        this.person2 = person2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

