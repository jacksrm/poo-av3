import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Computador;
import classes.Desktop;
import classes.Loja;
import classes.Notebook;

public class App {
  public static void main(String[] args) throws Exception {
    ArrayList<Computador> computers = new ArrayList<Computador>();

    try {
      File fileDesktops = new File("src/files/desktops.txt");
      File fileNotebooks = new File("src/files/notebooks.txt");
      Scanner deskScanner = new Scanner(fileDesktops);
      Scanner noteScanner = new Scanner(fileNotebooks);
      
      while (deskScanner.hasNext()) {
        String cpuName = deskScanner.next();
        Integer ramSize = deskScanner.nextInt();
        Double price = deskScanner.nextDouble();
        Boolean allInOne = deskScanner.nextBoolean();
        
        computers.add(new Desktop(cpuName, ramSize, price, allInOne));
      }
      
      while (noteScanner.hasNext()) {
        String cpuName = noteScanner.next();
        Integer ramSize = noteScanner.nextInt();
        Double price = noteScanner.nextDouble();
        Boolean hasWebCam = noteScanner.nextBoolean();

        computers.add(new Notebook(cpuName, ramSize, price, hasWebCam));
      }
      
      deskScanner.close();
      noteScanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado!");
    }
    
    File fileWebcamAllinOne = new File("src/files/webcamAllinOne.txt");
    
    Loja loja = new Loja(computers);

    try {
      if (fileWebcamAllinOne.createNewFile()) 
        System.out.println("Criado!");
      else 
        System.out.println("Erro ao criar");

      FileWriter writer = new FileWriter(fileWebcamAllinOne);
      
      for (int i = 0; i < loja.webcamAllinOne().size(); i++) {
        if (loja.webcamAllinOne().get(i) instanceof Desktop) {
          Desktop desk = (Desktop)loja.webcamAllinOne().get(i);
          writer.write(
            desk.getNameCPU() + " " +
            desk.getSizeRAM() + " " +
            desk.getPrice() + " " +
            desk.getIsAllInOne() + " " +
            desk.calcDiscount() + "\n"
          );
        }

        if (loja.webcamAllinOne().get(i) instanceof Notebook) {
          Notebook note = (Notebook)loja.webcamAllinOne().get(i);
          writer.write(
            note.getNameCPU() + " " +
            note.getSizeRAM() + " " +
            note.getPrice() + " " +
            note.getHasWebCam() + " " +
            note.calcDiscount() + "\n" 
          );
        }
      }
      writer.close();
    } catch (IOException e) {
      System.out.println("Um erro ocorreu!");
    }
  }
}
