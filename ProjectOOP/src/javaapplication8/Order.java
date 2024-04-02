package javaapplication8;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasmin
 */
public class Order {
      private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private static int count;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public Order()
    {
        orderItemList =  new ArrayList<>();
        count++;
        orderNumber=count;
        
    }

    public OrderItem addOrderItem(Drug d, int quantity)
    {
        OrderItem orderItem = new OrderItem();
        orderItem.setDrug(d);
        orderItem.setQuantity(quantity);
        orderItemList.add(orderItem);
        return orderItem;
    }

    @Override
    public String toString() {
        return String.valueOf(orderNumber);
    }
    
    public void removeOrderItem(OrderItem o)
    {
        orderItemList.remove(o);
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
}
