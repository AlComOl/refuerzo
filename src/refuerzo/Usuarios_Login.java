package refuerzo;

import java.util.*;
public class Usuarios_Login {
	

		
		//Atributos
	private String	nombre;
	private String contrasena;
	private String menu;
		//Constructores
	     public Usuarios_Login() {
		
		}
		public Usuarios_Login(String n, String c)  {
			nombre=n;
			contrasena=c;
		}
		//Metodos
		//establece nombre
		public void setNombre(String n) {
			nombre=n;
		}
		//devuelve nombre
		public String getNombre() {
			return nombre;
		}
		//establece contraseña	
		public void setContasena(String c) {
			contrasena=c;
		}
		//devuelve contraseña
		public String getContrasena() {
			return contrasena;
		}
		
		public String menu() {
			System.out.println("0 --> Darse de Alta");
			System.out.println("1 --> Ver cuenta");
			System.out.println("2 --> Borrar cuenta");
			System.out.println("3 --> Salir");
			return menu;
			
		}
	    public void setreset() {
	    	nombre= null;
	    	contrasena= null;
	    }
	    
	    public String getreset() {
	    
	    	return  getreset();
	    }
	
		
	
	
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Usuarios_Login u1 = new Usuarios_Login();
		
			
		
		u1.menu();

		int menu=entrada.nextInt();
		int menu1;
		switch (menu) {
		
		case 0:
			System.out.println("Introduce el nombre para registrarte");
			u1.setNombre(entrada.next());
			System.out.println("Guardado");
			System.out.println("Introcuce la contraseña, apuntala para no olvidarla");
			u1.setContasena(entrada.next());
			System.out.println("Guardado");
			u1.menu();
			entrada.nextInt();
			
		case 1:
		    System.out.println("nombre:" + u1.getNombre());	
		    System.out.println("contrasena:" +u1.getContrasena());
		    u1.menu();
		    break;
		case 2:
			System.out.println("Estas seguro que quieres borrar la cuenta? 1--->SI  \n 2 ---> NO");
			
			 menu1=entrada.nextInt();
			
			switch (menu1) {
			case 1:
				System.out.println("SI");
				u1.setreset();
				u1.menu();
				entrada.nextInt();
				break;
			case 2:
				System.out.println("NO");
				
				u1.menu();
			case 3:
				System.out.println("Comprobar si valor de nombre y contraseña");
				u1.getreset();
			default:
				break;
			}
				
				
		case 3:
			 System.out.println("Adios");
		default:
			break;
		 
		
			
		
		
	}
		
		}
}

	