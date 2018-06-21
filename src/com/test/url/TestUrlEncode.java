package com.test.url;

public class TestUrlEncode {
    // public static void main(String[] args) {
    // String url = "%CD%F5%AB";
    //// String url =
    // "%D3%BA%D5%FD%BD%A3%CF%C0%CD%BC-%B5%DA6%B2%BF/%CD%F5%ABh%B2%A8_%D3%BA%D5%FD%BD%A3%CF%C0%CD%BC-%B5%DA6%B2%BF";
    // String decode;
    //
    // String str = "雍正剑侠图-第6部/王玥波_雍正剑侠图-第6部";
    // try {
    // decode = URLDecoder.decode(url, "gbk");
    // System.out.println(decode);
    // String encode = URLEncoder.encode(str, "gbk");
    // System.out.println(encode);
    // } catch (UnsupportedEncodingException e) {
    // e.printStackTrace();
    // }
    // }

    public static void main(String[] args) {
        int count = 199;
        String baseUrl = "http://down03.pingshu8.com:8000/03/ps/%CD%F5%ABh%B2%A8_%D3%BA%D5%FD%BD%A3%CF%C0%CD%BC-%B5%DA6%B2%BF/%CD%F5%ABh%B2%A8_%D3%BA%D5%FD%BD%A3%CF%C0%CD%BC-%B5%DA6%B2%BF_";
        for (int i = 1; i <= count; i++) {
            String no = formatNum(i);
            System.out.println(baseUrl + no + ".mp3");
        }
    }
    
    private static String formatNum(int num) {
        String str = num + "";

        while (str.length() < 3) {
            str = "0" + str;
        }
        return str;
    }
}
