/**
 * 
 */
package respostas.questao8;

/**
 * @author Catharina Mesquita
 *
 */
public class Questao8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int c = Questao8.encontraC(135, 2467);
		
		System.out.println(c);
		
	}

	public static int encontraC(int A, int B) {
		
		String a = Integer.toString(A);
		String b = Integer.toString(B);
		String c = "";
		
		char[] aArray = a.toCharArray();		
		char[] bArray = b.toCharArray();		

		int maiorTamanho = aArray.length >= bArray.length ? aArray.length :bArray.length;
		
		for(int i = 0; i < maiorTamanho; i++) {
			if(aArray.length> i)
				c += aArray[i];
			if(bArray.length > i)
				c +=bArray[i];
		}
		
		if(Integer.parseInt(c) > 1000000) {
			c = "-1";
		}
		
		return Integer.parseInt(c);
	}
}
