package br.com.aluno.Aluno.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aluno.Aluno.Model.Aluno;
import br.com.aluno.Aluno.Repository.IAlunoRepository;

@Service
public class AlunoService implements IAlunoService {

    @Autowired
    private IAlunoRepository _alunoRepository;

    @Override
    public List<Aluno> buscarTodosAlunos() {
        return _alunoRepository.findAll();
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return _alunoRepository.findById(id);
    }

    @Override
    public Aluno update(Aluno aluno, Long id) {
        var buscaAluno = _alunoRepository.findById(id).orElseThrow();
        buscaAluno.setNome(aluno.getNome());
        buscaAluno.setEmail(aluno.getEmail());
        buscaAluno = _alunoRepository.save(buscaAluno);
        return buscaAluno;
    }

    @Override
    public void delete(Long id) {
         _alunoRepository.deleteById(id);
    }

    @Override
    public Aluno create(Aluno aluno) {
        return _alunoRepository.save(aluno);
    }
}