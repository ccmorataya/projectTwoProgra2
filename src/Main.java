public class Main {

    static Queue accion=new Queue();
    public static void main(String[] args) {
        int opc=0;
        while(true){
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "---------------------------------------\n" +
                            "Cola en Java\n"          +
                            "---------------------------------------\n" +
                            "1. Introducir dato\n"      +
                            "2. Sacar dato\n"       +
                            "3. Ver datos introducidos\n"    +
                            "4. Borrar los datos de la cola\n"   +
                            "---------------------------------------\n" +
                            "5. Salir\n"        +
                            "---------------------------------------\n" +
                            "Teclea el numero de la accion a relizar:"
            ));
            switch(opc){
                case 1: accion.Introducir();
                    break;
                case 2: accion.Sacar();
                    break;
                case 3: accion.Mostrar();
                    break;
                case 4: accion.Borrar();
                    break;
                case 5: System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
                    break;
            }
        }
    }
}
