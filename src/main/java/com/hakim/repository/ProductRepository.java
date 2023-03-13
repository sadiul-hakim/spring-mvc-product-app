package com.hakim.repository;

import com.hakim.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void createProduct(Product product){
        hibernateTemplate.saveOrUpdate(product);
    }

    public Product getProduct(Long id){
        return hibernateTemplate.get(Product.class,id);
    }

    public List<Product> getAllProducts(){
        return hibernateTemplate.loadAll(Product.class);
    }

    @Transactional
    public void deleteProduct(Long id){
        Product product = hibernateTemplate.get(Product.class, id);
        hibernateTemplate.delete(product);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
