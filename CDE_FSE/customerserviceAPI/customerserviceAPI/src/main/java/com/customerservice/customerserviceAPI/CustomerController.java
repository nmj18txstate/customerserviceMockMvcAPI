package com.customerservice.customerserviceAPI;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    ObjectMapper mapper;
    ArrayList<Customer> customerList;
    CustomerController customerController;

    String customersJsonPath = "src/test/data/customers.json"; // 4 customers
    String customerJsonPath = "src/test/data/existingCustomer.json"; // 1 customer
    String newCustomerJsonPath = "src/test/data/newCustomer.json"; // 1 customer



    @GetMapping("/api/customers")
    public Response getCustomers() throws IOException {
        mapper = new ObjectMapper();
        File customersFile = new File(customersJsonPath);
        customerList = mapper.readValue(customersFile, new TypeReference<ArrayList<Customer>>() {});
        Response response=new Response(200,"OK",customerList);
        System.out.println("inside controller "+response.getStatus());
        return response;
    }

    @GetMapping("/api/customers/{customerId}")
    public Response getCustomerById(@PathVariable String customerId) throws IOException {
        Response response=new Response(201,"NOT FOUND",null);
        mapper = new ObjectMapper();
        File customersFile = new File(customersJsonPath);
        customerList = mapper.readValue(customersFile, new TypeReference<ArrayList<Customer>>() {});
        for (Customer customer: customerList) {
            if (customer.getId().equals(customerId)){
                response.setStatusCode(200);
                response.setStatus("OK");
                response.setCustomers((new ArrayList<>()));
                response.getCustomers().add(customer);
                return response;
            }
        }
        return response;
    }
}
