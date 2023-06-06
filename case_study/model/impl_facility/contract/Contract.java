package case_study.model.impl_facility.contract;

public class Contract {
    private String contractId;
    private String bookingId;
    private long deposit;
    private long payment;

    public Contract() {
    }

    public Contract(String contractId, String bookingId, long deposit, long payment) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.payment = payment;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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
                "contractId='" + contractId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", deposit=" + deposit +
                ", payment=" + payment +
                '}';
    }
}
