package model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "studentId")
    private int id;
    @Column(name = "fname")
    private String fristName;
    @Column(name = "lname")
    private String lastName;
    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "student",cascade = CascadeType.ALL)
    private List<Shoes> shoess;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "address_id")
    Address address;
    public Student() {
    }

    public Student(int id, String fristName, String lastName, String email) {
        this.id = id;
        this.fristName = fristName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Shoes> getShoess() {
        return shoess;
    }

    public void setShoess(List<Shoes> shoess) {
        this.shoess = shoess;
    }

    public void add(Shoes shoes){
        if(shoess==null){
            shoess=new ArrayList<>();
        }
        shoess.add(shoes);
        shoes.setStudent(this);
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", fristName='" + fristName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", shoess=" + shoess +
//                ", address=" + address +
//                '}';
//    }
}
