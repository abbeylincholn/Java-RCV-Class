package Politics;

public class President extends Politician {

	public String country;
	public int stateCount;

	public President(String name, Party party, int age, String country, int stateCount) {
		super(name, party, age);
		this.country = country;
		this.stateCount = stateCount;

	}

	@Override
	public String toString() {
		return "President [country=" + country + ", stateCount=" + stateCount + ", name=" + name + ", party=" + party
				+ ", age=" + age + "]";
	}

}
