package com.example.back;

import com.example.back.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(UserRequest userRequest){
        userRepository.save(userRequest.toEntity());
    }

    public User getById(Long id) {
        return userRepository
                .findById(id)
                .orElseThrow(()->new RuntimeException("유저 없다"));
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
