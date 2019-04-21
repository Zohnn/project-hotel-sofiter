package com.hotel.sofiter.domain.passenger;

import io.swagger.annotations.ApiModelProperty;

public class PassengerAddEntity {
    @ApiModelProperty("ID")
    private Integer id;
    @ApiModelProperty("证件ID")
    private Integer papersID;              //证件ID
    @ApiModelProperty("文化程度ID")
    private Integer educationDegreeID;     //文化程度ID
    @ApiModelProperty("性别ID")
    private Integer genderID;              //性别ID
    @ApiModelProperty("旅客级别ID")
    private Integer passengerLevelID;      //旅客级别ID
    @ApiModelProperty("民族ID")
    private Integer nationID;              //民族ID

    @ApiModelProperty("事由")
    private Integer thingReasonID;         //事由
    @ApiModelProperty("姓名")
    private String name;                   //姓名
    @ApiModelProperty("证件号码")
    private String papersNumber;           //证件号码
    @ApiModelProperty("出生日期")
    private String birthDate;              //出生日期
    @ApiModelProperty("发证机关")
    private String licenceIssuingAuthorty; //发证机关
    @ApiModelProperty("单位或住址")
    private String unitsOrAddress;         //单位或住址

    @ApiModelProperty("职业")
    private String profession;             //职业
    @ApiModelProperty("从何处来")
    private String whereAreFrom;           //从何处来
    @ApiModelProperty("到哪里去")
    private String whereToGo;              //到哪里去
    @ApiModelProperty("联系电话")
    private String contactPhoneNumber;     //联系电话
    @ApiModelProperty("备注")
    private String remarks;                //备注

    //扩展字段
    @ApiModelProperty("证件类型")
    private String papersName;             //证件类型
    @ApiModelProperty("文化程度名称")
    private String educationDegreeName;    //文化程度名称
    @ApiModelProperty("姓别")
    private String genderName;             //姓别
    @ApiModelProperty("旅客级别名称")
    private String passengerLevelName;     //旅客级别名称
    @ApiModelProperty("民族名称")
    private String nationName;             //民族名称
    @ApiModelProperty("民族名称")
    private String thingReasonName;        //民族名称

    public Integer getPapersID() {
        return papersID;
    }

    public void setPapersID(Integer papersID) {
        this.papersID = papersID;
    }

    public Integer getEducationDegreeID() {
        return educationDegreeID;
    }

    public void setEducationDegreeID(Integer educationDegreeID) {
        this.educationDegreeID = educationDegreeID;
    }

    public Integer getGenderID() {
        return genderID;
    }

    public void setGenderID(Integer genderID) {
        this.genderID = genderID;
    }

    public Integer getPassengerLevelID() {
        return passengerLevelID;
    }

    public void setPassengerLevelID(Integer passengerLevelID) {
        this.passengerLevelID = passengerLevelID;
    }

    public Integer getNationID() {
        return nationID;
    }

    public void setNationID(Integer nationID) {
        this.nationID = nationID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThingReasonID() {
        return thingReasonID;
    }

    public void setThingReasonID(Integer thingReasonID) {
        this.thingReasonID = thingReasonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPapersNumber() {
        return papersNumber;
    }

    public void setPapersNumber(String papersNumber) {
        this.papersNumber = papersNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLicenceIssuingAuthorty() {
        return licenceIssuingAuthorty;
    }

    public void setLicenceIssuingAuthorty(String licenceIssuingAuthorty) {
        this.licenceIssuingAuthorty = licenceIssuingAuthorty;
    }

    public String getUnitsOrAddress() {
        return unitsOrAddress;
    }

    public void setUnitsOrAddress(String unitsOrAddress) {
        this.unitsOrAddress = unitsOrAddress;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWhereAreFrom() {
        return whereAreFrom;
    }

    public void setWhereAreFrom(String whereAreFrom) {
        this.whereAreFrom = whereAreFrom;
    }

    public String getWhereToGo() {
        return whereToGo;
    }

    public void setWhereToGo(String whereToGo) {
        this.whereToGo = whereToGo;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPapersName() {
        return papersName;
    }

    public void setPapersName(String papersName) {
        this.papersName = papersName;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getPassengerLevelName() {
        return passengerLevelName;
    }

    public void setPassengerLevelName(String passengerLevelName) {
        this.passengerLevelName = passengerLevelName;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getThingReasonName() {
        return thingReasonName;
    }

    public void setThingReasonName(String thingReasonName) {
        this.thingReasonName = thingReasonName;
    }
}
