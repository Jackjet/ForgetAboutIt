package com.slb.group1.injector;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 项目名称: MvpHello
 * 类名称：PerFragment
 * 类描述：让注入对象和fragemnt同生命
 * 创建人：ShangZemin
 * 创建时间：2017-06-11 18:49
 * 修改人：l
 * 修改时间：2017-06-11 18:49
 * 修改备注：
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {
}
