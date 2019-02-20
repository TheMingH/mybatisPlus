package org.child.serviceImpl;

import java.util.List;

import org.child.entity.UPermission;
import org.child.entity.URole;
import org.child.entity.UUser;
import org.child.mapper.UPermissionMapper;
import org.child.mapper.URoleMapper;
import org.child.service.UPermissionService;
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
public class UPermissionServiceImpl extends ServiceImpl<UPermissionMapper, UPermission> implements UPermissionService {
	@Autowired
	UPermissionMapper uPermissionMapper;
	
	@Override
	public List<UPermission> findPermissionByPermissionIds(List<Long> permissionIds) {
		return uPermissionMapper.selectBatchIds(permissionIds);
	}
	
	@Override
	public List<String> findNameByPermissionIds(List<Long> permissionIds) {
		return uPermissionMapper.findNameByPermissionIds(permissionIds);
	}
}

