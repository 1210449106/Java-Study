package com.demo03;

/**
 * @Classname : Product
 * @Description :
 * @Date : 2022/3/10 6:37 PM
 * @Created by wangruiyang
 */
public class Product {//商品类
    private String brand;//品牌
    private String name;//产品名
    private Boolean flag = false;//产品是否就绪
//    Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    //    生产商品方法
    public synchronized void setProduct(String brand,String name){
        if (flag){//商品已就绪
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //生产费列罗巧克力
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
//            打印产品信息
        System.out.println("生产者生产了"+this.getBrand()+"----"+this.getName());
        flag = true;
        notify();
    }
//    消费方法
    public synchronized void getProduct(){
        if (!flag){//商品未就绪
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了"+this.getBrand()+"----"+this.getName());
        flag = false;
        //通知生产者
        notify();
    }
//    构造方法
    public Product() {
    }
}
