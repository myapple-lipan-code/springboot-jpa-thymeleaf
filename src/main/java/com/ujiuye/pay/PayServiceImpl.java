package com.ujiuye.pay;

/**
 * @program: git
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-08 19:33
 **/
public class PayServiceImpl implements PayService {
    @Override
    public void add(double money) {
        System.out.println("添加支付");
    }

    @Override
    public void update(double money) {
        System.out.println("修改支付");
    }

    @Override
    public void delete9(Long id) {
        System.out.println("删除支付");
    }
}
