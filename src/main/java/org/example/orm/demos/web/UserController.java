package org.example.orm.demos.web;
 
import org.example.orm.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 查询所有user
     * @return
     */
    @GetMapping("/listByJpa")
    public List<User> listByJpa(){
        return userService.listByJpa();
    }
    /**
     * 查询所有user
     * @return
     */
    @GetMapping("/listByMybatis")
    public List<User> listByMybatis(){
        return userService.listByMybatis();
    }

    /**
     * 查询所有user
     * @return
     */
    @GetMapping("/listByName/{name}")
    public List<User> listByName(@PathVariable("name")  String name){
        return userService.getByName(name);
    }

}
 
 