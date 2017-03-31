package com.test.adapter;

public class SocketAdapter implements DBSocketInterface {
    private GBSocketInterface gbSocket;

    public void setGBSocket(GBSocketInterface gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void powerWithTwoRound() {
        gbSocket.powerWithThreeFlat();
    }

}
