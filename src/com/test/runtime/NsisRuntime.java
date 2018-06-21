package com.test.runtime;

import java.io.IOException;
/**
 * 使用Runtime编译nsis文件
 * 
 * @author szy
 * @date 2017年5月24日 上午10:02:49
 *
 */
public class NsisRuntime {
    public static void main(String[] args) {
        try {
            String nsis = "\"C:\\Program Files (x86)\\NSIS\\makensis.exe\"";
            String filePath = "E:\\天威诚信\\07.svn\\UI定制\\NingBoCAUI_20161226\\UI安装包\\NingBoCAUI.nsi";
//            String cmd =nsis + " /X SetCompressor  /FINAL /SOLID lzma /DDATAFILE_EXT=cdat " + filePath;
            String cmd =nsis + " "+ filePath;
            System.out.println(cmd);
            Process process = Runtime.getRuntime().exec(cmd);
            System.out.println(process);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
