package classes;

public abstract class Desktop extends Computador {
  private Boolean isAllInOne;

  public Desktop(String nameCPU, Integer sizeRAM, Double price, Boolean isAllInOne) {
    super(nameCPU, sizeRAM, price);
    this.isAllInOne = isAllInOne;
  }

  @Override
  public Double calcDiscount() {
    return this.isAllInOne && getSizeRAM() > 4 ? getPrice() * 0.2 : getPrice() * 0.1; 
  }

  public Boolean getIsAllInOne() {
    return this.isAllInOne;
  }

  public void setIsAllInOne(Boolean isAllInOne) {
    this.isAllInOne = isAllInOne;
  }
}
