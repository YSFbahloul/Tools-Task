package EJB;


public class CalResult {
	public CalResult(double r){
		Result =r;
	}
	private double Result;
	public double getResult() {
		return Result;
	}
	public void setResult(double r) {
		Result=r;
	}
}