package model;

import javax.persistence.*;

@Entity
@Table(name = "shoes")
public class Shoes {
    @Id
    @Column(name = "shoe_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int shoeid;
    @Column(name = "shoe_name")
    String shname;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student")
    Student student;

    public Shoes() {
    }

    public Shoes(String shname) {
        this.shname = shname;
    }

    public String getShname() {
        return shname;
    }

    public void setShname(String shname) {
        this.shname = shname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "shoeid=" + shoeid +
                ", shname='" + shname + '\'' +
                ", student=" + student +
                '}';
    }
}
