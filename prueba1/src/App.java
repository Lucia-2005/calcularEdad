public class App {
    /**
     * int edad edad del objeto
     */
    int edad=20;
    String nombre="Paula";
    int añoNacimiento=2005;

    /**
     * 
     * @param edad mmiaumiau
     * @return miaumiau
     */
    boolean comprobarEdad(int edad){
        boolean menor=false;
        if(edad>18){
            System.out.println("es mayor de edad!");
            menor=false;

        }else{
            System.out.println("aun no es mayor de edad !");
            menor=true;
        }
        return menor;
    }



    public static void main(String[] args) throws Exception {
    
    }
}
