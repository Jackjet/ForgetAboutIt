package com.slb.group1.app;


import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.slb.group1.BuildConfig;
import com.slb.group1.api.RetrofitService;
import com.slb.group1.injector.components.ApplicationComponent;
import com.slb.group1.injector.components.DaggerApplicationComponent;
import com.slb.group1.injector.module.ApplicationModule;
import com.slb.group1.rxbus.RxBus;
import com.slb.group1.utils.ToastUtils;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by long on 2016/8/19.
 * Application
 */
@SuppressWarnings("unused")
public class AndroidApplication extends MultiDexApplication {

    private static final String DB_NAME = "news-db";

    private static ApplicationComponent sAppComponent;
    private static Context sContext;

    // 因为下载那边需要用，这里在外面实例化在通过 ApplicationModule 设置
    private RxBus mRxBus = new RxBus();



    @Override
    public void onCreate() {
        super.onCreate();
        sContext=getApplicationContext();
        _initInjector();
        _initConfig();
        _initUmeng();
    }

    private void _initUmeng() {

    }

    /**
     * 使用Tinker生成Application，这里改成静态调用
     * @return
     */
    public static ApplicationComponent getAppComponent() {
        return sAppComponent;
    }

    public static Context getContext() {
        return sContext;
    }

    /**
     * 初始化注射器
     */
    private void _initInjector() {
        // 这里不做注入操作，只提供一些全局单例数据
        sAppComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this,mRxBus))
                .build();
    }


    /**
     * 初始化配置
     */
    private void _initConfig() {
        //如果是debug模式 安装内存泄漏检测工具
        if (BuildConfig.DEBUG) {
            LeakCanary.install(this);
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.

        }

        // Normal app init code...
        //当出现闪退时，重新启动为了方便debug暂时不用
       // CrashHandler.getInstance().init(getApplicationContext());
        //初始化Retrofit网络请求服务
        RetrofitService.init();
        //初始化toast工具
        ToastUtils.init(getApplicationContext());


    }
}
