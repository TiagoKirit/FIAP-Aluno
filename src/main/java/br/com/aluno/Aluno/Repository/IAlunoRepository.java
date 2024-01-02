package br.com.aluno.Aluno.Repository;

import br.com.aluno.Aluno.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
}
