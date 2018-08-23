package practica_1;
public class Practica_1 
{
    public static void main(String[] args) 
    {
        Disco CD = new Disco();
        String Formato = CD.getFormato();
        String Nombre = CD.getNombre();
        String Artista = CD.getArtista();
        String Genero = CD.getGenero();
        String Duracion = CD.getDuracion();
        String Discografica = CD.getDiscografica();
        String Productor = CD.getProductor();
        int Año = CD.getAño(); 
        
        System.out.println("Comprar disco:");
        System.out.println("Formato: "+Formato);
        System.out.println("Nombre: "+Nombre);
        System.out.println("Artista: "+Artista);
        System.out.println("Genero: "+Genero);
        System.out.println("Duracion: "+Duracion);
        System.out.println("Discografica: "+Discografica);
        System.out.println("Productor: "+Productor);
       
        System.out.println("Año: "+Año);   
    }
}
