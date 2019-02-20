package org.child.service;

import java.util.List;

import org.child.entity.URole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
public interface URoleService extends IService<URole> {
	List<URole> findRoleByUid(List<Long> uids);
	public List<String> findRoleByUids(List<Long> uids);
}
