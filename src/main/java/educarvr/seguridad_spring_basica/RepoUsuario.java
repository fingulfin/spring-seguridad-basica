package educarvr.seguridad_spring_basica;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoUsuario extends MongoRepository<Usuario, Long> {


}
