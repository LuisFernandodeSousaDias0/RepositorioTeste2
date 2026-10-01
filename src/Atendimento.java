public class Atendimento {
    private int codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private double horario;
    private String statusAtendimento;
    private String observacoes;

    public Atendimento(int codigo , String nomeAnimal , String especie , String nomeTutor , String data , double horario , String statusAtendimento , String observacoes ){
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.statusAtendimento = statusAtendimento;
        this.observacoes = observacoes;


    }

    public int getCodigo(){
        return codigo;
    }

    public String getNomeAnimal(){
        return nomeAnimal;
    }
    
    public String getEspecie(){
        return especie;
    }

    public String getNomeTutor(){
        return nomeTutor;
    }

    public String getData(){
        return data;
    }

    public double getHorario(){
        return horario;
    }

    public String getStatusAtendimento(){
        return statusAtendimento;
    }

    public String getObservacoes(){
        return observacoes;
    }
}
