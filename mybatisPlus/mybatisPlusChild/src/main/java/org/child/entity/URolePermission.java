package org.child.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author Walle
 * @since 2019-01-24
 */
@TableName("u_role_permission")
public class URolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private Long rid;

    /**
     * 权限ID
     */
    private Long pid;


    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "URolePermission{" +
        "rid=" + rid +
        ", pid=" + pid +
        "}";
    }
}
