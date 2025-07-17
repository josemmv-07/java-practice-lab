
public class ManipulacionCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Jose";
		
		
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras." + "La última letra de mi nombre es " + 
		nombre.charAt(nombre.length() - 1));
		
		String frase = "Hoy es un estupendo día para aprender a programar Java";
		
		String subcadena = frase.substring(4, 6);
		
		String sub = frase.substring(4);
		
		System.out.println( "Hoy " + subcadena + " Viernes");
		System.out.println(sub);
		
		String alumno1 = "David";
		String alumno2 = "daViD";
		
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
		
	}

}
