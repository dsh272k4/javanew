package bt_abstract;

public class SinhvienCoKhi extends Sinhvien {
	private double scoreCNC;
	private double scorePLC;

	public SinhvienCoKhi(double scoreCNC, double scorePLC) {
		super();
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	double getScore() {
		return (this.scoreCNC + this.scorePLC) / 2;
	}
}
