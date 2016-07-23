package bcms;

public class Bits {
	public static void main(String[] args) {
		int numero = 4;
		System.out.println("Operadores de deslocamento de bits são aplicados somente a números inteiros, e usa aritmetica de inteiros para o resultado:");
		System.out.println("Para número PAR: ");
		System.out.println("Decimal = "+numero+"\tBinario = "+Integer.toBinaryString(numero));
		
		System.out.println("\n[numero >> 1 = (numero / 2)]");
		//Ao andar para direita é como se o bit "caísse" pra fora do "vetor de representacao", alterando assim a representação do valor.
		numero = numero >> 1;
		System.out.println("Decimal = "+numero+"\tBinario = "+Integer.toBinaryString(numero));
		
		System.out.println("\n[numero << 1 = (numero * 2)]");
		//Ao andar para esquerda é como se os bits fossem deslocados no "vetor de representacao" para esquerda complementados
		//com 0 nas posicoes a direita que ficaram vagas.
		numero = numero << 1;
		System.out.println("Decimal = "+numero+"\tBinario = "+Integer.toBinaryString(numero));
		
		System.out.println("\n\nPara número IMPAR: ");
		int numeroB = 5;
		System.out.println("Decimal = "+numeroB+"\tBinario = "+Integer.toBinaryString(numeroB));
		System.out.println("[numero >> 1 = ((numero-1) / 2)]");
		numeroB = numeroB >> 1;
		System.out.println("Decimal = "+numeroB+"\tBinario = "+Integer.toBinaryString(numeroB));
	}

}
