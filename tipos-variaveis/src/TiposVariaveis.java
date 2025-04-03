public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos Primitivos -> Inteiros, Ponto Flutuante, Caractere e Boolean
        // Inteiros
        byte exemploByte = (byte) 1; // 8bits

        short exemploShort = (short) 3000; // 16bits

        int exemploInt = 2100000000; // 32bits
            //se o valor começar com 0, pode acabar desconsiderando o 0 na frente 

        long exemploLong = 9000000000000L; // 64bits
            //se o valor começar com 0, pode acabar desconsiderando o 0 na frente

        // Ponto flutuante
        float exemploFloat = 5.50f;  // 32bits
    
        double exemploDouble = 10.20d; // 64bits
    
        // Caractere -> 16bits
        char exemploChar = 65; // número equivalente na tabela unicode -> de 0 a 127 são iguais a tablea ASCII 
        char exemploChar2 = 'A'; // 65 Equivalente a letra 'A'
        
        // Booleano -> 1bit
        boolean exemploBoolean = true; // apenas true ou false

        // Declarando valores Constantes
        final float PI = (float) 3.1415; 
            // em vez de colocar o f no final pode colocar (float) para converter o tipo do valor
            // impossível reatribuir valor a PI
            // Constantes manter em CAIXA_ALTA
            // Também servem para objetos
        }

        // String
        String meuNome = "Vitor Meurer";
            // String é uma classe
}
