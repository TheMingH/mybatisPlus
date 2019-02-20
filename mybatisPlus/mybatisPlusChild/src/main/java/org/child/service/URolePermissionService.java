package org.child.service;

import java.util.List;

import org.child.entity.URolePermission;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
public interface URolePermissionService extends IService<URolePermission> {
	public List<Long> findRoleByRoleIds(List<Long> rids);
}
