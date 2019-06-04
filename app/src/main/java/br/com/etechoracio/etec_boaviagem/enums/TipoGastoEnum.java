package br.com.etechoracio.etec_boaviagem.enums;

public enum TipoGastoEnum {
    ALIMENTACAO("Alimentação"),
    COMBUSTIVEL("Combustível"),
    TRANSPORTE("Transporte"),
    HOSPEDAGEM("Hospedagem"),
    OUTROS("Outros");

    private String descricao;

    public String toString(){
        return descricao;
    }

    TipoGastoEnum(String descricao) {
        this.descricao = descricao;
    }
}
