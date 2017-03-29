public class Test {

	public static void main(String[] args){
		PunktMat A = new PunktMat();
		PunktMat B = new PunktMat(-4);
		A.opis();
		System.out.println("Masa: " + A.wypiszMase());
		System.out.println("Glowny moment bezwladnosci: " + A.momBezw());
		System.out.println("Moment wzgledem nowej osi: " + A.bezwSteiner(3));
		B.opis();
		System.out.println("Masa: " + B.wypiszMase());
		System.out.println("Glowny moment bezwladnosci: " + B.momBezw());
		System.out.println("Moment wzgledem nowej osi: " + B.bezwSteiner(3));
		A.zmianaMasy(3);
		System.out.println("Masa: " + A.wypiszMase());
		System.out.println("Glowny moment bezwladnosci: " + A.momBezw());
		System.out.println("Moment wzgledem nowej osi: " + A.bezwSteiner(3));
		
		PunktMat[] tab = new PunktMat[10];
		for (int i=0; i<10; i++)
		{
		PunktMat C = new PunktMat(i+1);
		tab[i]=C;
		}
		for (int i=0; i<5; i++)
		{
			tab[i].opis();
			System.out.println("Masa: " + tab[i].wypiszMase());
			System.out.println("Glowny moment bezwladnosci: " + tab[i].momBezw());
			System.out.println("Moment wzgledem nowej osi: " + tab[i].bezwSteiner(i+1));
		}
	}	
}
