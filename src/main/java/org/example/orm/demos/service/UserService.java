package org.example.orm.demos.service;
 
 
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.example.orm.demos.dao.mybatis.UserMapper;
import org.example.orm.demos.dao.jpa.UserRepository;
import org.example.orm.demos.web.User;
import org.springframework.stereotype.Service;
 
import javax.annotation.Resource;
import java.util.List;
 
/**
 * 实现接口的抽象方法
 */
@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    @Resource
    private UserMapper userMapper;


    public List<User> listByJpa() {
        return userRepository.findAll();
    }


    public List<User> listByMybatis() {
        return userMapper.selectList(Wrappers.lambdaQuery());
    }

    public List<User> getByName(String name) {

        // JPA
        userRepository.getByName(name);

        // JPA Annotation
        userRepository.getByNameAnnotation(name);

        // Mybatis Wrapper
        userMapper.selectList(Wrappers.<User>lambdaQuery().eq(User::getName, name));

        // Mybatis Annotation
        userMapper.getByNameAnnotation(name);

        // Mybatis XML
        userMapper.getByNameXML(name);

        return null;
    }

}
 
 