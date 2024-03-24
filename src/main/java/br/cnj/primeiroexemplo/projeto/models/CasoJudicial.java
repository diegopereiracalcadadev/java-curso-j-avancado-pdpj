package br.cnj.primeiroexemplo.projeto.models;

import org.springframework.stereotype.Component;

@Component
public class CasoJudicial {

    // private CustoJudicial custo;
    // private TaxaJudicial taxa;

    // public CasoJudicial(CustoJudicial custo, TaxaJudicial taxa) {
    // this.custo = custo;
    // this.taxa = taxa;
    // }

    public CasoJudicial() {
    }

    public CasoJudicial(int id) {
        this.id = id;
    }

    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
