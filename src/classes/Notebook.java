package classes;

public  abstract class Notebook {
	 private String nameCPU;
	  private Integer sizeRAM;
	  private Double price;
	  private Boolean hasWebCam ;
	  
	  public Notebook(String nameCPU, Integer sizeRAM, Double price, Boolean hasWebCam) {
		    this.nameCPU = nameCPU;
		    this.sizeRAM = sizeRAM;
		    this.price = price;
		    this.hasWebCam = hasWebCam;
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
		  
		  public Boolean gethasWebCam(Boolean hasWebCam) {
			    return this.hasWebCam;
			  }
		  
		  public void sethasWebCam(Boolean hasWebCam) {
			    this.hasWebCam = hasWebCam;
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
