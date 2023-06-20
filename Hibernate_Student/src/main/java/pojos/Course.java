package pojos;

public enum Course {
	DAC(106200),DBDA(13500),DITISS(106200);
	
	private double fees;

	private Course(double fees) {
		this.fees = fees;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
}
