package com.test.adapter;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
//        DBSocketInterface dbSocket = new DBSocket();
//        hotel.setSocket(dbSocket);
        GBSocketInterface gbSocket = new GBSocket();
        SocketAdapter adapter = new SocketAdapter();
        adapter.setGBSocket(gbSocket);
        hotel.setSocket(adapter);
        hotel.charge();
    }
}
