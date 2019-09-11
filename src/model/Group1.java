package model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GROUP11")
public class Group1 {
    @Id
    @Column(name = "group_id")
    int groupid;
    @Column(name = "group_name")
    String name;
    @OneToMany(mappedBy = "group")
    List<User_Group> user_groupList=new ArrayList<>();

    public Group1() {
    }

    public Group1(int groupid, String name) {
        this.groupid = groupid;
        this.name = name;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User_Group> getUser_groupList() {
        return user_groupList;
    }

    public void setUser_groupList(List<User_Group> user_groupList) {
        this.user_groupList = user_groupList;
    }
}

