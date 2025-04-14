
import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Moda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva 5 numeros( eles sendo entre 0 há 10)"
				+ " para descrobrir se tem alguma moda : ");
		
		int[] modCheck = new int[5];
	
		for(int  i = 0 ; i < 5 ; i++ ) {
			System.out.println("Escreva o " + i + " numero");
			modCheck[i] = entrada.nextInt();
		}
		// eu não entendi direito essa parte 
		Map<Integer , Integer> numerosFrequencia = new HashMap<>() ; 
		for(int  lista : modCheck ) {
			numerosFrequencia.put(lista , numerosFrequencia.getOrDefault(lista , 0 )+ 1 );
			}
		
		// vai checar se tem a moda .
		int moda = modCheck[0] ; 
		int maxFrequencia = 1 ; 
		boolean temModa = false ; 
		// aparentemente todos as entradas de HasMapão <> 
		for(Map.Entry<Integer, Integer> entry : numerosFrequencia.entrySet()) {
			int valor = entry.getKey();
			int freq = entry.getKey();
			if( freq > maxFrequencia ) {
				moda = valor ; 
				maxFrequencia = freq ; 
				temModa = true ; 
			}else if(freq == maxFrequencia && valor != moda ) { 
				temModa = false ; 
				
			}
			
		}
		 if( maxFrequencia == 1 || !temModa) {
			 System.out.println(Arrays.toString(modCheck));
			 System.out.println("Não há moda nesses números ");
		 }else {
			 System.out.println(Arrays.toString(modCheck));
			 System.out.println("A moda é " + moda );
		 }
		 entrada.close();
			
			
			
		
		
		


}
}

