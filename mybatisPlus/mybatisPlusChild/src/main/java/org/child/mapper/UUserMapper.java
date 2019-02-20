package org.child.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.child.entity.UUser;
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
public interface UUserMapper extends BaseMapper<UUser> {
	public UUser select();
}
