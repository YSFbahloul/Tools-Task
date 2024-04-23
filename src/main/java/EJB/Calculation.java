package EJB;

import javax.persistence.*;
import java.io.*;
@Entity
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	  private double number1;
	  private double number2;
	  private String operation;
	  
	  public void setId(Long id) {
		  this.id=id;
	  }
	  
	  public void setNumber1(double n1) {
		  number1=n1;
	  }
	  
	  public void setNumber2(double n2) {
		  number2=n2;
	  }
	  
	  public void setOperation(String o) {
		  operation=o;
	  }
	  
	  public String getOperation() {
		  return operation;
	  }
	  
	  public double getNumber1() {
		  return number1;
	  }
	  
	  public double getNumber2() {
		  return number2;
	  }
}