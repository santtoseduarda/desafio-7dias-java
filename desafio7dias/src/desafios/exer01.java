package desafios;

import java.util.Arrays;

public class exer01 {

	public static void main(String[] args) {
		
		int[] arrayNumerico = {5, 2, 9, 1, 5, 6, 3};
        String[] arrayStrings = {"lucas", "maria", "eduarda", "isa", "lezio"};
        
        Arrays.sort(arrayNumerico);
        Arrays.sort(arrayStrings);
        
        System.out.println("Array Numérico é:");
        for (int num : arrayNumerico) {
            System.out.print(num + " ");
        }

        System.out.println(); 

        
        System.out.println("Array de Strings é:");
        for (String str : arrayStrings) {
            System.out.print(str + " ");
        }
	}
}
