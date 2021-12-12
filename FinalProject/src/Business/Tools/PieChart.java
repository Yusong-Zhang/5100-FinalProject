/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Tools;

import Business.Customer.Customer;
import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Item.Comment;
import Business.Item.Item;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author 13522
 */
public class PieChart extends JFrame {
  String t;
   EcoSystem system;
   Network net;
   Seller seller;
   UserAccount useraccount;
   Item item;
   HashMap<String,Integer> data = new HashMap<String,Integer>();
   ArrayList<String> count = new ArrayList<String>();
   public PieChart( String title ,Item item) {
      super( title ); 
      t = title;
      this.item=item;
      setContentPane(createDemoPanel( ));
      
      
      
   }
   
   private  PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
     
      for(Comment comment:item.getComments().getCommentList()){
          
                   count.add(String.valueOf(comment.getScore())); 
                  
             
         
      }
   
      if (count == null || count.size() == 0) return null;
      for(String s:count){
          Integer i = data.get(s);
          data.put(s,(i==null)?1:i+1);
      }
      
      for(String des :data.keySet()){
          dataset.setValue( des ,  data.get(des) );  
      }
      return dataset;
   }
      private JFreeChart createChart(PieDataset dataset){
      JFreeChart chart = ChartFactory.createPieChart(      
         t,   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      return chart;
   }
   
   public  JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }


}

