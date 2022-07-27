package tran.business.repositories;

import org.springframework.data.repository.CrudRepository;
import tran.business.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
