package com.test.other;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.xml.bind.DatatypeConverter;

public class TestMac {
    public static void main(String[] args) {
        System.out.println(getMac());
    }

    /**
     * 获得mac地址
     * @return String
     */
    public static String getMac() {
        String macStr = "";
        try {
            InetAddress ia = InetAddress.getLocalHost();
            byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
            macStr = DatatypeConverter.printHexBinary(mac);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }

        return macStr;
    }
}
