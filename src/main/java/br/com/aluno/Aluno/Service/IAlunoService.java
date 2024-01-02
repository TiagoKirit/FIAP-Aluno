package br.com.aluno.Aluno.Service;
import br.com.aluno.Aluno.Model.Aluno;

import java.util.List;
import java.util.Optional;

public interface IAlunoService {
    List<Aluno> buscarTodosAlunos();
    Optional<Aluno> findById(Long id);

    Aluno update(Aluno aluno, Long id);
    void delete(Long id);

    Aluno create(Aluno aluno);
}
