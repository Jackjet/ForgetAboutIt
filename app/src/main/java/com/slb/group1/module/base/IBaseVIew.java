package com.slb.group1.module.base;


/**
 * 项目名称: MvpHello
 * 类名称：IBaseVIew
 * 类描述：$DESC
 * 创建人：ShangZemin
 * 创建时间：2017-06-10 11:32
 * 修改人：l
 * 修改时间：2017-06-10 11:32
 * 修改备注：
 */

public interface IBaseVIew {

    /**
     * 显示加载动画
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 显示网络错误，modify 对网络异常在 BaseActivity 和 BaseFragment 统一处理
     */
    void showNetError();

    /**
     * 绑定生命周期
     * @param <T>
     * @return
     */


    /**
     * 完成刷新, 新增控制刷新
     */
    void finishRefresh();
}
