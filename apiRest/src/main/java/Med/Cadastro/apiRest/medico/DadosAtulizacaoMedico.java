package Med.Cadastro.apiRest.medico;

import Med.Cadastro.apiRest.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;


public record DadosAtulizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {





}
