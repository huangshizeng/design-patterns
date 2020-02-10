package com.huang.adaptermode;

/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Socket socket = new Adapter(computer);
        socket.charge220();
    }
}
