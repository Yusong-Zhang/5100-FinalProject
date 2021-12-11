package Business.Tools;

import Business.Customer.Customer;

import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Network.Network;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class PieChart1 extends JFrame {
  String t;
   EcoSystem system;
   Network net;
   HashMap<String,Integer> data = new HashMap<String,Integer>();
   ArrayList<String> count = new ArrayList<String>();
   public PieChart1( String title ,EcoSystem system,Network net) {
      super( title ); 
      t = title;
      this.system = system;
      this.net=net;
      setContentPane(createDemoPanel( ));
      
   }
   
   private  PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      
      for(Customer c:net.getCustomerDirectory().getCustomersList()){
          for(BuyOrderItem buyitem:c.getBuyOrder().getOrderItemList()){
               count.add(buyitem.getItem().getItemName());    
          }
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

