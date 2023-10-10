package refuerzo;

//	Álvaro Comenge
//
//	Escribe un programa que vaya pidiendo números al usuario. Mientras se introduzcan
//	números positivos, el programa seguirá pidiendo números. En cuanto se introduzca un
//	número negativo, el programa se detendrá y se despedirá del usuario.
//


import java.util.*;

public class Refuerzo1_5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//for(int i=0;i<3;i++) {
		System.out.println("Dame 1 numero enteros");
		int n=entrada.nextInt();
		System.out.println("Dame 1 numero enteros");
		int n1=entrada.nextInt();
		System.out.println("Dame 1 numero enteros");
		int n2=entrada.nextInt();
		
		if(n+10>=n1||n+10>=n2||n1+10>=n2) {
			System.out.println("No se cumple la distancia de seguridad");
		}else {
			System.out.println("Ccumplen la distancia de seguridad");
		}
		
		
		
//		if(n<n1&&n1<n2) {//menor es n //n2 mayor 123
//			if(n+10>=n2) { 
//				System.out.println("No cumple la distancia de seguridad");
//			}
//		}else if(n<n1&&n1>n2&&n<n2) {//132 mayor es n3
//				if(n+9>=n2) {
//				System.out.println("No cumple la distancia de seguridad");
//				}
//		}else if(n>n1&&n>n2&&n>n2){
//				if(n2+10>=n2) {
//				System.out.println("No cumple la distancia de seguridad");
//				}
//		}else if(n>n1&&n1<n2&&n>n2) {
//			if(n2+10>=n1) {
//				System.out.println("No cumple la distancia de seguridad");
//				}
//		}else if(n<n1&&n1>n2&&n>n2) {//213
//			if(n2+10>=n1) {
//				System.out.println("No cumple la distancia de seguridad");
//			}
//		}else if(n<n1&&n1>n2&&n<n2) {
//			if(n+10>=n1) {
//				System.out.println("No cumple la distancia de seguridad");	
//			}else {
//			System.out.println("Cumple la distancia de seguridad");
//			
//			}
//		}
//		//}
	}
}
//	  
//		
