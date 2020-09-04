package com.example.springdata.repository;

import com.example.springdata.basedata.BaseJpaRepository;
import com.example.springdata.basedata.BaseQueryDslRepository;
import com.example.springdata.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseJpaRepository<User> {

}
