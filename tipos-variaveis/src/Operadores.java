public class Operadores {
    public static void main(String[] args) {
        // classe Operadores.java

        // Sinal de igual -> = -> atribuidor

        
        // Operadores Aritiméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4); // juntar mais de uma operação
        
        // o operador +, se for utilizado com um texto vai concatenar
        String concatenacao = "Linguagem" + "Java";
        System.out.println(concatenacao);
        
        concatenacao = 1 + "1"; // se tem texto junta tudo, saída: 11
        System.out.println(concatenacao);
        
        concatenacao = 1 + 1 + "1"; //primeiro soma e quando encontra texto concatena, saída 21
        System.out.println(concatenacao);
        
        concatenacao = "1" + 1 + 1; // saída 111  
        System.out.println(concatenacao);
        
        // Operadores Unários 
        // positivo + -> pode ser omitido
        // negativo -
        // incremento de valor em uma unidade ++
        // decremento de valor em uma unidade --
        // Unário e lógico de negação !
        
        int numero = 10;
        System.out.println("Unários");
        System.out.println(+numero);   // muda nada ->  o número só está com o sinal omitido
        System.out.println(-numero);   // negativa
        System.out.println(++numero);  // incrementa -> modifica o original
        System.out.println(++numero);  // 12
        System.out.println(numero++);  // a ordem trocada, imprime o valor atual, e depois incrementa saída: 12
        System.out.println(--numero);  // decrementa 13 - 1 = 12
        System.out.println(numero--);  // ptinta 12 depois decrementa um
        System.out.println(numero);    // 11
        
        
        // Operadores relacionais -> compara 2 valores se são:   -> retornam true ou false
            // == iguais            5 == 6 false
            // != diferente         5 != 6 true
            // <  Menor             5 < 6 true
            // >  Maior             5 > 6 false
            // <= menor ou igual    
            // >= maior ou igual
        
        //Para compara objetos utiliza-se o equals
        //observe 

        String nome1 = "Vitor";
        String nome2 = "Vitor";
        String nome3 = new String("Vitor");

        System.out.println(nome1 == nome2); //true
        System.out.println(nome1 == nome3); //false
        System.out.println(nome1.equals(nome3));//true

        // Operadores lógicos -> tabela verdade 
            // || or -> se uma ou as duas condições forem verdadeira, a saída é true
            // && and -> se as duas condições forem verdadeira, saída é true


    }
}
