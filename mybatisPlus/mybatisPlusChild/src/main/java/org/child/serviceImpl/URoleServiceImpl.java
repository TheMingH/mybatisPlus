package org.child.serviceImpl;

import java.util.List;

import org.child.entity.URole;
import org.child.entity.UUser;
import org.child.mapper.URoleMapper;
import org.child.service.URoleService;

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
public class URoleServiceImpl extends ServiceImpl<URoleMapper, URole> implements URoleService {
	@Autowired
	URoleMapper uRoleMapper;
	
	@Override
	public List<URole> findRoleByUid(List<Long> uids) {
		return uRoleMapper.selectBatchIds(uids);
	}
	
	public List<String> findRoleByUids(List<Long> uids) {
		return uRoleMapper.findRoleByUids(uids);
	}
}
