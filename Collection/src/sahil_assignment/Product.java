package sahil_assignment;

public class Product {
 private String porductName;
 private Integer porductID;
 private  Double porductPrice;
 
public Product(String porductName, Integer porductID, Double porductPrice) {
	super();
	this.porductName = porductName;
	this.porductID = porductID;
	this.porductPrice = porductPrice;
}

public String getPorductName() {
	return porductName;
}

public void setPorductName(String porductName) {
	this.porductName = porductName;
}

public Integer getPorductID() {
	return porductID;
}

public void setPorductID(Integer porductID) {
	this.porductID = porductID;
}

public Double getPorductPrice() {
	return porductPrice;
}

public void setPorductPrice(Double porductPrice) {
	this.porductPrice = porductPrice;
}

@Override
public String toString() {
	return "Product [porductName=" + porductName + ", porductID=" + porductID + ", porductPrice=" + porductPrice + "]";
}
 
  
}
