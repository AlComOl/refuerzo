package refuerzo;

public class refuerzo {

	public static void main(String[] args) {
		
		Perro p=new Perro();
		
		p.nombre="Rodman";
		p.raza="Cocker Spaniel";
		p.duenyo="Alvaro";
		p.edad=12;
		p.microchip=true;
		
		System.out.println("El perro llamado " + p.nombre +" es muy bonito");
		if(p.microchip) {
		System.out.println("Cuidado no tiene microchip");
		
		
		System.out.println();
		}
		
		
	}
 
	
	
}
