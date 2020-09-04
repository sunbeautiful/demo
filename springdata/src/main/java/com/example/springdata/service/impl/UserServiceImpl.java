package com.example.springdata.service.impl;

import com.example.springdata.domain.User;
import com.example.springdata.repository.UserRepository;
import com.example.springdata.service.UserService;
import com.example.springdata.util.Result;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 59326
 * @description
 * @date 2020/8/28 16:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    EntityManager entityManager;
    JPAQueryFactory queryFactory;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    private void init() {
        queryFactory = new JPAQueryFactory(entityManager);
    }


    @Override
    @Transactional
    public Result<List<User>> queryTestDsl() {
        List<User> all = userRepository.findAll();
        for (User user : all) {
             user.toBuilder().age(45).name("sqq").build();
        }
       // all.stream().forEach(user -> user.toBuilder().age(45).name("sqq").build());
        //all.stream().forEach(user -> user.setAge(33));

        return Result.succeed(all);
    }
}
