package com.Geekster.validationInUserManagement.Controllers;

import com.Geekster.validationInUserManagement.Service.Models.User;
import com.Geekster.validationInUserManagement.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserService userService;
    // get all userList
    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping(value = "/addUser")
    public String addUser(@Valid @RequestBody User user ){
        return userService.addMyUser(user);
    }
    @RequestMapping(value = "/getById/{id}" , method = RequestMethod.GET)
    public User getUserById(@PathVariable String id){
        return userService.getUserBasedOnId(id);
    }
    //delete User
    @DeleteMapping(value="/deleteUser/{id}")
    public String DeleteUserById(@PathVariable String id){
        return userService.removeUserById(id);
    }

    @PutMapping(value = "/update/{id}/{status}")
    public String updateUserById(@PathVariable String id, @PathVariable String status){
        return userService.updateById(id , status);
    }


}
