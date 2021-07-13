package zhaaldz.leccion7.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File ruta = new File("C:\\Users\\Pablo\\Desktop\\Cumples.txt"); //Ruta del archivo
        
        BufferedReader lectorArchivo = new BufferedReader(new FileReader(ruta));
        
        String linea = lectorArchivo.readLine();
        
        while(linea != null) {
            System.out.println(linea);
            linea = lectorArchivo.readLine();
        }
    }
}
