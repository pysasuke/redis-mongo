package com.py.test.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "tcustomer")
public class Tcustomer implements Serializable{
    /**
     * 客户ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 编码
     */
    @Column(name = "CustomerCode")
    private String customercode;

    /**
     * 用户名
     */
    @Column(name = "CustUserName")
    private String custusername;

    /**
     * 密码
     */
    @Column(name = "CustPassword")
    private String custpassword;

    /**
     * 姓名
     */
    @Column(name = "CusName")
    private String cusname;

    /**
     * 称呼
     */
    @Column(name = "CusCall")
    private String cuscall;

    /**
     * 手机号
     */
    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "MobileTwo")
    private String mobiletwo;

    /**
     * 跟进状态ID
     */
    @Column(name = "StateID")
    private Long stateid;

    /**
     * 跟进状态
     */
    @Column(name = "State")
    private String state;

    /**
     * 组织
     */
    @Column(name = "OrgName")
    private String orgname;

    /**
     * 组织ID
     */
    @Column(name = "OrgID_fk")
    private Long orgidFk;

    /**
     * 门店
     */
    @Column(name = "Stores")
    private String stores;

    /**
     * 门店ID
     */
    @Column(name = "StoresID")
    private Long storesid;

    /**
     * 电销员ID
     */
    @Column(name = "MobileSalesID")
    private Long mobilesalesid;

    /**
     * 电销员
     */
    @Column(name = "MobileSales")
    private String mobilesales;

    /**
     * 客户经理ID
     */
    @Column(name = "CustSalesID")
    private Long custsalesid;

    /**
     * 客户经理
     */
    @Column(name = "CustSales")
    private String custsales;

    /**
     * 设计师ID
     */
    @Column(name = "DesignerID")
    private Long designerid;

    /**
     * 设计师
     */
    @Column(name = "Designer")
    private String designer;

    /**
     * 小区名称
     */
    @Column(name = "Village")
    private String village;

    /**
     * 验证状态
     */
    @Column(name = "IsVerify")
    private Boolean isverify;

    /**
     * 注册时间
     */
    @Column(name = "RegistrationTime")
    private Date registrationtime;

    /**
     * 来源ID
     */
    @Column(name = "SourceID")
    private Long sourceid;

    /**
     * 来源
     */
    @Column(name = "Source")
    private String source;

    /**
     * 量房日期
     */
    @Column(name = "ScaleDate")
    private Date scaledate;

    /**
     * 量房时间段
     */
    @Column(name = "ScaleTime")
    private String scaletime;

    /**
     * 创建人
     */
    @Column(name = "CreateUser")
    private String createuser;
    /**
     * 创建人Id
     */
    @Column(name = "CreateUserid")
    private Long createuserid;
    /**
     * 创建时间
     */
    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * 最后修改人
     */
    @Column(name = "LastUser")
    private String lastuser;
    /**
     * 最后修改人ID
     */
    @Column(name = "LastUserid")
    private Long lastuserid;

    /**
     * 最后修改时间
     */
    @Column(name = "LastTime")
    private Date lasttime;

    /**
     * 房型
     */
    @Column(name = "RoomModel")
    private String roommodel;

    /**
     * 面积
     */
    @Column(name = "Area")
    private BigDecimal area;

    /**
     * 市
     */
    @Column(name = "CityName")
    private String cityname;

    /**
     * 头像
     */
    @Column(name = "Picture")
    private String picture;







    /**
     * 获取客户ID
     *
     * @return ID - 客户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置客户ID
     *
     * @param id 客户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取编码
     *
     * @return CustomerCode - 编码
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
     * 设置编码
     *
     * @param customercode 编码
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
     * 获取用户名
     *
     * @return CustUserName - 用户名
     */
    public String getCustusername() {
        return custusername;
    }

    /**
     * 设置用户名
     *
     * @param custusername 用户名
     */
    public void setCustusername(String custusername) {
        this.custusername = custusername;
    }

    /**
     * 获取密码
     *
     * @return CustPassword - 密码
     */
    public String getCustpassword() {
        return custpassword;
    }

    /**
     * 设置密码
     *
     * @param custpassword 密码
     */
    public void setCustpassword(String custpassword) {
        this.custpassword = custpassword;
    }

    /**
     * 获取姓名
     *
     * @return CusName - 姓名
     */
    public String getCusname() {
        return cusname;
    }

    /**
     * 设置姓名
     *
     * @param cusname 姓名
     */
    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    /**
     * 获取称呼
     *
     * @return CusCall - 称呼
     */
    public String getCuscall() {
        return cuscall;
    }

    /**
     * 设置称呼
     *
     * @param cuscall 称呼
     */
    public void setCuscall(String cuscall) {
        this.cuscall = cuscall;
    }

    /**
     * 获取手机号
     *
     * @return Mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return MobileTwo
     */
    public String getMobiletwo() {
        return mobiletwo;
    }

    /**
     * @param mobiletwo
     */
    public void setMobiletwo(String mobiletwo) {
        this.mobiletwo = mobiletwo;
    }

    /**
     * 获取跟进状态ID
     *
     * @return StateID - 跟进状态ID
     */
    public Long getStateid() {
        return stateid;
    }

    /**
     * 设置跟进状态ID
     *
     * @param stateid 跟进状态ID
     */
    public void setStateid(Long stateid) {
        this.stateid = stateid;
    }

    /**
     * 获取跟进状态
     *
     * @return State - 跟进状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置跟进状态
     *
     * @param state 跟进状态
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取组织
     *
     * @return OrgName - 组织
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * 设置组织
     *
     * @param orgname 组织
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    /**
     * 获取组织ID
     *
     * @return OrgID_fk - 组织ID
     */
    public Long getOrgidFk() {
        return orgidFk;
    }

    /**
     * 设置组织ID
     *
     * @param orgidFk 组织ID
     */
    public void setOrgidFk(Long orgidFk) {
        this.orgidFk = orgidFk;
    }

    /**
     * 获取门店
     *
     * @return Stores - 门店
     */
    public String getStores() {
        return stores;
    }

    /**
     * 设置门店
     *
     * @param stores 门店
     */
    public void setStores(String stores) {
        this.stores = stores;
    }

    /**
     * 获取门店ID
     *
     * @return StoresID - 门店ID
     */
    public Long getStoresid() {
        return storesid;
    }

    /**
     * 设置门店ID
     *
     * @param storesid 门店ID
     */
    public void setStoresid(Long storesid) {
        this.storesid = storesid;
    }

    /**
     * 获取电销员ID
     *
     * @return MobileSalesID - 电销员ID
     */
    public Long getMobilesalesid() {
        return mobilesalesid;
    }

    /**
     * 设置电销员ID
     *
     * @param mobilesalesid 电销员ID
     */
    public void setMobilesalesid(Long mobilesalesid) {
        this.mobilesalesid = mobilesalesid;
    }

    /**
     * 获取电销员
     *
     * @return MobileSales - 电销员
     */
    public String getMobilesales() {
        return mobilesales;
    }

    /**
     * 设置电销员
     *
     * @param mobilesales 电销员
     */
    public void setMobilesales(String mobilesales) {
        this.mobilesales = mobilesales;
    }

    /**
     * 获取客户经理ID
     *
     * @return CustSalesID - 客户经理ID
     */
    public Long getCustsalesid() {
        return custsalesid;
    }

    /**
     * 设置客户经理ID
     *
     * @param custsalesid 客户经理ID
     */
    public void setCustsalesid(Long custsalesid) {
        this.custsalesid = custsalesid;
    }

    /**
     * 获取客户经理
     *
     * @return CustSales - 客户经理
     */
    public String getCustsales() {
        return custsales;
    }

    /**
     * 设置客户经理
     *
     * @param custsales 客户经理
     */
    public void setCustsales(String custsales) {
        this.custsales = custsales;
    }

    /**
     * 获取设计师ID
     *
     * @return DesignerID - 设计师ID
     */
    public Long getDesignerid() {
        return designerid;
    }

    /**
     * 设置设计师ID
     *
     * @param designerid 设计师ID
     */
    public void setDesignerid(Long designerid) {
        this.designerid = designerid;
    }

    /**
     * 获取设计师
     *
     * @return Designer - 设计师
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * 设置设计师
     *
     * @param designer 设计师
     */
    public void setDesigner(String designer) {
        this.designer = designer;
    }

    /**
     * 获取小区名称
     *
     * @return Village - 小区名称
     */
    public String getVillage() {
        return village;
    }

    /**
     * 设置小区名称
     *
     * @param village 小区名称
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * 获取验证状态
     *
     * @return IsVerify - 验证状态
     */
    public Boolean getIsverify() {
        return isverify;
    }

    /**
     * 设置验证状态
     *
     * @param isverify 验证状态
     */
    public void setIsverify(Boolean isverify) {
        this.isverify = isverify;
    }

    /**
     * 获取注册时间
     *
     * @return RegistrationTime - 注册时间
     */
    public Date getRegistrationtime() {
        return registrationtime;
    }

    /**
     * 设置注册时间
     *
     * @param registrationtime 注册时间
     */
    public void setRegistrationtime(Date registrationtime) {
        this.registrationtime = registrationtime;
    }

    /**
     * 获取来源ID
     *
     * @return SourceID - 来源ID
     */
    public Long getSourceid() {
        return sourceid;
    }

    /**
     * 设置来源ID
     *
     * @param sourceid 来源ID
     */
    public void setSourceid(Long sourceid) {
        this.sourceid = sourceid;
    }

    /**
     * 获取来源
     *
     * @return Source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取量房日期
     *
     * @return ScaleDate - 量房日期
     */
    public Date getScaledate() {
        return scaledate;
    }

    /**
     * 设置量房日期
     *
     * @param scaledate 量房日期
     */
    public void setScaledate(Date scaledate) {
        this.scaledate = scaledate;
    }

    /**
     * 获取量房时间段
     *
     * @return ScaleTime - 量房时间段
     */
    public String getScaletime() {
        return scaletime;
    }

    /**
     * 设置量房时间段
     *
     * @param scaletime 量房时间段
     */
    public void setScaletime(String scaletime) {
        this.scaletime = scaletime;
    }

    /**
     * 获取创建人
     *
     * @return CreateUser - 创建人
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人
     *
     * @param createuser 创建人
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取创建时间
     *
     * @return CreateTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取最后修改人
     *
     * @return LastUser - 最后修改人
     */
    public String getLastuser() {
        return lastuser;
    }

    /**
     * 设置最后修改人
     *
     * @param lastuser 最后修改人
     */
    public void setLastuser(String lastuser) {
        this.lastuser = lastuser;
    }

    /**
     * 获取最后修改时间
     *
     * @return LastTime - 最后修改时间
     */
    public Date getLasttime() {
        return lasttime;
    }

    /**
     * 设置最后修改时间
     *
     * @param lasttime 最后修改时间
     */
    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * 获取房型
     *
     * @return RoomModel - 房型
     */
    public String getRoommodel() {
        return roommodel;
    }

    /**
     * 设置房型
     *
     * @param roommodel 房型
     */
    public void setRoommodel(String roommodel) {
        this.roommodel = roommodel;
    }

    /**
     * 获取面积
     *
     * @return Area - 面积
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * 设置面积
     *
     * @param area 面积
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * 获取市
     *
     * @return CityName - 市
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * 设置市
     *
     * @param cityname 市
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * 获取头像
     *
     * @return Picture - 头像
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置头像
     *
     * @param picture 头像
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取创建人id
     * @return
     */
    public Long getCreateuserid() {
        return createuserid;
    }

    /**
     * 设置创建人id
     * @param createuserid
     */
    public void setCreateuserid(Long createuserid) {
        this.createuserid = createuserid;
    }

    /**
     * 获取最后修改人id
     * @return
     */
    public Long getLastuserid() {
        return lastuserid;
    }

    /**
     * 设置最后修改人id
     * @param lastuserid
     */
    public void setLastuserid(Long lastuserid) {
        this.lastuserid = lastuserid;
    }
}