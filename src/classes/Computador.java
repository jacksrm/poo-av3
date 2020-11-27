package classes;

public abstract class Computador {
  private String nameCPU;
  private Integer sizeRAM;
  private Double price;

  public Computador(String nameCPU, Integer sizeRAM, Double price) {
    this.nameCPU = nameCPU;
    this.sizeRAM = sizeRAM;
    this.price = price;
  }

  public abstract Double calcDiscount();

  public String getNameCPU() {
    return this.nameCPU;
  }

  public void setNameCPU(String nameCPU) {
    this.nameCPU = nameCPU;
  }

  public Integer getSizeRAM() {
    return this.sizeRAM;
  }

  public void setSizeRAM(Integer sizeRAM) {
    this.sizeRAM = sizeRAM;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

}
