package org.child.serviceImpl;

import org.child.entity.UUser;
import org.child.mapper.UUserMapper;
import org.child.service.UUserService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
@Service
public class UUserServiceImpl extends ServiceImpl<UUserMapper, UUser> implements UUserService {
	@Autowired
	UUserMapper userMapper;
	
	@Override
	public UUser selectAllByName(String name) {
		try {
			userMapper.selectOne(new QueryWrapper<UUser>().eq("nickname", name));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return userMapper.selectOne(new QueryWrapper<UUser>().eq("nickname", name));
	}
}
