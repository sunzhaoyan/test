package com.szy.util;

import java.math.BigInteger;

/**
 * Base64VLQ 转码工具类
 * @author szy
 * @Date 2017年12月31日 下午12:33:13
 * @version 1.0.0
 * @Describe
 * <p><b>介绍：</b></p>
 * <p>VLQ 是 Variable-length quantity 的缩写，是一种通用的，使用任意位数的二进制来表示一个任意大的数字的一种编码方式</p>
 * <p><b>算法说明（编码方式）：</b></p>
 * <p>1. 将待转换的数字改写成二进制</p>
 * <p>2. 正数在最右补0</p>
 * <p>3. 从低位到高位，每5位分段，最高位不足5位的补0</p>
 * <p>4. 倒转各个段的顺序</p>
 * <p>5. 每段开始添加连续位（ 1为连续，0为结束），除最后一段为0，其他段为1</p>
 * <p>6. 将每一段转成Base64编码</p>
 */
public class Base64VLQ {
    
    /**
     * 获得 vlq的表示的值
     * @param num
     * @return
     */
    public static String encoder(int num) {
        // 1. 转成2进制
        String bStr = Integer.toBinaryString(num);
        // 2. 正数补0
        if (num > 0) {
            bStr += 0;
        } else {
            bStr += 1;
        }
        // 3. 5位分段，不足补0
        int indexNumLen = bStr.length() % 5;
        for (int i = 0; i < 5 - indexNumLen; i++) {
            bStr = 0 + bStr;
        }
        int groupCount = bStr.length() / 5;
        String[] numGroup = new String[groupCount];
        
        for (int j = 0; j < groupCount; j++) {
            numGroup[j] = bStr.substring(5 * j, 5 * j + 5);
        }
        // 4. 倒转各段
        numGroup = reverseArray(numGroup);
        
        // 5. 添加连续位
        for (int k = 0; k < groupCount; k++) {
            if (k != groupCount - 1) {
                numGroup[k] = 1 + numGroup[k];
                continue;
            }
            numGroup[k] = 0 + numGroup[k];
        }
        
        StringBuffer sb = new StringBuffer();
        // 6. 转成Base64
        for (int l = 0; l < groupCount; l++) {
            BigInteger bi = new BigInteger(numGroup[l], 2);
            int base64Num = Integer.valueOf(bi.toString(10));
            sb.append(Base64.BASE64_ARRAY[base64Num]);
        }
        return sb.toString();
    }
    
    /**
     * 获得vlq表示的数字
     * @param vlq
     * @return
     */
    public static int dencoder(String vlq) {
        // 1. 获得base64代表的数值
        String[] vlqs = vlq.split("");
        int vlqsLen = vlqs.length;
        for (int i = 0; i <vlqsLen; i++) {
            BigInteger bi10 = new BigInteger(Base64.getBase64Num(vlqs[i]) + "");
            String str = bi10.toString(2);
            while(str.length() < 5) {
                str = 0 + str;
            }
            vlqs[i] = str;
        }
        
        // 2. 去除连续位
        for (int j = 0; j < vlqsLen; j++) {
            vlqs[j] = vlqs[j].substring(1);
        }
        
        // 3. 倒转数组
        vlqs = reverseArray(vlqs);
        
        // 4. 连接分段
        String bStr = "";
        for (int k = 0; k < vlqsLen; k++) {
            bStr += vlqs[k];
        }
        
        // 5. 去除符号位
        bStr = bStr.substring(0, bStr.length() - 1);
        
        // 6. 转成数字
        BigInteger bi = new BigInteger(bStr, 2);
        return bi.intValue();
    } 
    
    /**
     * 数组倒转
     * @param strArr
     * @return
     */
    private static String[] reverseArray(String[] strArr) {
        for (int start = 0, end = strArr.length - 1; start < end; start++, end--) {
            String temp = strArr[end];
            strArr[end] = strArr[start];
            strArr[start] = temp;
        }
        
        return strArr;
    }
    
    public static void main(String[] args) {
        int num = 137;
        
        String encoder = encoder(num);
        System.out.println(encoder);
        
        int dencoder = dencoder(encoder);
        System.out.println(dencoder);
    }
}
