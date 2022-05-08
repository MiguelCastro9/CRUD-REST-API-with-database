package crudRest.service;

import crudRest.model.PessoaModel;
import crudRest.repository.PessoaRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class PessoaService {
    
    PessoaRepository pessoaRepository;
    
    public PessoaModel inserir(PessoaModel pessoaModel) {
        
        return pessoaRepository.save(pessoaModel);
    }
    
    public PessoaModel alterar(Long id) {
        
        PessoaModel pessoaModel = pessoaRepository.getById(id);
        pessoaModel.setNome(pessoaModel.getNome());
        pessoaModel.setEmail(pessoaModel.getEmail());
        
        return pessoaRepository.save(pessoaModel);
    }
    
    public Optional<PessoaModel> buscar(Long id) {
        
        return pessoaRepository.findById(id);
    }
    
    public void excluir(Long id) {
        
        pessoaRepository.deleteById(id);
    }
}
