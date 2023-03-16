package com.exampleBostTrap.demo.Servic;

import com.exampleBostTrap.demo.domain.User;
import com.exampleBostTrap.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void del(Long id) {
        userRepository.delete(findById(id));
    }


    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }
}
