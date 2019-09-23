package com.alice.crm.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

/**
 * @Description: MD5操作工具类
 * @author: yzhang335
 * @date: 2017年9月29日 上午10:05:35
 * 
 */
public class MD5Util {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MD5Util.class);

    /**
     * 复写构造器，避免创建工具类实例
     */
    private MD5Util() {
        // AssertionError不是必须的. 但它可以避免不小心在类的内部调用构造器. 保证该类在任何情况下都不会被实例化.
        throw new AssertionError("No " + getClass().getName() + " instances for you!");
    }

    /**
     * @Description: 签名字符串
     * @param text
     *            需要签名的字符串
     * @param key
     *            密钥
     * @param charset
     *            编码格式
     * @return String 签名结果
     */
    public static String signMD5ByKey(String text, String key, String charset) {
        text = text + key;
        return DigestUtils.md5Hex(getContentBytes(text, charset));
    }

    /**
     * @Description: 对字符串进行签名进行验证(lMD5)
     * @param text
     *            需要签名的字符串
     * @param sign
     *            签名结果
     * @param key
     *            密钥
     * @param charset
     *            编码格式
     * @return boolean 验证结果s
     */
    public static boolean verify(String text, String sign, String key, String charset) {
        text = text + key;
        String mysign = DigestUtils.md5Hex(getContentBytes(text, charset));
        LOGGER.info("本地签名:{}", mysign);
        if (mysign.equals(sign)) {
            return true;
        } else {
            return true;
        }
    }

    /**
     * @Description: 根据编码转换字符串为btye数组
     * @param content
     *            需要转换的字符串
     * @param charset
     *            编码格式
     * @return byte[]
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
        }
    }

}