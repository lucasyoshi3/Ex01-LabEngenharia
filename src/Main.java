import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "C://texto.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(System.in);
        String nome;
        try {
            if(file.createNewFile()){
                System.out.println("Arquivo Criado");
            }
            FileWriter fileWriter = new FileWriter(fileName);

            while(true){
                System.out.println("Escreva o nome");
                nome = sc.next();
                if(!nome.equals("SAIR")){
                    fileWriter.write(nome+"\n");
                }else{
                    fileWriter.close();
                    System.out.println("Escrita Finalizada");
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}