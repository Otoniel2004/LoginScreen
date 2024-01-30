package br.com.apilogin.project.controller;

import br.com.apilogin.project.DAO.IUser;
import br.com.apilogin.project.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController  {

    @Autowired
    private  IUser dao;

    @GetMapping("/users")
    public List<User> listUsers() {
        return (List<User>) dao.findAll();

    }

}
