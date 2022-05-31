package desafio.dio.controller;

import desafio.dio.model.Construtora;
import desafio.dio.service.ConstrutoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("construtora")
public class ConstrutoraController {

    @Autowired
    private ConstrutoraService construtoraService;

    @GetMapping
    public ResponseEntity<Iterable<Construtora>> buscarTodos() {
        return ResponseEntity.ok(construtoraService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Construtora> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(construtoraService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Construtora> inserir(@RequestBody Construtora construtora) {
        construtoraService.inserir(construtora);
        return new ResponseEntity<>(construtora, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Construtora> atualizar(@PathVariable Long id, @RequestBody Construtora construtora) {
        construtoraService.atualizar(id, construtora);
        return ResponseEntity.ok(construtora);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        construtoraService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
