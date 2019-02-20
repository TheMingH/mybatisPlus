package org.child.mapper;

import java.util.List;

import org.child.entity.URolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
public interface URolePermissionMapper extends BaseMapper<URolePermission> {
	List<Long> findRoleByRoleIds(List<Long> rids);
}
