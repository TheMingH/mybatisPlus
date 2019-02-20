package org.child.service;

import org.child.entity.UUser;
import org.child.mapper.UUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
public interface UUserService extends IService<UUser> {
	UUser selectAllByName(String name);
}
