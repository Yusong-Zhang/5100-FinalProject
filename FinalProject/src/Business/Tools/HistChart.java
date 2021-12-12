/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Tools;


import Business.Customer.Customer;
import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Network.Network;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author 30481
 */
public class HistChart extends JFrame{
    
     
       String t;
   EcoSystem system;
   
   HashMap<String,Integer> dataM = new HashMap<String,Integer>();
   HashMap<String,String> dataR = new HashMap<String,String>();
   ArrayList<String> count = new ArrayList<String>();
   public HistChart( String title ,EcoSystem system) {
      super( title ); 
      t = title;
      this.system = system;
      setContentPane(createDemoPanel( ));
      
   }
    
    private CategoryDataset createDataset() {   
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      for(Network net:system.getNetworkList()){
          int countNum=0;
          
          
       for(Customer c:net.getCustomerDirectory().getCustomersList()){
          for(BuyOrderItem buyItem:c.getBuyOrder().getOrderItemList()){
               countNum++;
               
//                dataR.put(odp.getFoodName(),odp.getResName()); 
//                count.add(odp.getFoodName());      
              }       
          }
       
         dataset.addValue(countNum, net.getName(), "Item");
      }
     
   
          
      
//      if (count == null || count.size() == 0) return null;
//      for(String s:count){
//          Integer i = dataM.get(s);
//          dataM.put(s,(i==null)?1:i+1);
//      }
//      System.out.println(dataR);
//      System.out.println(dataM);
//      for(String menu :dataM.keySet()){
//          dataset.addValue(dataM.get(menu),dataR.get(menu),menu);  
//      }
//          
      
      return dataset;      
}
    private JFreeChart createChart(CategoryDataset dataset) {   
     JFreeChart chart = ChartFactory.createBarChart3D(
       		                 "National Selling Num",
                            "Nation", 
                            "Quantity", 
                            dataset, 
                            PlotOrientation.VERTICAL, 
                            true,           
                            false,          
                            false           
                            );
        
    return chart;   
}
    
    public  JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }
}
