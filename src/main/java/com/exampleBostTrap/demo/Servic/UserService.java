package com.exampleBostTrap.demo.Servic;

import com.exampleBostTrap.demo.domain.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void del(Long id);
    List<User> findAll();
    User findById(long id);
    void update(User user);
}
