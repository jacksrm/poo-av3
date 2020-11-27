package classes;

public abstract class Notebook extends Computador {
  private Boolean hasWebCam;

  public Notebook(String nameCPU, Integer sizeRAM, Double price, Boolean hasWebCam) {
    super(nameCPU, sizeRAM, price);
    this.hasWebCam = hasWebCam;
  }

  public Double calcDiscount() {
    
  };


  public Boolean gethasWebCam(Boolean hasWebCam) {
    return this.hasWebCam;
  }

  public void sethasWebCam(Boolean hasWebCam) {
    this.hasWebCam = hasWebCam;
  }
}
