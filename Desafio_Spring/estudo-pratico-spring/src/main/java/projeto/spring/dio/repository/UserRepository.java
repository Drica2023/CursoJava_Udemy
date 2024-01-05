package projeto.spring.dio.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.spring.dio.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
}
