package Med.Cadastro.apiRest.controller;

import Med.Cadastro.apiRest.medico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("medicos")
public class MedicosController {
    @Autowired
    private MedicoReposity reposity;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){

        reposity.save(new Medico(dados));

    }
    @GetMapping
    public Page<DadosListagemMedico> listar( @PageableDefault(sort = {"nome"}) Pageable paginacao) {
        return reposity.findAll(paginacao).map(DadosListagemMedico::new);

    }
    @PutMapping
    @Transactional
        public void atualizar(@RequestBody @Valid DadosAtulizacaoMedico dados){
        var medico = reposity.getReferenceById(dados.id());
        medico.atualizarinformacao(dados);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        reposity.deleteById(id);


    }


}
