package com.example.back;

import com.example.back.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody UserRequest userRequest){
        userService.save(userRequest);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }
}
