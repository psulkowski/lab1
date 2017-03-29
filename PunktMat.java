public class PunktMat {
private int masa;//prywatne pole masy
public PunktMat(){
	masa=1;
}//konstruktor domyślny
public PunktMat(int m)
{
	if (m>0)
		masa = m;
	else
		masa=-m;
}//konstruktor z parametrem
public int wypiszMase()
{
	return masa;
}//akcesor
public void zmianaMasy(int m)
{
	masa=m;
}//metoda zmiany masy
public int momBezw(){
	int i1=0;
	return i1;
}//metoda obliczajaca moment bezwladnosci
public int bezwSteiner(int d){
	int i2=momBezw()+masa*d*d;
	return i2;
}//metoda z twierdzeniem Steinera
public void opis(){
	System.out.println("Punkt materialny");
}//Metoda zwracajaca opis
}
