/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order;

import business.product.Product;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class Order {

    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count = 0;

    public Order() {
        count++;
        orderNumber = count;//assign count to orderNumber
        //every time a order get created, get a Num
        orderItemList = new ArrayList<OrderItem>();//initialize to restrain, only OrderItem in ArrayList                             
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderItem AddOdrerItem(Product product, int quantity) {
        OrderItem o = new OrderItem();
        o.setProduct(product);
        o.setQuantity(quantity);
        orderItemList.add(o);
        return o;
    }

    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }

    public int getTotalCost() {
        int totalCost = 0;
        for (OrderItem oi : getOrderItemList()) {
            totalCost = totalCost + oi.getQuantity() * oi.getProduct().getPrice();
        }
        return totalCost;
    }

}
