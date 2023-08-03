public class pexercicio16 {
	
    public static void main(String[] args) {
    	
        double resultado;
        
        // Calculando o numerador da expressão
        double numerador = Math.sqrt(3) - Math.sqrt(2); // vai posicionar na esquerda e multiplica altomaticamente
        numerador = Math.sqrt(Math.pow(Math.sqrt(2), Math.sqrt(3)) * Math.pow(Math.sqrt(3), Math.sqrt(2)) + Math.pow(Math.sqrt(2), Math.sqrt(12)));
        
        // Calculando o denominador da expressão
        double denominador = Math.pow(Math.sqrt(6), Math.sqrt(2)) + Math.pow(Math.sqrt(2), Math.sqrt(3)) + Math.sqrt(2);
        
        // Calculando o resultado da expressão
        resultado = numerador / denominador;
        
        // Imprimindo o resultado com 4 casas decimais
        System.out.printf("Resultado da expressão: %.4f", resultado);
        
    }
}

