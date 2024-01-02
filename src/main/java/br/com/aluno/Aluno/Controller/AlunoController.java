package br.com.aluno.Aluno.Controller;

import br.com.aluno.Aluno.Model.Aluno;
import br.com.aluno.Aluno.Service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/aluno")
public class AlunoController {

    @Autowired
    private IAlunoService _service;

    @GetMapping("/buscar-todos")
    public ResponseEntity<List<Aluno>> buscarAlunosPorMes(){
        return ResponseEntity.status(HttpStatus.OK).body(_service.buscarTodosAlunos());
    }

    @GetMapping("/buscar-aluno/{id}")
    public ResponseEntity<Optional<Aluno>> findById(@PathVariable Long id){
        return ResponseEntity.ok(_service.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Aluno> update(@PathVariable Long id, @RequestBody Aluno aluno){
        return ResponseEntity.ok(_service.update(aluno, id));
    }

    @PostMapping("/create")
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        aluno = _service.create(aluno);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(aluno);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
         _service.delete(id);
         return ResponseEntity.noContent().build();
    }




}
