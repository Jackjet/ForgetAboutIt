package com.slb.group1.injector.components;

import android.content.Context;

import com.slb.group1.injector.module.ApplicationModule;
import com.slb.group1.rxbus.RxBus;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 项目名称: MvpHello
 * 类名称：ApplicationComponent
 * 类描述：$DESC
 * 创建人：ShangZemin
 * 创建时间：2017-06-11 12:37
 * 修改人：l
 * 修改时间：2017-06-11 12:37
 * 修改备注：
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

 // void inject(BaseActivity baseActivity);

   // @Provides
    Context getContext();
    RxBus getRxBus();

}

