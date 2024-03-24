package br.cnj.primeiroexemplo.projeto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cnj.primeiroexemplo.projeto.models.CasoJudicial;
import br.cnj.primeiroexemplo.projeto.services.CasoJudicialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/casos")
public class CasoJudicialController {

    private final CasoJudicialService casoJudService;

    public CasoJudicialController(CasoJudicialService casoJudService) {
        this.casoJudService = casoJudService;
    }

    @GetMapping
    public ResponseEntity<List<CasoJudicial>> getAll() {
        return ResponseEntity.ok(casoJudService.listarTodos());
    }

}
