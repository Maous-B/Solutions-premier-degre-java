package marwan.xyz.tp5;

public class Solutions {

	public static void main(String[] args) {
		int A, B;
		A = Saisie.lire_int("Veuillez entrer votre premier nombre : ");
		B = Saisie.lire_int("Veuillez entrer votre deuxi�me nombre : ");
		
		if(A!=0) {
			
			if(B != 0){
				System.out.println("L'�quation Ax + B = 0 est �quivalente � Ax = -B et la solution est x = -B/A");
			}
			else {
				System.out.println("L'unique solution de l'�quation Ax = 0 est x = 0");
			}
		}
		else {
			if(B != 0){
				System.out.println("Aucune solution pour l'�quation");
			}
			else {
				System.out.println("Il existe une infinit� de solutions");
			}
		}
	}

}
