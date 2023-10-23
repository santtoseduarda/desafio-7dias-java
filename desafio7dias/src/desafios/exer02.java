package desafios;

public class exer02 {
	public static void main(String[] args) {
		
		int[] array = {12, 27, 7, 5, 19};
        int soma = somarArray(array);
        
        System.out.println("A soma dos valores do array é: " + soma);
    }

    	public static int somarArray(int[] array) {
    		int soma = 0;

    		for (int i = 0; i < array.length; i++) {
    			soma += array[i];
    		}

    		return soma;
	}

}
