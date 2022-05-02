package terreno;
public class Terreno {
    private double costo_terreno; 
    private double ancho; 
    private double largo; 
    private double area; 
    private double valorMetroCuadrado; 
       
    public void establecerancho(double c){
        ancho = c; 
    }
    public void establecerlargo(double c){
        largo = c;
    }
    public void establecerarea(){
        area = ancho * largo;
    }
    public void establecervalorMetroCuadrado(double c){
        valorMetroCuadrado =  c;
    }
    public void establecercosto_terreno(){
        costo_terreno = valorMetroCuadrado * area;
    } 
    public double obtenercosto_terreno(){
        return costo_terreno;
    }
    public double obtenerancho(){
        return ancho;
    }
    public double obtenerlargo(){
        return largo;
    }
    public double obtenerarea(){
        return area;
    }
    public double obtenervalorMetroCuadrado(){
        return valorMetroCuadrado;
    }
}    
