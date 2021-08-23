package com.fishdetection.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository usr;

    @GetMapping("list")
    public List<User> getAllData(){
        Iterator<User> iterator = usr.findAll().iterator();
        List<User> user = new ArrayList<User>();
        while (iterator.hasNext()){
            user.add(iterator.next());
        }
        return user;
    }

    @GetMapping("list/{id}")
    public Optional<User> getDataById(@PathVariable Integer id){
        return usr.findById(id);
    }
}
