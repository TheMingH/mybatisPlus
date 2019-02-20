package org.child.mapper;

import java.util.List;

import org.child.entity.UPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
public interface UPermissionMapper extends BaseMapper<UPermission> {
	List<String> findNameByPermissionIds(List<Long> permissionIds);
}
