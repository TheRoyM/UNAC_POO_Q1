public class Animales {    private String nombre;    private String color;    private int edad;    private double altura;    public Animales() {    }    public Animales(String nombre, String color, int edad, double altura) {        this.nombre = nombre;        this.color = color;        this.edad = edad;        this.altura = altura;    }    public String getNombre() {        return nombre;    }    public void setNombre(String nombre) {        this.nombre = nombre;    }    public String getColor() {        return color;    }    public void setColor(String color) {        this.color = color;    }    public int getEdad() {        return edad;    }    public void setEdad(int edad) {        this.edad = edad;    }    public double getAltura() {        return altura;    }    public void setAltura(double altura) {        this.altura = altura;    }    @Override    public String toString() {        return  " " + nombre  +                ", de color: " + color +                ", con una edad de: " + edad +                ", y con una altura de: " + altura;    }}