package classes;

public class Desktop extends Computador {
  private Boolean isAllInOne;

  public Desktop(String nameCPU, Integer sizeRAM, Double price, Boolean isAllInOne) {
    super(nameCPU, sizeRAM, price);
    this.isAllInOne = isAllInOne;
  }

  @Override
  public Double calcDiscount() {
    return this.isAllInOne && getSizeRAM() > 4 ? getPrice() * 0.2 : getPrice() * 0.1; 
  }

  @Override
  public void print() {
    System.out.printf("nameCPU = %s\n", getNameCPU());
    System.out.printf("sizeRAM = %d\n", getSizeRAM());
    System.out.printf("price = %.2f\n", getPrice());
    System.out.printf("isAllInOne = %s\n", getIsAllInOne() ? "Sim" : "Não");
  }

  public Boolean getIsAllInOne() {
    return this.isAllInOne;
  }

  public void setIsAllInOne(Boolean isAllInOne) {
    this.isAllInOne = isAllInOne;
  }
}
