
public class UsoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int raiz = (int) Math.sqrt(9);
		System.out.println(raiz);
		
		double ra = Math.sqrt(9);
		System.out.println(ra);
		
		int pote = (int) Math.pow(3, 2);
		System.out.println(pote);
		
		double aleatorio = Math.random() * 100;
		int ale = (int) (Math.random() * 10);
		
		int en = Math.round((float) (Math.random() * 10));
		
		int absoluto = Math.abs(-45);
		
		int masi = Math.max(14, 56);
		
		System.out.println(absoluto);
		System.out.println(aleatorio);
		System.out.println(en);
		System.out.println(ale);
		System.out.println(masi);

	}

}
