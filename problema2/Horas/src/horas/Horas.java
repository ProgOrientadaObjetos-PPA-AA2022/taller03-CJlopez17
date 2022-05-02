    package horas;
public class Horas {
    private double horas;
    public Horas (double horas){
        this.horas = horas; 
    }
    public double getMinutos(){
        double minutos = (horas*60);
        return minutos;
    }
    public double getSegundos(){
        double segundos = (horas*3600);
        return segundos;
    }
    public double getDias(){
        double dias = (horas/24);
        return dias;
    }
}
