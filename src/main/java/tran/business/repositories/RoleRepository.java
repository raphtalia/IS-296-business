package tran.business.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tran.business.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
