package webapp.model;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@DynamicUpdate
@Entity
@Table(appliesTo = "category")
public class Category {

    @Id
    @GeneratedValue
    int Id;

    @Colu
}
