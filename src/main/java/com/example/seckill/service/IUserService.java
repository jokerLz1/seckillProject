package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.pojo.User;
import com.example.seckill.vo.LoginVo;
import com.example.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 作者
 * @since 2022-12-07
 */
public interface IUserService extends IService<User> {

    /**
     * 登录接口
     * @param vo
     * @param request
     * @param response
     * @return
     */
    RespBean doLogin(LoginVo vo, HttpServletRequest request, HttpServletResponse response);
}
