package com.slb.group1.module.base;

/**
 * 项目名称: MvpHello
 * 类名称：IBasePresenter
 * 类描述：$DESC
 * 创建人：ShangZemin
 * 创建时间：2017-06-10 11:41
 * 修改人：l
 * 修改时间：2017-06-10 11:41
 * 修改备注：
 */

public interface IBasePresenter {
    /**
     * 获取商品数据
     */
    void getData(boolean isRefresh);

    /**
     * 加载更多数据
     */
    void getMoreData();
}
