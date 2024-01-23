package com.factory.user;

import jakarta.persistence.TypedQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.ResultListTransformer;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {// add some changes

    @Autowired
    SessionFactory sessionFactory;

    Logger log = LogManager.getLogger();

    @GetMapping("/get")
    public Object get() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();




        String s = "select o from Other o where o.myName='tara'";
        Other o = session.createQuery(s, Other.class).getSingleResult();
        log.info(o);

        session.close();

        return "success;";
    }
}
