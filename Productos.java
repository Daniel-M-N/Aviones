
public class Productos {
private int id;
 private String nombre;
private String descripcion;
 private int cantidad;
private double precio;

// Constructor
public Productos(int id, String nombre, String descripcion, int cantidad, double precio) {
 this.id = id;
this.nombre = nombre;
this.descripcion = descripcion;
this.cantidad = cantidad;
this.precio = precio;
 }

 // Getters y Setters
 public int getId() { return id; }
public void setId(int id) { this.id = id; }

 public String getNombre() { return nombre; }
 public void setNombre(String nombre) { this.nombre = nombre; }

public String getDescripcion() { return descripcion; }
public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

public int getCantidad() { return cantidad; }
 public void setCantidad(int cantidad) { this.cantidad = cantidad; }

public double getPrecio() { return precio; }
public void setPrecio(double precio) { this.precio = precio; }



}
