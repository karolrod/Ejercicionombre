package nombresejer;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese Nombre:");
		Object nombre = ingreso.next();
		System.out.println("Ingrese Apellido:");
		Object apellido = ingreso.next();
		System.out.println(nombre);
		System.out.println(apellido);

	}

}
