package com.jc.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jc.model.system.SysUser;

/**
 * @author John.Cena
 * @date 2023/4/4 17:36
 * @Description:
 */
public interface SysUserService extends IService<SysUser> {
    void updateStatus(Long id, Integer status);
}
