public class Operadores {
    
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        String nomeCompleto2 = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeCompleto2);


        String concatenacao;
            concatenacao = 1+1+1+"1";
                System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;
                System.out.println(concatenacao);
            concatenacao = 1+"1"+1+"1";
                System.out.println(concatenacao);
            concatenacao = "1"+1+1+1;
                System.out.println(concatenacao);
            concatenacao = "1"+(1+1+1);
                System.out.println(concatenacao);
    }
    
}
