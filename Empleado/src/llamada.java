import java.util.Scanner;

public class llamada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del empleado");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa la ocupacion del empleado");
        String ocupacion = scanner.nextLine();
        System.out.println("Ingresa la edad del empleado");
        int edad = scanner.nextInt();


        empleado num1 = new empleado(nombre,ocupacion,edad);
        num1.mensaje();
    }
}
