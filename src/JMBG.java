public class JMBG {
	public static void main(String[] args) {
		String ime = "Haris";
		String prezime = "Arifovic";
		String datumRodjenja = "08.03.1992.";
		String pol = "Musko";
		System.out.println(ime);
		System.out.println(prezime);
		System.out.println(datumRodjenja);
		System.out.println(pol);
		System.out.println((int) (Math.random() * 6) + 1);
		System.out.println((int) (Math.random() * 6) + 1);
		System.out.println((int) (Math.random() * 6) + 1);
		System.out.println((int) (Math.random() * 6) + 1);
		System.out.println((int) (Math.random() * 6) + 1);
		String jmbg = "0803992183913";
		System.out.println("Datum rodjenja:\t\t " + jmbg.substring(0, 2) + "."
				+ jmbg.substring(2, 4) + ".19" + jmbg.substring(5, 7) + ".");
		String gender = "499";
		String provjeraSpola = jmbg.substring(9, 12);
		System.out.println("Za musko je rezultat -1, za zensko 1: "
				+ provjeraSpola.compareTo(gender));
		System.out.println("Regija:  \t\t" + jmbg.substring(7, 9));
		String pali = "aBcDe";
		System.out.println(pali + pali.substring(4, 5) + pali.substring(3, 4)
				+ pali.substring(2, 3) + pali.substring(1, 2)
				+ pali.substring(0, 1));
		char A = jmbg.charAt(0);
		char B = jmbg.charAt(1);
		char C = jmbg.charAt(2);
		char D = jmbg.charAt(3);
		char E = jmbg.charAt(4);
		char F = jmbg.charAt(5);
		char G = jmbg.charAt(6);
		char H = jmbg.charAt(7);
		char I = jmbg.charAt(8);
		char J = jmbg.charAt(9);
		char K = jmbg.charAt(10);
		char L = jmbg.charAt(11);
		char Z = jmbg.charAt(12);
		int provjera = (A - 48) * 7 + (B - 48) * 6 + (C - 48) * 5 + (D - 48)
				* 4 + (E - 48) * 3 + (F - 48) * 2 + (G - 48) * 7 + (H - 48) * 6
				+ (I - 48) * 5 + (J - 48) * 4 + (K - 48) * 3 + (L - 48) * 2;
		int ostatak= provjera%11;
		int zbir=ostatak+(Z-48);
		System.out.println(provjera);
		System.out.println(zbir);
	}
}
// Komentar
