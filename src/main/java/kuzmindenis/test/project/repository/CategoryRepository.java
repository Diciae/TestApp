package kuzmindenis.test.project.repository;

import kuzmindenis.test.project.model.Category;
import kuzmindenis.test.project.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
