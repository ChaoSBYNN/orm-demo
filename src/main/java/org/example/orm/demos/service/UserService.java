package org.example.orm.demos.service;
 
 
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.example.orm.demos.dao.mybatis.UserMapper;
import org.example.orm.demos.dao.jpa.UserRepository;
import org.example.orm.demos.web.User;
import org.springframework.stereotype.Service;
 
import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;
 
/**
 * 实现接口的抽象方法
 */
@Slf4j
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
        List<User> users1 = userRepository.getByName(name);
        log.info("JPA ------- {}", users1);

//        // JPA Annotation
//        List<User> users2 = userRepository.getByNameAnnotation(name);
//        log.info("JPA Annotation ------- {}",users2);

        // Mybatis Wrapper
        List<User> users3 = userMapper.selectList(Wrappers.<User>lambdaQuery().eq(User::getName, name));
        log.info("Mybatis Wrapper ------- {}", users3);

        // Mybatis Annotation
        List<User> users4 = userMapper.getByNameAnnotation(name);
        log.info("Mybatis Annotation ------- {}", users4);

        // Mybatis XML
        List<User> users5 = userMapper.getByNameXML(name);
        log.info("Mybatis XML ------- {}", users5);

        List<User> users6 = userMapper.selectList(new LambdaQueryWrapper<User>().eq(User::getName, name));

        return null;
    }

}
 
 