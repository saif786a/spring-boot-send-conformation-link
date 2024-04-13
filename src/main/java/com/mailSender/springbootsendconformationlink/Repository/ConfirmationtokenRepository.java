package com.mailSender.springbootsendconformationlink.Repository;

import com.mailSender.springbootsendconformationlink.Entity.Confirmationtoken;
import org.springframework.data.repository.CrudRepository;

public interface ConfirmationtokenRepository extends CrudRepository<Confirmationtoken,String> {
    Confirmationtoken findByConfirmationtoken(String Confirmationtoken);
}
