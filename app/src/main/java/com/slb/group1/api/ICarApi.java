package com.slb.group1.api;

import com.slb.group1.module.shopping.module.bean.CarBean;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * date: 2017/6/29.
 * author: 王艺凯 (lenovo )
 * function:请求购物车数据
 */

public interface ICarApi {
    //    http://result.eolinker.com/SCNPrIW543a7a64f42043f3fe3a8df2b59f7b130608b922?uri=shopcar
    @POST("SCNPrIW543a7a64f42043f3fe3a8df2b59f7b130608b922")
    Observable<CarBean> getCarNeiRong(@Query("uri") String uri);
}
