void main() {
    Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
    Servidor s2 = new Servidor("BaseDatos", "192.168.1.30");
    Servidor s3 = new Servidor("ServidorMail", "192.168.1.40");

    // Activar únicamente dos servidores
    s1.activar();
    s2.activar();
    s3.activar();

    System.out.println("-------------------");
    s1.mostrarInformacion();
    s2.mostrarInformacion();
    s3.mostrarInformacion();

    System.out.println("-------------------");
    System.out.println("Total de servidores: " + Servidor.getTotalServidores());
    System.out.println("Servidores activos: " + Servidor.getServidoresActivos());
}