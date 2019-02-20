package org.child.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.child.entity.URole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
@Mapper
public interface URoleMapper extends BaseMapper<URole> {
	public List<String> findRoleByUids(List<Long> uids);
}
