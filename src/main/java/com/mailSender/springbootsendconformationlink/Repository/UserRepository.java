package com.mailSender.springbootsendconformationlink.Repository;

import com.mailSender.springbootsendconformationlink.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {

    User findByEmailIdIgnoreCase(String emailId);
}
