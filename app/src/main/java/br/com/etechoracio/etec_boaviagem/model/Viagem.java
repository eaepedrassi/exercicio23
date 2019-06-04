package br.com.etechoracio.etec_boaviagem.model;

import java.util.Date;

import br.com.etechoracio.etec_boaviagem.enums.TipoViagemEnum;

public class Viagem {
    private String id;
    private String destino;
    private TipoViagemEnum tipoViagem;
    private Date dataChegada;
    private Date dataSaida;
    private Double orcamento;
    private Integer quantidadePessoas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public TipoViagemEnum getTipoViagem() {
        return tipoViagem;
    }

    public void setTipoViagem(TipoViagemEnum tipoViagem) {
        this.tipoViagem = tipoViagem;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(Integer quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }


}
