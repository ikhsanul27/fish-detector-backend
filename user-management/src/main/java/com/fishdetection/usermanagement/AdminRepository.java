package com.fishdetection.usermanagement;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends ElasticsearchRepository<Admin, Integer>{

}
