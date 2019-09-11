package model;

import javax.persistence.*;

@Entity
@Table(name = "user_group")
public class User_Group {
    @Id
    @Column(name = "user_Group_id")
    int id;

     @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "user_id")
    User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    Group1 group;

    @Column(name ="uantity")
    int quantity;

    public User_Group() {
    }


    public User_Group(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group1 getGroup() {
        return group;
    }

    public void setGroup(Group1 group) {
        this.group = group;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
