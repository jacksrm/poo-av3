package classes;

public class Notebook extends Computador {
  private Boolean hasWebCam;

  public Notebook(String nameCPU, Integer sizeRAM, Double price, Boolean hasWebCam) {
    super(nameCPU, sizeRAM, price);
    this.hasWebCam = hasWebCam;
  }

  @Override
  public Double calcDiscount() {
    return  getSizeRAM() > 5 ? getPrice() * 0.15 : getPrice() * 0.05; 
  }

  @Override
  public void print() {
    System.out.printf("nameCPU = %s\n", getNameCPU());
    System.out.printf("sizeRAM = %d\n", getSizeRAM());
    System.out.printf("price = %.2f\n", getPrice());
    System.out.printf("hasWebCam = %s\n", getHasWebCam() ? "Sim" : "Não");
  }

  public Boolean getHasWebCam() {
    return this.hasWebCam;
  }

  public void setHasWebCam(Boolean hasWebCam) {
    this.hasWebCam = hasWebCam;
  }
}
