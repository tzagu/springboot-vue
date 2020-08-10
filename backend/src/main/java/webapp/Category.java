package webapp;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Table;

@DynamicUpdate
@Table(name="category")
public class Category {
}
