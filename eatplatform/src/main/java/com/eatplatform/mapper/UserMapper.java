package com.eatplatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eatplatform.vo.UserVO;

@Mapper
public interface UserMapper {
	List<UserVO> findAll();
}
