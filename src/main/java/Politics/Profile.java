package Politics;

public class Profile {

	public static void main(String[] args) {

		Governors sanwoOlu = new Governors("Sanwo Olu", Party.APC, 50, "Lagos", 20);
		System.out.println(sanwoOlu);

		President tinubu = new President("Bola Tinubu", Party.SPD, 70, "Nigeria", 37);
		System.out.println(tinubu);

	}

}
