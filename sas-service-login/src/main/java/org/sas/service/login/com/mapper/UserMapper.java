package org.sas.service.login.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sas.service.login.com.entity.User;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
