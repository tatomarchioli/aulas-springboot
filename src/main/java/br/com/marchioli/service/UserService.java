package br.com.marchioli.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.marchioli.domain.User;
import br.com.marchioli.repository.UserRepository;

@Service()
@Qualifier("userService")
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService ( UserRepository userRepository ) {

        this.userRepository = userRepository;

    }

    public String createUser(){
        User user = new User();
        user.setId(1L);
        user.setName("Otavio");
        userRepository.save(user);

        return userRepository.findById(1L).orElseThrow(()->new IllegalStateException("user not found")).getName();
    }
}