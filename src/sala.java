public class sala {
    private int numeroSala;
    private int numeroBloco;
    private int capacidadeMax;
    private String tipoSala;


    public sala(int numeroSala , int numeroBloco , int capacidadeMax , String tipoSala){
        this.numeroSala = numeroSala;
        this.numeroBloco = numeroBloco;
        this.capacidadeMax = capacidadeMax;
        this.tipoSala = tipoSala;

    }

    public int getNumeroSala(){
        return numeroSala;
    }

    public int getNumeroBloco(){
        return numeroBloco;
    }

    public int getCapacidadeMax(){
        return capacidadeMax;
    }

    public String getTipoSala(){
        return tipoSala;
    }

    public void setNumeroSala(int numeroSala){
        this.numeroSala = numeroSala;
    }

    public void setCapacidadeMax(int capacidadeMax){
        this.capacidadeMax = capacidadeMax;
    }

    public void setNumeroBloco(int numeroBloco){
        this.numeroBloco = numeroBloco;
    }

    public void setTpoSala(String tipoSala){
        this.tipoSala = tipoSala;
    }
}
