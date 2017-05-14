package com.sdcuike.practice.domain;

import java.util.Date;

public class AtlBank {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atl_bank.id
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    private Long id;
    
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atl_bank.bank_name
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    private String bankName;
    
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atl_bank.bank_code
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    private String bankCode;
    
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atl_bank.country_code
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    private String countryCode;
    
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atl_bank.bank_type
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    private String bankType;
    
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atl_bank.created_date
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    private Date createdDate;
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atl_bank.id
     *
     * @return the value of atl_bank.id
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public Long getId() {
        return id;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atl_bank.id
     *
     * @param id the value for atl_bank.id
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atl_bank.bank_name
     *
     * @return the value of atl_bank.bank_name
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public String getBankName() {
        return bankName;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atl_bank.bank_name
     *
     * @param bankName the value for atl_bank.bank_name
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atl_bank.bank_code
     *
     * @return the value of atl_bank.bank_code
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public String getBankCode() {
        return bankCode;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atl_bank.bank_code
     *
     * @param bankCode the value for atl_bank.bank_code
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atl_bank.country_code
     *
     * @return the value of atl_bank.country_code
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public String getCountryCode() {
        return countryCode;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atl_bank.country_code
     *
     * @param countryCode the value for atl_bank.country_code
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atl_bank.bank_type
     *
     * @return the value of atl_bank.bank_type
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public String getBankType() {
        return bankType;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atl_bank.bank_type
     *
     * @param bankType the value for atl_bank.bank_type
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atl_bank.created_date
     *
     * @return the value of atl_bank.created_date
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public Date getCreatedDate() {
        return createdDate;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atl_bank.created_date
     *
     * @param createdDate the value for atl_bank.created_date
     *
     * @mbg.generated Wed Apr 19 17:36:18 CST 2017
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}