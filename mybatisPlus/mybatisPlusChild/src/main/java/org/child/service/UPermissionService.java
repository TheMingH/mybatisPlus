package org.child.service;

import java.util.List;

import org.child.entity.UPermission;
import org.child.entity.UUser;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
public interface UPermissionService extends IService<UPermission> {
	List<UPermission> findPermissionByPermissionIds(List<Long> permissionIds);
	List<String> findNameByPermissionIds(List<Long> permissionIds);
}
