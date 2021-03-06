package com.hotel.sofiter.domain.room;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;

public class RoomModifyEntity {
    @ApiModelProperty("ID")
    @Min(value = 0,message = "房间ID不能为空!")
    private Integer id;

    @ApiModelProperty("房间号")
    @NotEmpty(message = "房间号不能为空!")
    private String roomNumber;

    @ApiModelProperty("客房等级ID")
    @Min(value = 0,message = "ID不能为空!")
    private Integer guestRoomLevelID;

    @ApiModelProperty("房态ID")
    @Min(value = 0,message = "ID不能为空!")
    private Integer roomStateID;

    @ApiModelProperty("床位数")
    @NotEmpty(message = "内容不能为空!")
    private String roomAmount;

    @ApiModelProperty("标准客房/天")
    @Min(value = 0,message = "价格不能为空!")
    private double standardPriceDay;

    @ApiModelProperty("标准房价/小时")
    @Min(value = 0,message = "价格不能为空!")
    private double standardPrice;

    @ApiModelProperty("时长限制")
    @NotEmpty(message = "内容不能为空!")
    private String maxDuration;

    @ApiModelProperty("首段时长")
    @NotEmpty(message = "内容不能为空!")
    private String firstDuration;

    @ApiModelProperty("首段价格")
    @Min(value = 0,message = "价格不能为空!")
    private double firstPrice;

    public RoomModifyEntity() {
    }

    public RoomModifyEntity(Integer id, String roomNumber, Integer guestRoomLevelID, Integer roomStateID, String roomAmount, double standardPriceDay, double standardPrice, String maxDuration, String firstDuration, double firstPrice) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.guestRoomLevelID = guestRoomLevelID;
        this.roomStateID = roomStateID;
        this.roomAmount = roomAmount;
        this.standardPriceDay = standardPriceDay;
        this.standardPrice = standardPrice;
        this.maxDuration = maxDuration;
        this.firstDuration = firstDuration;
        this.firstPrice = firstPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getGuestRoomLevelID() {
        return guestRoomLevelID;
    }

    public void setGuestRoomLevelID(Integer guestRoomLevelID) {
        this.guestRoomLevelID = guestRoomLevelID;
    }

    public Integer getRoomStateID() {
        return roomStateID;
    }

    public void setRoomStateID(Integer roomStateID) {
        this.roomStateID = roomStateID;
    }

    public String getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(String roomAmount) {
        this.roomAmount = roomAmount;
    }

    public double getStandardPriceDay() {
        return standardPriceDay;
    }

    public void setStandardPriceDay(double standardPriceDay) {
        this.standardPriceDay = standardPriceDay;
    }

    public double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(double standardPrice) {
        this.standardPrice = standardPrice;
    }

    public String getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
    }

    public String getFirstDuration() {
        return firstDuration;
    }

    public void setFirstDuration(String firstDuration) {
        this.firstDuration = firstDuration;
    }

    public double getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(double firstPrice) {
        this.firstPrice = firstPrice;
    }
}
