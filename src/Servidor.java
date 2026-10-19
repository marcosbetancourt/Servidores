public class Servidor {
    // Atributos privados
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    // Atributos static compartidos
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    // Constructor requerido
    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isActivo() {
        return activo;
    }

    // Métodos static para consultar contadores
    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }

    // Métodos con control del contador de servidores activos
    public void activar() {
        if (!this.activo) {
            this.activo = true;
            servidoresActivos++;
            System.out.println("El servidor " + nombre + " ha sido activado.");
        } else {
            System.out.println("El servidor " + nombre + " ya se encontraba activo.");
        }
    }

    public void desactivar() {
        if (this.activo) {
            this.activo = false;
            servidoresActivos--;
            System.out.println("El servidor " + nombre + " ha sido desactivado.");
        } else {
            System.out.println("El servidor " + nombre + " ya se encontraba apagado.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id +
                "\nNombre: " + nombre +
                "\nDirección IP: " + direccionIP +
                "\nActivo: " + activo);
    }
}