package com.example.resources;


import com.example.models.User;
import com.example.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class UserResource {

    private UserService userService;

    public UserResource(UserService userService){
        this.userService = userService;
    }

    @GetMapping("user")
    public ResponseEntity<List<User>> getUserList(){
        return Optional.ofNullable(userService.findAll())
                .map(t -> new ResponseEntity(t, HttpStatus.OK))
                .orElse(new ResponseEntity(HttpStatus.NO_CONTENT));
    }

    @PostMapping("user")
    public ResponseEntity<User> save(@RequestBody User user) {
        user = userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("user")
    public ResponseEntity<User> update(@RequestBody User user ){
        user = userService.save(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
