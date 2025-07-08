
public class UsoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte edad; // Estamos indicando lo que es la variable 
		
		edad = 5; 
		/*
		 * podemos poner el valor donde queramos a noser que 
		 * hagamos var edad=17; tiene que esta en la misma linea por que es esto es inferencia de tipos
		 */
		int Edad = 15;
		Edad ++;
		System.out.println(Edad);
		Edad -= 15;
		System.out.println(Edad);
		
		double num1 = 7;
		double num2 = 3;
		
		System.out.println(num1 % num2);
		
		int nume1 = 5;
		int nume2 = 2;
		double resultado = nume1 / nume2;
		System.out.println(resultado);
		double mediaEdad = edad / 5;
		double numero1 = 5;
		double numero2 = 2;
		double Resultado = numero1 / numero2;
		System.out.println(Resultado);
		int n1 = 5;
		int n2 = 2;
		double res = (double) n1 / n2;
		System.out.println(res);
	
		
		edad = 45;
		String nombre = "Jose tiene ";
		System.out.println(nombre + edad + " años");
		System.out.println(edad + mediaEdad);
		
		System.out.println(edad);
		System.out.println(nombre);

	}
 
}
