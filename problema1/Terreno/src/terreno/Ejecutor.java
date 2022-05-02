package terreno;
public class Ejecutor {
    public static void main(String[] args) {
        Terreno ter = new Terreno();
        double ancho = 20.01;
        double largo = 40.01;
        double valorMetroCuadrado = 20.00; 
        
        ter.establecerancho(ancho);
        ter.establecerlargo(largo);
        ter.establecervalorMetroCuadrado(valorMetroCuadrado);
        ter.establecerarea();
        ter.establecercosto_terreno();
        
        System.out.printf("Largo: %.2f\nAncho: %.2f\nArea: %.2f\nValor del Metro Cuadrado: "
                +"%.2f\nValor Total: %.2f\n",ter.obtenerlargo(),
                +ter.obtenerancho(),ter.obtenerarea(),ter.obtenervalorMetroCuadrado(),
                +ter.obtenercosto_terreno());     
    }
    
}
