package com.fundarepaso.api.services;


import com.fundarepaso.api.domain.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 =new User(1L, "oscar", "1234");
        User user2 = new User(2L, "juan", "1234");
        User user3 = new User(3L, "maria", "1234");

        userList.addAll(Arrays.asList(user1,user2,user3));
    }

    public List<User> getUserList() {
        return userList;
    }


}
