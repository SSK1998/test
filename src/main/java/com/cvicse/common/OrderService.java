package com.cvicse.common;

import java.util.concurrent.locks.*;

import com.cvicse.util.OrderNumCreateUtil;

public class OrderService {

    private OrderNumCreateUtil orderNumCreateUtil = new OrderNumCreateUtil();

    private  Lock lock = new ReentrantLock();

    public String getOrdNumber(){
        lock.lock();
        try {
            return orderNumCreateUtil.getOrdNumber();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}
