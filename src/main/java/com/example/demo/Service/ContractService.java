package com.example.demo.Service;

import com.example.demo.Model.Contract;
import com.example.demo.Repository.ContractRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {

    @Autowired
    ContractRepo contractRepo;

    public List<Contract> fetchAll(){
        return contractRepo.fetchAll();
    }

    public Contract addContract(Contract contract){
        return contractRepo.addContract(contract);
    }

    public Contract findContractById(int id){
        return contractRepo.findContractById(id);
    }

    public Boolean deleteContract(int id){
        return contractRepo.deleteContract(id);
    }

    public Contract updateContract(int id, Contract contract){
        return contractRepo.updateContract(id, contract);
    }
}
