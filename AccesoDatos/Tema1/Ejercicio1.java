package AccesoDatos.Tema1;
import java.io.*;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        if (args != null) {
            File fichero = new File(args[0]);
            File directorio = new File(args[1]);

            Ejercicio1 miclase = new Ejercicio1();
            System.out.println( miclase.estaEn(fichero, directorio));
        }
    }

    public boolean estaEn(File fichero, File directorio) {
        if (fichero.isFile()) {
            if(directorio.isDirectory()){
                if(fichero.getParent().equals(directorio.getPath()))
                {
                    /**
                     * Si entramos aquí sabemos que los nombres se 
                     * han pasado bien, y que el directorio es el padre del fichero
                     */
                    File posibleFich = new File(directorio.getPath() + fichero.getName());
                    if (posibleFich.exists()){
                        return true;
                    }
                    else return false;
                }
            }
        }
        return false;
    }
}
