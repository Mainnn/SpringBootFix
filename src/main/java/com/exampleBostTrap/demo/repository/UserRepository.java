package com.exampleBostTrap.demo.repository;

import com.exampleBostTrap.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findById(long id);


}
