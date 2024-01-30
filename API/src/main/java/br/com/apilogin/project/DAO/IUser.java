package br.com.apilogin.project.DAO;

import br.com.apilogin.project.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends CrudRepository<User, Integer> {

}
