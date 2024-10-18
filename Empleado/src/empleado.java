public class empleado {
    String nombre;
    String ocupacion;
    int edad;
    public empleado(String nombre, String ocupacion, int edad){
        this.nombre=nombre;
        this.ocupacion=ocupacion;
        this.edad=edad;

    }


public void mensaje(){
    System.out.println("El empleado se llama; "+nombre+" Que tiene el cargo de; "+ocupacion+" Con la edad de; "+edad);
    }
}