package br.edu.catolica.ecommerce.arquivos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Arquivos {
    
    public static void main(String[] args) {

        Path caminho = Paths.get("src/br/edu/catolica/ecommerce/arquivos/exemplo.txt");

        try (Stream<String> lines = Files.lines(caminho)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stream<String> l = null;

        try{
            l = Files.lines(caminho);
            l.forEach(System.out::println);
        }catch(IOException ex){
             ex.printStackTrace();
        }finally{
            if( l != null){
                l.close();
            }
        }
    }
   
}




