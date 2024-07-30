package inheritance;

public class SinhvienCoKhi extends Sinhvien {
	private String skill;

	public SinhvienCoKhi(String skill, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	void TinhDiem() {
		// TODO Auto-generated method stub

	}
}
