package Med.Cadastro.apiRest.controller;

import Med.Cadastro.apiRest.medico.DadosCadastroMedico;
import Med.Cadastro.apiRest.medico.Medico;
import Med.Cadastro.apiRest.medico.MedicoReposity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicosController {
    @Autowired
    private MedicoReposity reposity;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados){

        reposity.save(new Medico(dados));

    }

}
