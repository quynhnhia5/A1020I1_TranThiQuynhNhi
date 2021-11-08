package Model.BEAN.customer;

import java.util.Date;

public class customer {
    private  int customer_id;
    private Model.BEAN.customer.customerType customerType;
    private String customer_name;
    private String customer_birthday;
    private boolean customer_gender;
    private String customer_is_card;
    private String customer_phone;
    private String customer_email;
    private String customer_address;


    public customer() {
    }

    public customer(Model.BEAN.customer.customerType customerType, String customer_name, String customer_birthday, boolean customer_gender, String customer_is_card, String customer_phone, String customer_email, String customer_address) {
        this.customerType = customerType;
        this.customer_name = customer_name;
        this.customer_birthday = customer_birthday;
        this.customer_gender = customer_gender;
        this.customer_is_card = customer_is_card;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }

    public customer(int customer_id, Model.BEAN.customer.customerType customerType, String customer_name, String customer_birthday, boolean customer_gender, String customer_is_card, String customer_phone, String customer_email, String customer_address) {
        this.customer_id = customer_id;
        this.customerType = customerType;
        this.customer_name = customer_name;
        this.customer_birthday = customer_birthday;
        this.customer_gender = customer_gender;
        this.customer_is_card = customer_is_card;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Model.BEAN.customer.customerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Model.BEAN.customer.customerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(String customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public boolean isCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(boolean customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getCustomer_is_card() {
        return customer_is_card;
    }

    public void setCustomer_is_card(String customer_is_card) {
        this.customer_is_card = customer_is_card;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
