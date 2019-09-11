package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    int id;
    @Column(name = "user_name")
    String username;
    @Column(name = "password")
    String password;
    @OneToMany(mappedBy = "user")
    List<User_Group> user_groupList=new ArrayList<>();

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User_Group> getUser_groupList() {
        return user_groupList;
    }

    public void setUser_groupList(List<User_Group> user_groupList) {
        this.user_groupList = user_groupList;
    }
    public void addusergroup(User_Group user_group){
        this.user_groupList.add(user_group);
    }
}
