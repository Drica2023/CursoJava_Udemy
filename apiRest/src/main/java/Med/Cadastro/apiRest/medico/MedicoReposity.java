package Med.Cadastro.apiRest.medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoReposity extends JpaRepository<Medico, Long> {
}
