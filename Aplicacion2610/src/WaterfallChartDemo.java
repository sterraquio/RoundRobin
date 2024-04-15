
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class WaterfallChartDemo extends JFrame {

    JFreeChart chart;//declaramos un objeto de la clase JFreeChart para construir el grafico

    public WaterfallChartDemo() {
        //crear el JFrame
        super("Ejemplo de WaterfallChart");
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        crearGrafico();//metodo para cargar los datos y crear el grafico

        ChartPanel panel = new ChartPanel(chart, false);//ChartPanel es una clase del paquete JFreeChart
        //es igual que JPanel de swing. Sobre el ChartPanel se crea el grafico
        panel.setBounds(10, 20, 760, 520);//damos ubicacion y tamano al panel
        add(panel); //anadimos el panel al JFrame

        setVisible(true); //mostrar el JFrame  
    }

    public void crearGrafico() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1, "Mazda", "Jaime");//ventas de Mazda de Jaime
        dataset.addValue(4, "Mazda", "Valeria");//ventas de Mazda de Valeria
        dataset.addValue(3, "Mazda", "Sebastian");//ventas de Mazda de Sebastian
        dataset.addValue(5, "Mazda", "Valentina");//ventas de Mazda de Valentina
        dataset.addValue(2, "Mazda", "Carlos");//ventas de Mazda de Carlos
        dataset.addValue(15, "Mazda", "Total");
        
        chart = ChartFactory.createWaterfallChart("Ventas 2014", 
                "Vendedores", 
                "Cantidad de Vehiculos",
                dataset, 
                PlotOrientation.VERTICAL, 
                true,true, false);
        
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        p.setDomainGridlinesVisible(true);
        p.setDomainGridlinePaint(Color.black);
    }
    
    public static void main(String[] args) {
        WaterfallChartDemo demo = new WaterfallChartDemo();
    }
    
}
