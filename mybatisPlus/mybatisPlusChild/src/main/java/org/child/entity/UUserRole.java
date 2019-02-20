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
@TableName("u_user_role")
public class UUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long uid;

    /**
     * 角色ID
     */
    private Long rid;


    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "UUserRole{" +
        "uid=" + uid +
        ", rid=" + rid +
        "}";
    }
}
