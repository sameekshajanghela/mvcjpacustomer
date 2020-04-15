package org.cap.service;

import org.cap.dao.ICustomerDao;
import org.cap.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

    private ICustomerDao customerDao;

    public ICustomerDao getCustomerDao() {
        return customerDao;
    }


    @Autowired
    public void setCustomerDao(ICustomerDao dao) {
        this.customerDao = dao;
    }

    @Override
    public Customer findById(int id) {
        return customerDao.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerDao.save(customer);
    }


    @Override
    public List<Customer> fetchAll() {
        return customerDao.fetchAll();
    }


    @Override
    public boolean remove(int id) {
        boolean result=getCustomerDao().remove(id);
        return result;
    }
}
