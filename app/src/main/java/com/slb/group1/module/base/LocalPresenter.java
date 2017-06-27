package com.slb.group1.module.base;

import java.util.List;

/**
 * 项目名称: MvpHello
 * 类名称：LocalPresenter
 * 类描述：$DESC
 * 创建人：ShangZemin
 * 创建时间：2017-06-13 19:53
 * 修改人：l
 * 修改时间：2017-06-13 19:53
 * 修改备注：
 */

public interface LocalPresenter<T> extends IBasePresenter {
    /**
     * 删除集合
     *
     * @param datalist
     */
    void deleteList(List<T> datalist);

    /**
     * 添加一些或全部
     *
     * @param datalist
     */
    void insertList(List<T> datalist);

    /**
     * 更新集合中数据
     *
     * @param datalist
     */
    void updateAll(List<T> datalist);

    /**
     * 按data内容更新全部
     *
     * @param data
     */
    void updateAll(T data);

    /**
     * 更新单条数据
     *
     * @param data
     */
    void update(T data);

    /**
     * 插入单个数据
     *
     * @param data
     */
    void insert(T data);

    /**
     * 删除单个数据
     *
     * @param data
     */
    void delete(T data);
}
