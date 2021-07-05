package guiIntro;

public class ReturnHandler{
	
	//variables
	private String tanReturn;
	private String notReturn;
	private String cityReturn;
	private String provinceReturn;
	private String piReturn;
	private String riReturn;
	
	//constructor
	public ReturnHandler(String tanReturn, String notReturn, String cityReturn, String provinceReturn, String piReturn,
			String riReturn) {
		super();
		this.tanReturn = tanReturn;
		this.notReturn = notReturn;
		this.cityReturn = cityReturn;
		this.provinceReturn = provinceReturn;
		this.piReturn = piReturn;
		this.riReturn = riReturn;
	}

	//toString method to print 
	@Override
	public String toString() {
		return String.format("TAN: " + tanReturn + "\n"
				+ "NOT: " + notReturn + "\n"
				+ "City: " + cityReturn + "\n"
				+ "Province: " + provinceReturn + "\n"
				+ "PI: " + piReturn + "\n"
				+ "RI: " + riReturn + "\n");

	}
	
}






