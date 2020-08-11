package webapp.models;

import javax.persistence.*;

@Entity
@Table
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String mobile1;

    @Column
    private String mobile2;

    @Column
    private String landline;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private int dealCount;

    @Column
    private String status;

    public Person() {
    }

    public Person(int id, String name, String mobile1, String mobile2, String email, String landline, String address, int dealCount, String status) {
        this.id = id;
        this.name = name;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
        this.email = email;
        this.landline = landline;
        this.address = address;
        this.dealCount = dealCount;
        this.status = status;
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

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getLandline(){
        return landline;
    }

    public void setLandline(String landline){
        this.landline = landline;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getDealCount(){
        return dealCount;
    }

    public void setDealCount(int dealCount){
        this.dealCount = dealCount;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

}
