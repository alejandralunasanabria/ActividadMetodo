public class mostrarMensaje {

    //Crear metodo
    public static void mostrarMensaje(String mensaje){
        System.out.println("mensaje: " + mensaje);
        mostrarDiaSemana();
    }


    //llamar metodo
    public static void main(String[] args) {
        mensaje("Mostrar Mensaje");
    }


    // Aquí agregamos 'static' antes de 'void'
    public static void mostrarDiaSemana(){
        System.out.println("Lunes Martes Miercoles Jueves Viernes Sabado Domingo");
    }
}
