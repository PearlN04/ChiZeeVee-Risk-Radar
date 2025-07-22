package com.seepeeq.riskanalyser.service;
import com.seepeeq.riskanalyser.model.RiskReport;
import com.seepeeq.riskanalyser.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.seepeeq.riskanalyser.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
@Service
public class RiskAnalyserService {
   @Autowired
    private CustomerRepository customerRepository;

    public List getAllCustomers(){
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(int id){
        return customerRepository.findById(id);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(int id, Customer updatedCustomer){
       updatedCustomer.setCust_ID(id);
       return customerRepository.save(updatedCustomer);
    }

    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }

}
