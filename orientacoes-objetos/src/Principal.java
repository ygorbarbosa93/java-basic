public class Principal{

    public static void main(String[] args) {
        Pessoa dados = new Pessoa();
        
        dados.setNomePessoa("Ygor");
        dados.setSobrenomePessoa("Barbosa");
        dados.setNacionalidade("Brasileiro");
        dados.setIdadePessoa(30);
        System.out.println(dados.toString());
        

    }
}