package com.test.adapter;

public class Hotel {
    private DBSocketInterface dbSocket;

    public Hotel() {
    };

    public void setSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    /**
     * 充电方法 szy 2017年3月30日 下午4:43:29 void
     */
    public void charge() {
        dbSocket.powerWithTwoRound();
    }
}
