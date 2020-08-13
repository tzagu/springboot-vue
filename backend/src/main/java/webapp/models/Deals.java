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

    @Column
    private int person1;

    @Column
    private int person2;

    @Column
    @CreationTimestamp
    private Date date;

    public Deals(int id,int person1, int personItemId, int person2, Date date) {
        this.id = id;
        this.personItemId = personItemId;
        this.person1 = person1;
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

