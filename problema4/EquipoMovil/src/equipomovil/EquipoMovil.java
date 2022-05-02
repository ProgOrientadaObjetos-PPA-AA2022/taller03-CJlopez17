package equipomovil;
public class EquipoMovil {
    private String sis_op;
    private double tam_pant;
    private double cost_in;
    private double iva1;
    private double iva2;
    private String Mac; 
    private int IMEI;
    
    public void establecer_sis_op(String c){
        sis_op = c;
    }
    public void establecer_tam_pant(double c){
        tam_pant = c;
    }
    public void establecer_cost_in(double c){
        cost_in = c;
    }
    public void establecer_iva1(double c){
        iva1 = c;
    }
    public void establecer_iva2(){
        iva2 = cost_in * iva1;
    }
    public void establecer_Mac(String c){
        Mac = c;
    }
    public void establecer_IMEI(int c){
        IMEI = c;
    }
    public String obtener_sis_op(){
        return sis_op; 
    }
    public double obtener_tam_pant(){
        return tam_pant; 
    }
    public double obtener_cost_in(){
        return cost_in; 
    }
    public double obtener_iva1(){
        return iva1; 
    }
    public double obtener_iva2(){
        return iva2; 
    }
    public String obetner_Mac(){
        return Mac;
    }
    public int obtener_IMEI(){
        return IMEI;
    }
}
