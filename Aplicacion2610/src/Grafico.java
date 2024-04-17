
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;

public class Grafico extends JFrame {
    
    private Procesar unProceso;

    JFreeChart chart;//declaramos un objeto de la clase JFreeChart para construir el grafico

    public Grafico() {
        //crear el JFrame
        super("Ejemplo de GanttChart");
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
        TaskSeries Proceso1 = new TaskSeries("Proceso 1");
        Proceso1.add(new Task("Ronda 1",
//                unProceso.getCantidadProcesos(),
                
                Date.from(LocalDate.of(2017, 7, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 7).atStartOfDay().toInstant(ZoneOffset.UTC))));

        Proceso1.add(new Task("Ronda 1", 
                Date.from(LocalDate.of(2017, 7, 10).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 14).atStartOfDay().toInstant(ZoneOffset.UTC))));

        Proceso1.add(new Task("Ronda 2", 
                Date.from(LocalDate.of(2017, 7, 17).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 21).atStartOfDay().toInstant(ZoneOffset.UTC))));

        Proceso1.add(new Task("Ronda 3", 
                Date.from(LocalDate.of(2017, 7, 24).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 28).atStartOfDay().toInstant(ZoneOffset.UTC))));

        Proceso1.add(new Task("Ronda 4", 
                Date.from(LocalDate.of(2017, 07, 31).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 8, 4).atStartOfDay().toInstant(ZoneOffset.UTC))));

        
        TaskSeries series2 = new TaskSeries("Proceso 2");
        series2.add(new Task("Ronda 1", 
                Date.from(LocalDate.of(2017, 7, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 6).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series2.add(new Task("Ronda 2",
                Date.from(LocalDate.of(2017, 7, 6).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 17).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series2.add(new Task("Ronda 3",
                Date.from(LocalDate.of(2017, 7, 18).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 27).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series2.add(new Task("Ronda 4",
                Date.from(LocalDate.of(2017, 7, 24).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 30).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series2.add(new Task("Ronda 5",
                Date.from(LocalDate.of(2017, 8, 2).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 8, 4).atStartOfDay().toInstant(ZoneOffset.UTC))));
        
        
        TaskSeries series3 = new TaskSeries("Proceso 3");
        series3.add(new Task("Ronda 1", 
                Date.from(LocalDate.of(2017, 7, 3).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 6).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series3.add(new Task("Ronda 2",
                Date.from(LocalDate.of(2017, 7, 6).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 17).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series3.add(new Task("Ronda 3",
                Date.from(LocalDate.of(2017, 7, 18).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 27).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series3.add(new Task("Ronda 4",
                Date.from(LocalDate.of(2017, 7, 24).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 7, 30).atStartOfDay().toInstant(ZoneOffset.UTC))));

        series3.add(new Task("Ronda 5",
                Date.from(LocalDate.of(2017, 8, 2).atStartOfDay().toInstant(ZoneOffset.UTC)),
                Date.from(LocalDate.of(2017, 8, 4).atStartOfDay().toInstant(ZoneOffset.UTC))));

        TaskSeriesCollection dataset = new TaskSeriesCollection();
        dataset.add(Proceso1);
        dataset.add(series2);
        dataset.add(series3);
        // Create chart  
        chart = ChartFactory.createGanttChart(
                "Parte Grafica",  // Titulo
                "Rondas",   // Etiqueta de X  
                "Segundos ",      // Etiqueta de Y
                dataset,                // Conjunto de datos
                true, true, true);
    }

    public static void main(String[] args) {
        Grafico demo = new Grafico();
    }
}
