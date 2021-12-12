/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Tools;

import Business.Customer.Customer;
import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Express.ExpressManager;
import Business.Network.Network;
import Business.Seller.Seller;
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

/**
 *
 * @author 13522
 */
public class HistChart1  extends JFrame{
    
       String t;
   EcoSystem system;
   
   HashMap<String,Integer> dataM = new HashMap<String,Integer>();
   HashMap<String,String> dataR = new HashMap<String,String>();
   ArrayList<String> count = new ArrayList<String>();
   public HistChart1( String title ,EcoSystem system) {
      super( title ); 
      t = title;
      this.system = system;
      setContentPane(createDemoPanel( ));
      
   }
    
    private CategoryDataset createDataset() {   
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      for(Network net: system.getNetworkList()){
            int customerNum = 0;
            int buyOrderItemNum = 0;
            int sellerNum = 0;
           
            int expressNum = 0;
            for(Customer customer: net.getCustomerDirectory().getCustomersList()){
                customerNum++;
            }
            for(Seller seller: net.getSellerDirectory().getSellerList()){
                sellerNum++;

            }
            for(ExpressManager express: net.getExpressManagerDir().getExpressManagerList()){
                expressNum++;
            }
            
            dataset.addValue(customerNum, net.getName(), "Customer");
            dataset.addValue(sellerNum, net.getName(), "Seller");
            dataset.addValue(expressNum, net.getName(), "Express");
        }
     return dataset; 
    }
      private JFreeChart createChart(CategoryDataset dataset) { 
        JFreeChart chart = ChartFactory.createBarChart3D(
       		                 "Number of three roles in Countries",
                            "Role", 
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
