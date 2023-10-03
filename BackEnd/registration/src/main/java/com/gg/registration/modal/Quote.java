package com.gg.registration.modal;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Column;


	@Entity
	public class Quote {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @Column(nullable = false)
	    private String emailId;
	    @Column(nullable = false)
	    private String insuranceCategory;
	    @Column(nullable = false)
	    private String name;
	    @Column(nullable = false)
	    private String phone;
	    @Column(nullable = false)
	    private String vehicleNumber;

	    public Quote() {
	        // Default constructor
	    }

	    public Quote(String emailId, String insuranceCategory, String name, String phone, String vehicleNumber) {
	        this.emailId = emailId;
	        this.insuranceCategory = insuranceCategory;
	        this.name = name;
	        this.phone = phone;
	        this.vehicleNumber = vehicleNumber;
	    }

	    // Getter and Setter methods

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getEmailId() {
	        return emailId;
	    }

	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }

	    public String getInsuranceCategory() {
	        return insuranceCategory;
	    }

	    public void setInsuranceCategory(String insuranceCategory) {
	        this.insuranceCategory = insuranceCategory;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public void setVehicleNumber(String vehicleNumber) {
	        this.vehicleNumber = vehicleNumber;
	    }
	}


