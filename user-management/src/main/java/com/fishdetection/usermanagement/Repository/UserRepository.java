package com.fishdetection.usermanagement.Repository;

import com.fishdetection.usermanagement.Model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, Integer>{
}
