package case_study.model.impl_facility.contract;

public class Contract {
    private String numberOfContract;
    private String contractId;
    private long deposit;
    private long payment;

    public Contract(String numberOfContract, String contractId, long deposit, long payment) {
        this.numberOfContract = numberOfContract;
        this.contractId = contractId;
        this.deposit = deposit;
        this.payment = payment;
    }

    public String getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(String numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberOfContract='" + numberOfContract + '\'' +
                ", contractId='" + contractId + '\'' +
                ", deposit=" + deposit +
                ", payment=" + payment +
                '}';
    }
}
