package horas;
public class Ejecutor {
    public static void main(String[] args) 
    {
        Horas tiempo = new Horas(24);
        System.out.println("Minutos: "+tiempo.getMinutos());
        System.out.println("Segundos: "+tiempo.getSegundos());  
        System.out.println("Dias: "+tiempo.getDias());  
    }
}
