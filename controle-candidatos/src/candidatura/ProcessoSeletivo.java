package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionados();	
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		for(String selecionados:candidatos) {
			System.out.println("Candidato selecionado foi "+selecionados);
		}
	}
	
	static void selecaoCandidatos() {
	String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
	
	int candidatosSelecionados=0;
	int candidatoAtual=0;
	double salarioBase = 2000.0;
	while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
		 String candidato = candidatos[candidatoAtual];
		 double salarioPretendido = valorPretendido();
		 
		 	System.out.println("O candidato " + candidato + " tem pretencão salarial de " + salarioPretendido);
		 	if(salarioBase >= salarioPretendido) {
		 		System.out.println("O candidato foi selecionado para a vaga.");
		 		candidatosSelecionados++;
		 	}else {
		 		System.out.println("Candidato não antende requisitos da vaga.");
		 	}
		candidatoAtual++;
	}
	}
	
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
			double salarioBase = 2000.0;
			if(salarioBase> salarioPretendido) {
					System.out.println("LIGAR PARA O CANDIDATO");
			}else if(salarioBase == salarioPretendido) {
					System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
			}else {
					System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
			}
	}
}
