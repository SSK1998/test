package com.cvicse;

import com.cvicse.common.OrderService;

public class Test {
    public static void main(String[] args) {
//        OrderService orderService = new OrderService();
//
//        for(int i = 1; i<=50;i++){
//            new Thread(() ->{
//                String str = orderService.getOrdNumber();
//                System.out.println(str);
//            },String.valueOf(i)).start();
//        }
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
    }
}
