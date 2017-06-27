package com.slb.group1.injector.components;


import com.slb.group1.injector.PerFragment;
import com.slb.group1.injector.module.WelfarePhotoModule;

import dagger.Component;

/**
 * Created by long on 2016/10/11.
 * 借鉴如何写Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = WelfarePhotoModule.class)
public interface WelfarePhotoComponent {
   // void inject(WelfareListFragment fragment);
}
