package Politics;

public class Governors extends Politician {

	public String state;
	public int lgaCount;

	public Governors(String name, Party party, int age, String state, int lgaCount) {
		super(name, party, age);
		this.state = state;
		this.lgaCount = lgaCount;

	}

	@Override
	public String toString() {
		return "Governors [state=" + state + ", lgaCount=" + lgaCount + ", name=" + name + ", party=" + party + ", age="
				+ age + "]";
	}

}
