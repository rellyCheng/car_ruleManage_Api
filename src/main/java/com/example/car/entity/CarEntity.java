package com.example.car.entity;

import java.io.Serializable;
import java.util.Date;

public class CarEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.sign
     *
     * @mbg.generated
     */
    private String sign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.color
     *
     * @mbg.generated
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.seatNum
     *
     * @mbg.generated
     */
    private Integer seatNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.buyDate
     *
     * @mbg.generated
     */
    private Date buyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.carType
     *
     * @mbg.generated
     */
    private String carType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.userId
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.id
     *
     * @return the value of car.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.id
     *
     * @param id the value for car.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.sign
     *
     * @return the value of car.sign
     *
     * @mbg.generated
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.sign
     *
     * @param sign the value for car.sign
     *
     * @mbg.generated
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.color
     *
     * @return the value of car.color
     *
     * @mbg.generated
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.color
     *
     * @param color the value for car.color
     *
     * @mbg.generated
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.seatNum
     *
     * @return the value of car.seatNum
     *
     * @mbg.generated
     */
    public Integer getSeatNum() {
        return seatNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.seatNum
     *
     * @param seatNum the value for car.seatNum
     *
     * @mbg.generated
     */
    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.buyDate
     *
     * @return the value of car.buyDate
     *
     * @mbg.generated
     */
    public Date getBuyDate() {
        return buyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.buyDate
     *
     * @param buyDate the value for car.buyDate
     *
     * @mbg.generated
     */
    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.carType
     *
     * @return the value of car.carType
     *
     * @mbg.generated
     */
    public String getCarType() {
        return carType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.carType
     *
     * @param carType the value for car.carType
     *
     * @mbg.generated
     */
    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.userId
     *
     * @return the value of car.userId
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.userId
     *
     * @param userId the value for car.userId
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}