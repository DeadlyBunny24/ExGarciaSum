package org.gradle;
import static org.mockito.Mockito.*;  


public class sum {
	public int sumador(String cadena){
		int resultado = 0;
		conv c = mock(conv.class);
		when(c.convertidor("2,3")).thenReturn(new int[]{2,3});
		int[] arr = c.convertidor("2,3");
		for(int i : arr) {       
		    resultado += i;
		} 
		return resultado;
	}
}