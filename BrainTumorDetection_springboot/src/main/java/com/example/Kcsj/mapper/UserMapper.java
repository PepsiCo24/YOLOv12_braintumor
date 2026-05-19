package com.example.Kcsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.Kcsj.entity.User;
import org.apache.ibatis.annotations.Select;
/**
 * @author :zky
 * @date 2025年02月27日 16:12
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("select password from user where username=#{username}")
    User selectByName(String username);


    @Select("select * from user where username = #{username}")
    User selectByUsername(String username);
}
