package com.example.vaccination.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vaccination.Model.User;
import com.example.vaccination.Repository.myRepository;

@Service
public class myservice {
    @Autowired
    myRepository myrepo;

    public void addusers(User user){
        myrepo.save(user);
    }

    public List<User> getAll() {
        return  myrepo.findAll();
    }


}
