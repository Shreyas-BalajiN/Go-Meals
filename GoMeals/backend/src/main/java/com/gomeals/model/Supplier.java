package com.gomeals.model;
import jakarta.persistence.*;

@Entity
@Table(name="supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sup_id")
    private int supId;
    @Column(name = "sup_address")
    private String supAddress;
    @Column(name = "sup_contact_number")
    private String supContactNumber;
    @Column(name = "sup_name")
    private String supName;
    @Column(name = "sup_email")
    private String supEmail;
    @Column(name = "govt_issued_id")
    private String govtIssuedId;
    @Column(name="sup_password")
    private String password;

//    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, orphanRemoval = true)
//    List<mealchart> supIdList= new ArrayList<>();
    public Supplier() {
    }

    public Supplier(int sup_id, String sup_address, String sup_contact_number, String sup_name, String sup_email, String govt_issued_id, String sup_password) {
        this.supId = sup_id;
        this.supAddress = sup_address;
        this.supContactNumber = sup_contact_number;
        this.supName = sup_name;
        this.supEmail = sup_email;
        this.govtIssuedId = govt_issued_id;
        this.password =sup_password;
    }

    public int getSupId() {
        return supId;
    }

    public void setSupId(int sup_id) {
        this.supId = sup_id;
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String sup_address) {
        this.supAddress = sup_address;
    }

    public String getSupContactNumber() {
        return supContactNumber;
    }

    public void setSupContactNumber(String sup_contact_number) {
        this.supContactNumber = sup_contact_number;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String sup_name) {
        this.supName = sup_name;
    }

    public String getSupEmail() {
        return supEmail;
    }

    public void setSupEmail(String sup_email) {
        this.supEmail = sup_email;
    }

    public String getGovtIssuedId() {
        return govtIssuedId;
    }

    public void setGovtIssuedId(String govt_issued_id) {
        this.govtIssuedId = govt_issued_id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
