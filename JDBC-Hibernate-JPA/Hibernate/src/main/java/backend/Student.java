package backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;

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


    // Common Annotations

    /*
    @Table(name="<>") to give the desired table name
    @Column(name="<>") to give desired column name to any specific columns required
    @Transient to make any property not get stored in table as column
    @Embeddable for using complex types as data :- This annotation is used with class that is supposed to be added as complex field...
     */
}
