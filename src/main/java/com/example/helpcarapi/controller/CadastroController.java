package com.example.helpcarapi.controller;

import com.example.helpcarapi.model.Cadastro;
import com.example.helpcarapi.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/criar")
    public ResponseEntity<String> criarCadastro(@RequestBody Cadastro cadastro) {
        cadastroService.criarCadastro(cadastro);
        return ResponseEntity.status(HttpStatus.CREATED).body("Cadastro criado com sucesso.");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cadastro> obterCadastroPorId(@PathVariable("id") Long id) {
        Cadastro cadastro = cadastroService.obterCadastroPorId(id);
        if (cadastro != null) {
            return ResponseEntity.ok(cadastro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarCadastro(@PathVariable("id") Long id, @RequestBody Cadastro cadastro) {
        boolean atualizado = cadastroService.atualizarCadastro(id, cadastro);
        if (atualizado) {
            return ResponseEntity.ok("Cadastro atualizado com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCadastro(@PathVariable("id") Long id) {
        boolean deletado = cadastroService.deletarCadastro(id);
        if (deletado) {
            return ResponseEntity.ok("Cadastro deletado com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
