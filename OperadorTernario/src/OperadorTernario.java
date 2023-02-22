import javax.sound.sampled.SourceDataLine;

public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        int a =5, b=6;
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    if(a==b){
        System.out.println("Verdadeiro");
    }else{
        System.out.println("Falso");
    }
    System.out.println("--------------------------------------------");

    // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String resultado = (a==b)?"Verdadeiro":"Falso";

    System.out.println(resultado);
    }

}
