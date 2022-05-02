package equipomovil;
public class Ejecutor {
    public static void main(String[] args) {
        EquipoMovil tm = new EquipoMovil();
        String sis_op = "Adroid";
        double tam_pant = 6.5;
        double cost_in = 486.00;
        double iva1 = 0.12;
        String Mac = "01:3A:1D:54:6B:32"; 
        int IMEI = 2134658976;
        
        tm.establecer_sis_op(sis_op);
        tm.establecer_tam_pant(tam_pant);
        tm.establecer_cost_in(cost_in);
        tm.establecer_iva1(iva1);
        tm.establecer_Mac(Mac);
        tm.establecer_IMEI(IMEI);
        tm.establecer_iva2();
        
        System.out.printf("Sistema operativo: %s\nTamanio de la pantalla: %s\n"
                + "Direccion Mac: %s\nDireccion IMEI: %d\nCosto sin iva: %.2f Iva: %.2f\n"
                + "Costo total: %.2f\n",tm.obtener_sis_op(),tm.obtener_tam_pant(),
                tm.obetner_Mac(), tm.obtener_IMEI(),tm.obtener_cost_in(),
                tm.obtener_iva1(),tm.obtener_iva2());
    }
}
