package com.fishdetection.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminRepository adminrepo;

    @PostMapping("addUser")
    public  Admin addUser(@RequestBody Admin admin){
        return adminrepo.save(admin);
    }
    @GetMapping("listUser")
    public List<Admin> getAllUser(){
        Iterator<Admin> iterator = adminrepo.findAll().iterator();
        List<Admin> admin = new ArrayList<Admin>();
        while (iterator.hasNext()){
            admin.add(iterator.next());
        }
        return admin;
    }

    @GetMapping("listUser/{id}")
    public Optional<Admin> getUserById(@PathVariable Integer id){
        return adminrepo.findById(id);
    }

    @PutMapping("updateUser/{id}")
    public Admin updateUser(@PathVariable Integer id, @RequestBody Admin admin){
        Optional<Admin> adm = adminrepo.findById(id);
        if(adm.isPresent()){
            Admin a = adm.get();
            a.setName(admin.getName());
            a.setEmail(admin.getEmail());
            a.setAddress(admin.getAddress());
            a.setUsername(admin.getUsername());
            a.setPassword(admin.getPassword());
            a.setPhoneNumber(admin.getPhoneNumber());
            return adminrepo.save(a);
        }
        else{
            return null;
        }
    }

    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id){
        adminrepo.deleteById(id);
        return "Deleted successfully";
    }

}
