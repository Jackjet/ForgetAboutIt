package com.slb.group1.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 项目名称: ForgetAboutIt
 * 类名称：MD5Utils
 * 类描述：加密工具
 * 创建人：ShangZemin
 * 创建时间：2017-06-27 15:30
 * 修改人：l
 * 修改时间：2017-06-27 15:30
 * 修改备注：
 */

public class MD5Utils {

    /**
     * 32位MD5加密方法
     * 16位小写加密只需getMd5Value("xxx").substring(8, 24);即可
     *
     * @param sSecret
     * @return
     */
    public static String getMd5Value(String sSecret) {
        try {
            MessageDigest bmd5 = MessageDigest.getInstance("MD5");
            bmd5.update(sSecret.getBytes());
            int i;
            StringBuffer buf = new StringBuffer();
            byte[] b = bmd5.digest();// 加密
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

}
