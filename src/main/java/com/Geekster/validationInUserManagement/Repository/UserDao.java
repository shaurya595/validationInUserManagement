package com.Geekster.validationInUserManagement.Repository;

import com.Geekster.validationInUserManagement.Service.Models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDao {
    private List<User> userList;
    public UserDao(){
        userList = new ArrayList<>();
        userList.add(new User("8080","Shaurya","22-08-1999","shauryapathal595@gmail.com","Kanpur209205","7380856175","33-55-1989","03:54"));
    }
    public List<User> getUserFromData(){
        return userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public boolean save (User user){
        userList.add(user);
        return true;
    }
    public boolean remove(User user){
        userList.remove(user);
        return true;
    }
    public boolean update(String id , boolean status){
        boolean updateStatus = false;
        for(User user : userList){
            if (user.getUserId().equals(id)) {

                remove(user);
                user.setUserId(id);
                save(user);
                return true;
            }
        }
        return false;
    }
}
