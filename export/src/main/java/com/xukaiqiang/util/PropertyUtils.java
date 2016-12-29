package com.xukaiqiang.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 
 * 读取属性文件工具类
 *
 */
public class PropertyUtils {
    /**
     * 
     * @param key 根据key返回对应的value值
     * @return 返回的字符串
     */
    public static String getValue(String key) {
        Properties p = new Properties();
        String value = "";
        InputStreamReader in =null;
        try {
        	in=new InputStreamReader(PropertyUtils.class.getClassLoader().getResourceAsStream("/Constants.properties"), "UTF-8");
			p.load(in);
            value = p.getProperty(key);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                in.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return value;
    }

    /**
     * 
     * @param key 根据key返回对应的value值
     * @param filename 文件名
     * @return 返回的字符串
     */
    public static String getValue(String key, String filename) {
        Properties p = new Properties();
        String value = "";
        InputStreamReader in =null;
        try {
        	in=new InputStreamReader(PropertyUtils.class.getClassLoader().getResourceAsStream(""+ filename), "UTF-8");
            p.load(in);
            value = p.getProperty(key);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                in.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return value;
    }
}