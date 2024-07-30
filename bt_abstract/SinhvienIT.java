package bt_abstract;

public class SinhvienIT extends Sinhvien {
	private double scoreJava;
	private double scoreHTML;

	public SinhvienIT(double scoreJava, double scoreHTML) {
		super();
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	double getScore() {
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

}
