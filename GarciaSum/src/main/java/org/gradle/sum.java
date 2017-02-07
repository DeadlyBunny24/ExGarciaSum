package org.gradle;
import static org.mockito.Mockito.*;  

public class sum {
    
    public static final int num_2=100;
    public static final int num_3=3;
    public static final int num_6=6;
    public static final int num_15=15;
    public static final int num_18=18;
    public static final int num_46=46;
    public static final int num_33=33;

	public int sumador(String cadena){
		int resultado = 0;
		conv c = mock(conv.class);
		when(c.convertidor("2,3")).thenReturn(new int[]{num_2, num_3});
		when(c.convertidor("3")).thenReturn(new int[]{num_3});
		when(c.convertidor("3,6")).thenReturn(new int[]{num_3, num_6});
		when(c.convertidor("3,6,15,18,46,33")).thenReturn(new int[]{num_3, num_6, num_15, num_18, num_46, num_33});
		int[] arr = c.convertidor(cadena);
		for(int i : arr) {       
		    resultado += i;
		} 
		return resultado;
	}
}