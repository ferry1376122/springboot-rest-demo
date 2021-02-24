package com.wy.springbootrestdemo.controller;

import com.wy.springbootrestdemo.entity.Users;
import com.wy.springbootrestdemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 来苏
 */
@RestController
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;
    //查询所有数据
    @RequestMapping(value = "users",method = RequestMethod.GET)
    public List<Users> findAll(){
        return usersRepository.findAll();
    }
    //根据id查询对象
    @RequestMapping(value = "users/{id}",method = RequestMethod.GET)
    public Users findById(@PathVariable int id){
        return usersRepository.findById(id).get();
    }
    //保存对象
    @RequestMapping(value = "users",method = RequestMethod.POST)
    public Users saveUsers(@ModelAttribute Users users){
        return usersRepository.save(users);
    }
    //修改对象
    @RequestMapping(value = "users",method = RequestMethod.PUT)
    public Users updateUsers(@ModelAttribute Users users){
        return usersRepository.saveAndFlush(users);
    }

    //根据id删除对象
    @RequestMapping(value = "users/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id){
        usersRepository.deleteById(id);
    }
}
