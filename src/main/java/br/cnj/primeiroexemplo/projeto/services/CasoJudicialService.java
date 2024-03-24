package br.cnj.primeiroexemplo.projeto.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.cnj.primeiroexemplo.projeto.models.CasoJudicial;

@Service
public class CasoJudicialService {

    private final List<CasoJudicial> casos = new ArrayList<>();

    public CasoJudicialService() {
        this.casos.add(new CasoJudicial(1));
        this.casos.add(new CasoJudicial(2));

    }

    public List<CasoJudicial> listarTodos() {
        return this.casos;
    }

}
