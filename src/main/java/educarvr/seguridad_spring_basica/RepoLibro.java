package educarvr.seguridad_spring_basica;


import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoLibro extends JpaRepository<Libro, Long> {
}
