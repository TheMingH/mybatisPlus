package org.child.serviceImpl;

import java.util.List;

import org.child.entity.URolePermission;
import org.child.entity.UUser;
import org.child.mapper.URolePermissionMapper;
import org.child.mapper.UUserRoleMapper;
import org.child.service.URolePermissionService;

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
public class URolePermissionServiceImpl extends ServiceImpl<URolePermissionMapper, URolePermission> implements URolePermissionService {
	@Autowired
	URolePermissionMapper uRolePermissionMapper;
	
	@Override
	public List<Long> findRoleByRoleIds(List<Long> rids) {
		try {
			uRolePermissionMapper.findRoleByRoleIds(rids);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return uRolePermissionMapper.findRoleByRoleIds(rids);
	}
}
