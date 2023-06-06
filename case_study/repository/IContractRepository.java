package case_study.repository;

import case_study.model.impl_facility.contract.Contract;

import java.util.List;
import java.util.Queue;

public interface IContractRepository{
   

    List<Contract> getContractList();

    Contract getContractById(String contractId);

    String getEarliestBooking();

    void add(Contract newContract);

    List<Contract> getAll();

    void editContract(Contract contract, long deposit, long payment);
}
