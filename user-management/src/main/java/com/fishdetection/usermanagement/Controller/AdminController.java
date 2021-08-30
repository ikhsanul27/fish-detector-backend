package com.fishdetection.usermanagement.Controller;

import com.fishdetection.usermanagement.Model.Admin;
import com.fishdetection.usermanagement.Repository.AdminRepository;
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
    public Admin addUser(@RequestBody Admin admin){
        return adminrepo.save(admin);
    }
    @GetMapping("list")
    public List<Admin> getAllUser(){
        Iterator<Admin> iterator = adminrepo.findAll().iterator();
        List<Admin> admin = new ArrayList<Admin>();
        while (iterator.hasNext()){
            admin.add(iterator.next());
        }
        return admin;
    }

    @GetMapping("listbyid/{id}")
    public Optional<Admin> getUserById(@PathVariable Integer id){
        return adminrepo.findById(id);
    }

    @GetMapping("listbyname/{name}")
    public List<Admin> getDataByName(@PathVariable String name){
        return adminrepo.findByName(name);
    }

    @GetMapping("listbyaddress/{address}")
    public List<Admin> getDataByAddress(@PathVariable String address){
        return adminrepo.findByAddress(address);
    }

    @GetMapping("listbyemail/{email}")
    public List<Admin> getDataByEmail(@PathVariable String email){
        return adminrepo.findByEmail(email);
    }

    @GetMapping("listbyaddress/{username}")
    public List<Admin> getDataByUsername(@PathVariable String username){
        return adminrepo.findByUsername(username);
    }

    @GetMapping("listbyphoneNumber/{phoneNumber}")
    public List<Admin> getDataByPhoneNumber(@PathVariable String phoneNumber){
        return adminrepo.findByPhoneNumber(phoneNumber);
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
