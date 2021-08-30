package com.fishdetection.usermanagement.Repository;

import com.fishdetection.usermanagement.Model.Admin;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends ElasticsearchRepository<Admin, Integer>{
    List<Admin> findByName(String name);
    List<Admin> findByAddress(String address);
    List<Admin> findByEmail(String email);
    List<Admin> findByUsername(String username);
    List<Admin> findByPhoneNumber(String phoneNumber);
}