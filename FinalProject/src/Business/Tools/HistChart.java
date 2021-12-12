/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Tools;

/**
 *
 * @author 13522
 */


import Business.Customer.Customer;

import Business.EcoSystem;

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
    
//       String t;
//   EcoSystem system;
//   HashMap<String,Integer> dataM = new HashMap<String,Integer>();
//   HashMap<String,String> dataR = new HashMap<String,String>();
//   ArrayList<String> count = new ArrayList<String>();
//   public HistChart( String title ,EcoSystem system) {
//      super( title ); 
//      t = title;
//      this.system = system;
//      setContentPane(createDemoPanel( ));
//      
//   }
//    
//    private CategoryDataset createDataset() {   
//    DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
//      
//      for(Customer c:system.getCustomerDirectory().getCustomersList()){
//          for(CustomerTravelPlan ctp:c.getCustomerOrderHistory()){
//              for(OneDayPlan odp: ctp.getTravelPlan()){
//                dataR.put(odp.getFoodName(),odp.getResName()); 
//                count.add(odp.getFoodName());      
//              }
//                  
//          }
//      }
//      
//      if (count == null || count.size() == 0) return null;
//      for(String s:count){
//          Integer i = dataM.get(s);
//          dataM.put(s,(i==null)?1:i+1);
//      }
////      System.out.println(dataR);
////      System.out.println(dataM);
//      for(String menu :dataM.keySet()){
//          dataset.addValue(dataM.get(menu),dataR.get(menu),menu);  
//      }
//          
//      
//      return dataset;      
//}
//    private JFreeChart createChart(CategoryDataset dataset) {   
//    JFreeChart chart = ChartFactory.createBarChart("Popular Restaurant", // chart title   
//                "Restaurant", // domain axis label   
//                "Frequency", // range axis label   
//                dataset, // data   
//                PlotOrientation.VERTICAL, // å›¾æ ‡æ–¹å�‘   
//                true, // æ˜¯å�¦æ˜¾ç¤ºlegend   
//                true, // æ˜¯å�¦æ˜¾ç¤ºtooltips   
//                false // æ˜¯å�¦æ˜¾ç¤ºURLs   
//        );   
//    return chart;   
//}
//    
//    public  JPanel createDemoPanel( ) {
//      JFreeChart chart = createChart(createDataset( ) );  
//      return new ChartPanel( chart ); 
//   }
}

