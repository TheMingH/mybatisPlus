package org.child.serviceImpl;

import java.util.List;

import org.child.entity.UUserRole;
import org.child.mapper.UUserRoleMapper;
import org.child.service.UUserRoleService;
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
public class UUserRoleServiceImpl extends ServiceImpl<UUserRoleMapper, UUserRole> implements UUserRoleService {
	@Autowired
	UUserRoleMapper userRoleMapper;
	
	@Override
	public List<Long> findRoleByUid(Long uid) {
		return userRoleMapper.findRoleByUid(uid);
	}
}
