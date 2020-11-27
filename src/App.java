import java.io.File;
import java.io.FileNotFoundException;
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

      // for (int i = 0; i < computers.size(); i++) {
      //   if(computers.get(i) instanceof Desktop) {
      //     Desktop auxDesk = (Desktop)computers.get(i);
      //     auxDesk.print();
      //     System.out.println();
      //   }
      //   if(computers.get(i) instanceof Notebook) {
      //     Notebook auxNote = (Notebook)computers.get(i);
      //     auxNote.print();
      //     System.out.println();
      //   }
      // }

    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado!");
    }
    

    Loja loja = new Loja(computers);

  }
}
