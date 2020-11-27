package classes;

import java.util.ArrayList;

public class Loja {
  private ArrayList<Computador> computers;

  public Loja(ArrayList<Computador> computers) {
    this.computers = computers;
  }

  public ArrayList<Computador> webcamAllinOne() {
    ArrayList<Computador> auxList = new ArrayList<Computador>();

    for (int i = 0; i < this.computers.size(); i++) {
      if(computers.get(i) instanceof Desktop) {
        Desktop pcAllInOne = (Desktop)computers.get(i);
        if(pcAllInOne.getIsAllInOne())
          auxList.add(pcAllInOne);
      }
        
      if(computers.get(i) instanceof Notebook) {
        Notebook noteWebCam = (Notebook)computers.get(i);
        if(noteWebCam.gethasWebCam())
          auxList.add(noteWebCam);
      }
    }

    return auxList;
  }

  public ArrayList<Computador> getComputers() {
    return this.computers;
  }

  public void setComputers(ArrayList<Computador> computers) {
    this.computers = computers;
  }
}
