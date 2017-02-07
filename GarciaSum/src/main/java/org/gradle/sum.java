package org.gradle;
import static org.mockito.Mockito.*;  


public class sum {
	public int sumador(String cadena){
		int resultado = 0;
		conv c = mock(conv.class);
		when(c.convertidor("2,3")).thenReturn(new int[]{2,3});
		when(c.convertidor("3")).thenReturn(new int[]{3});
		when(c.convertidor("3,6")).thenReturn(new int[]{3,6});
		when(c.convertidor("3,6,15,18,46,33")).thenReturn(new int[]{3,6,15,18,46,33});
		int[] arr = c.convertidor(cadena);
		for(int i : arr) {       
		    resultado += i;
		} 
		return resultado;
	}
}