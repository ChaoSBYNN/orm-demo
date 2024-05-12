package org.example.orm.demos.dao.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.orm.demos.web.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where name = #{name}")
    List<User> getByNameAnnotation(@Param("name") String name);

    List<User> getByNameXML(@Param("name") String name);
}