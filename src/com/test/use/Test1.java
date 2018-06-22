package com.test.use;

public class Test1 {
    public static void main(String[] args) {
        String baseUrl = "http://down01.pingshu8.com:8000/2/xs/liubaorui/dui/";
        int num = 40;
        int digits = 2;
        String suffix = ".mp3";
        for (int i = 1; i <= num; i++) {
            String x = completeNum(i, digits);
            System.out.println(baseUrl + x + suffix);
        }
    }
    
    /**
     * 数字位数不足补0 
     * @param x 待处理的数字
     * @param digits 需要的位数
     * @return
     */
    private static String completeNum(int x, int digits) {
        String str = x + "";
        while (str.length() < digits) {
            str = "0" + str;
        }
        return str;
    }
}
