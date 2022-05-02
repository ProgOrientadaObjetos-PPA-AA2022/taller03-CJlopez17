package institucion;
public class Ejecutor {
    public static void main(String[] args) {
        Institucion tm = new Institucion();
        String nombre = "Unidad Educativa Marista Catacocha";
        String tip_inst = "Publica";
        int num_alum = 1800;
        int num_docen = 36;
        int num_sedes = 3;
        double gatos = 2000.65;
     
        tm.establecer_nombre(nombre);
        tm.establecer_tip_inst(tip_inst);
        tm.establecer_num_alum(num_alum);
        tm.establecer_num_docen(num_docen);
        tm.establecer_num_sedes(num_sedes);
        tm.establecer_gastos(gatos);
        tm.establecer_presupuesto();
       
        System.out.printf("Nombre: %s\nTipo: %s\nNumero de alumnos: %2d\n"
                + "Numero de Docentes: %2d\nNumero de sedes: %2d\n"
                + "Gastos: %.2f\nPresupuesto: %.2f\n: ",tm.obtener_nombre(),
                tm.obtener_tip_inst(),tm.obtener_num_alum(),tm.obtener_num_docen(),
                +tm.obtener_num_sedes(),tm.obtener_gastos(),tm.obtener_presupuesto());          
    }
}
