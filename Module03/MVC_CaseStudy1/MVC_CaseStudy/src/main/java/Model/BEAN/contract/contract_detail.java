package Model.BEAN.contract;

public class contract_detail {
    private int contract_detail_id;
    private contract contract_id;
    private attach_service attach_service_id;
    private int quantity;

    public contract_detail() {
    }

    public contract_detail(int contract_detail_id, contract contract_id, attach_service attach_service_id, int quantity) {
        this.contract_detail_id = contract_detail_id;
        this.contract_id = contract_id;
        this.attach_service_id = attach_service_id;
        this.quantity = quantity;
    }

    public int getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(int contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
    }

    public contract getContract_id() {
        return contract_id;
    }

    public void setContract_id(contract contract_id) {
        this.contract_id = contract_id;
    }

    public attach_service getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(attach_service attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

