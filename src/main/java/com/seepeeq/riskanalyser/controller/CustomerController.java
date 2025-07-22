package com.seepeeq.riskanalyser.controller;
import com.seepeeq.riskanalyser.repository.CustomerRepository;
import com.seepeeq.riskanalyser.service.RiskAnalyserService;
import org.springframework.stereotype.Controller;
import com.seepeeq.riskanalyser.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private RiskAnalyserService customerService;

    // GET /api/customers - Get all customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // GET /api/customers/{id} - Get customer by ID
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id).orElse(null);
    }

    // POST /api/customers - Add new customer
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    // PUT /api/customers/{id} - Update existing customer
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    // DELETE /api/customers/{id} - Delete customer by ID
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
    }
}