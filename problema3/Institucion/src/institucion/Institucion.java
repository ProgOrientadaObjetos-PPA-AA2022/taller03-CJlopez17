package institucion;
public class Institucion {
    private String nombre;
    private String tip_inst;
    private int num_alum;
    private int num_docen;
    private int num_sedes;
    private double gastos;
    private double presupuesto;
     
    public void establecer_nombre(String c){
        nombre = c;
    }
    public void establecer_tip_inst(String c){
        tip_inst = c;
    } 
    public void establecer_num_alum(int c){
        num_alum = c;
    }
    public void establecer_num_docen(int c){
        num_docen = c;
    }
    public void establecer_num_sedes(int c){
        num_sedes = c;
    }
    public void establecer_gastos(double c){
        gastos = c;
    }
    public void establecer_presupuesto(){
        presupuesto = num_alum * gastos;
    }
    public String obtener_nombre(){
        return nombre;
    }
     public String obtener_tip_inst(){
        return tip_inst;
    }
    public int obtener_num_alum(){
        return num_alum;
    }
    public int obtener_num_docen(){
        return num_docen;
    }
    public int obtener_num_sedes(){
        return num_sedes;
    }
    public double obtener_gastos(){
        return gastos;
    }
    public double obtener_presupuesto(){
        return presupuesto;
    }
}
