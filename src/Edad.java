import java.util.Scanner;

/**
 * @author Lucia Castañera
 * @version 1.0
 */
public class Edad {

    int edad=20;
    String nombre="Paula";
    int añoNacimiento=2005;

    /**
     * 
     * @param edad introduce la edad del objeto
     * @param nombre el nombre del objeto
     * @param añoNacimiento el año de nacimiento del objeto
     */
    public Edad(int edad, String nombre, int añoNacimiento) {
        this.edad = edad;
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
    }


    
    /**
     * 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad coge la edad del objeto especifico
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * 
     * @return menor un true or false basado en si el objeto tiene mayoria de edad
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

    static void menu(){
        System.out.println("1) comprobar si es mayor de edad");
    }


    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("¿desplegar el menu? 0=si/1=no");
        int opcion=sc.nextInt();

    }


    public int getAñoNacimiento() {
        return añoNacimiento;
    }


    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
}
