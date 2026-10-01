public class Procedimento {
    private String nomeProcedimento;
    private String duracao;
    private double valorProcedimento;
    private String nivelComplexidade;

    public Procedimento(String nomeProcedimento , Strind duracao, double valorProcedimento , String nivelComplexiade){
        this.nomeProcedimento = nomeProcedimento;
        this.duracao = duracao;
        this.valorProcedimento = valorProcedimento;
        this.nivelComplexidade = nivelComplexiade;
    }

    public String getNomeProcedimento(){
        return nomeProcedimento;
    }

    public String getDuracao(){
        return duracao;
    }

    public double getValorProcedimento(){
        return valorProcedimento;
    }

    public String getNivelComplexiade(){
        return nivelComplexidade;
    }

    public void setNomeProcedimento(String nomeProcedimento){
        this.nomeProcedimento = nomeProcedimento;
    }

    public void setDuracao(String duracao){
        this.duracao = duracao;
    }

    public void setValorProcedimento(String valorProcedimento){
        this.valorProcedimento = valorProcedimento;
    }

    public void setNivelComplexidade(String nivelComplexiade){
        this.nivelComplexidade = nivelComplexiade;
    }
}
