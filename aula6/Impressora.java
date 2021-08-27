package POO_DH.aula6;

import java.time.LocalDate;
//import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo,String tipoConexao, LocalDate dataFabricacao){
        this.tipoConexao = tipoConexao;
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    private boolean temPapel(){ //if simplificado
        return folhasDisponiveis > 0;
    }

    public void imprimir(String texto){
        if (temPapel()){
            this.folhasDisponiveis--;
            System.out.println(texto);
        }else{
            System.out.println("Impressora sem papael");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }
}
