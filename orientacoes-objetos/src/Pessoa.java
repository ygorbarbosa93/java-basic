public class Pessoa {

    private String nomePessoa;
    private String sobrenomePessoa;
    private String nacionalidade;
    private int idadePessoa;

    @Override
    public String toString() {
        return "Pessoa [nomePessoa=" + nomePessoa + ", sobrenomePessoa=" + sobrenomePessoa + ", nacionalidade="
                + nacionalidade + ", idadePessoa=" + idadePessoa + "]";
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getSobrenomePessoa() {
        return sobrenomePessoa;
    }

    public void setSobrenomePessoa(String sobrenomePessoa) {
        this.sobrenomePessoa = sobrenomePessoa;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

}
