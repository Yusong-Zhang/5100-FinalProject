/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerOrder;



import Business.Customer.Customer;
import Business.Item.Item;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jiaohongmei
 */
public class BuyOrderItem {
    
    private int quantity;
    private Item item;
    private String status;
    private Evaluate evaluate;
    private Date createTime;
    private ArrayList<String> feedbackend;
    
    private Customer customer;
    private String orderPosition;

    public String getOrderPosition() {
        if(orderPosition == null){
            orderPosition = new String();
        }
        return orderPosition;
    }

    public void setOrderPosition(String orderPosition) {
        this.orderPosition = orderPosition;
    }
    public BuyOrderItem(){
    }
    
    public BuyOrderItem(Item item,Customer customer,int quantity){
    this.item=item;
    this.customer=customer;
    this.quantity=quantity;
    }

   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
   
    
    @Override
    public String toString()
    {
       return item.getItemName();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Evaluate getEvaluate() {
        if(evaluate ==null){
            evaluate = new Evaluate();
        }
        return evaluate;
    }

    public void setEvaluate(Evaluate evaluate) {
        this.evaluate = evaluate;
    }
    
    public String getCreateTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return format.format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setFeedbackend(ArrayList<String> feedbackend) {
        this.feedbackend = feedbackend;
    }

    public ArrayList<String> getFeedbackends() {
        if(feedbackend == null){
            feedbackend = new ArrayList<String>();
        }
        return feedbackend;
    }
    
}
