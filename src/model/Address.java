package model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
            @GeneratedValue(strategy =GenerationType.IDENTITY)
    int address_id;
    @Column(name = "villagename")
    String villagename;
    @Column(name = "amout")
    int amount;
    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
    Student student;
    public Address() {
    }

    public Address(String villagename, int amount) {
        this.villagename = villagename;
        this.amount = amount;
    }



    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getVillagename() {
        return villagename;
    }

    public void setVillagename(String villagename) {
        this.villagename = villagename;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", villagename='" + villagename + '\'' +
                ", amount=" + amount +
                '}';
    }
}
