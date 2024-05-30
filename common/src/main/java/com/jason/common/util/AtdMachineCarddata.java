package com.jason.common.util;

import com.jason.common.entity.CalculateCard;
import lombok.Getter;
import lombok.Setter;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author Jason.Chen
 * @create 2024/5/16 11:26
 */

public class AtdMachineCarddata implements Serializable {

    private String id;

    /**
     * 租户code  大写
     */
    private String tenantCode;

    /**
     * 设备类型：mobiledevice:移动端，attendancedevice:考勤机
     */

    private String deviceType;

    private String employeeBsInfo;

    /**
     * 员工卡号
     */
    private String fCardno;

    /**
     * 打卡时间
     */
    private String fReaddate;

    /**
     * 考勤机型号
     */
    private String fControllersn;

    /**
     * 设备
     */
    private String machineId;

    /**
     * 0未处理,1待处理，2已处理的正常数据，3短时间内重复性打卡数据，4刷卡时间转化错误，5获取维根码出现错误，6刷卡机不存在或卡号不存在的数据，10非法数据 在不属于自己的设备上刷卡
     */
    private Integer fFlag;

    /**
     * 刷卡数据的同步状态 0未读取，1待读取，2外地数据，3本地数据
     */
    private String sysstate;

    /**
     * 类型
     */
    private String fPunchtype;

    /**
     * 收卡时间
     */
    private String fLastupdatedtm;

    /**
     * 是否未手动删除 null、0|否，1|是
     */
    private Integer isDeleted;

    /**
     * 时区-无效
     */
    private Double machineOffset;

    /**
     * verify
     */
    private Integer verify;

    /**
     * 卡号
     */
    private String cardnum;

    /**
     * macsn
     */
    private String macsn;

    /**
     * 批次id
     */
    private String lockedBy;

    /**
     * 人员id
     */
    private String personId;

    /**
     * 创建时间
     */
    private Date createDtm;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 最后更新时间
     */
    private Date lastUpdateDtm;

    /**
     * 最后更新人
     */
    private String lastUpdateUser;

    /**
     * 收卡来源  1收卡服务 2手动补卡（考勤卡） 3自动补卡（计算） 4异常申述卡补卡
     */
    private Integer source;

    /**
     * 考勤卡补卡日期
     */
    private Date timecardDate;

    /**
     * 考勤卡补卡第几笔卡
     */
    private Integer timecardNum;

    /**
     * 是否是临时计算  true 是  false 否
     */
    private Boolean isTemporary;


    /**
     * 4.0的关键字opId，用于标记是否是最后一条考勤卡
     */
    private String opId;

    /**
     * 是否为强制
     */
    private Boolean isForce;

    /**
     * 重算操作对象
     */
    private CalculateCard calculateCard;

    /**
     * 重算调试标识
     */
    private Boolean recalculateDebug = false;

    /**
     * 考勤周期关闭/锁定，重算是否受开关影响
     */
    private Boolean recalByLockFlag;

    /**
     * 生效日期
     */
    private Date effectDate;

    /**
     * 关联id
     */
    private String correlationId;

    /**
     * 签到打卡附加信息
     */
    private String attendanceExtraInfo;

    public boolean isBatchRecal = false;

    public boolean isSendToAcc = false;
    // 重算开始时间
    public String startDate;
    // 重算结束时间
    public String endDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getEmployeeBsInfo() {
        return employeeBsInfo;
    }

    public void setEmployeeBsInfo(String employeeBsInfo) {
        this.employeeBsInfo = employeeBsInfo;
    }

    public String getfCardno() {
        return fCardno;
    }

    public void setfCardno(String fCardno) {
        this.fCardno = fCardno;
    }

    public String getfReaddate() {
        return fReaddate;
    }

    public void setfReaddate(String fReaddate) {
        this.fReaddate = fReaddate;
    }

    public String getfControllersn() {
        return fControllersn;
    }

    public void setfControllersn(String fControllersn) {
        this.fControllersn = fControllersn;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public Integer getfFlag() {
        return fFlag;
    }

    public void setfFlag(Integer fFlag) {
        this.fFlag = fFlag;
    }

    public String getSysstate() {
        return sysstate;
    }

    public void setSysstate(String sysstate) {
        this.sysstate = sysstate;
    }

    public String getfPunchtype() {
        return fPunchtype;
    }

    public void setfPunchtype(String fPunchtype) {
        this.fPunchtype = fPunchtype;
    }

    public String getfLastupdatedtm() {
        return fLastupdatedtm;
    }

    public void setfLastupdatedtm(String fLastupdatedtm) {
        this.fLastupdatedtm = fLastupdatedtm;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Double getMachineOffset() {
        return machineOffset;
    }

    public void setMachineOffset(Double machineOffset) {
        this.machineOffset = machineOffset;
    }

    public Integer getVerify() {
        return verify;
    }

    public void setVerify(Integer verify) {
        this.verify = verify;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getMacsn() {
        return macsn;
    }

    public void setMacsn(String macsn) {
        this.macsn = macsn;
    }

    public String getLockedBy() {
        return lockedBy;
    }

    public void setLockedBy(String lockedBy) {
        this.lockedBy = lockedBy;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Date getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getLastUpdateDtm() {
        return lastUpdateDtm;
    }

    public void setLastUpdateDtm(Date lastUpdateDtm) {
        this.lastUpdateDtm = lastUpdateDtm;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Date getTimecardDate() {
        return timecardDate;
    }

    public void setTimecardDate(Date timecardDate) {
        this.timecardDate = timecardDate;
    }

    public Integer getTimecardNum() {
        return timecardNum;
    }

    public void setTimecardNum(Integer timecardNum) {
        this.timecardNum = timecardNum;
    }

    public Boolean getTemporary() {
        return isTemporary;
    }

    public void setTemporary(Boolean temporary) {
        isTemporary = temporary;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public Boolean getForce() {
        return isForce;
    }

    public void setForce(Boolean force) {
        isForce = force;
    }

    public CalculateCard getCalculateCard() {
        return calculateCard;
    }

    public void setCalculateCard(CalculateCard calculateCard) {
        this.calculateCard = calculateCard;
    }

    public Boolean getRecalculateDebug() {
        return recalculateDebug;
    }

    public void setRecalculateDebug(Boolean recalculateDebug) {
        this.recalculateDebug = recalculateDebug;
    }

    public Boolean getRecalByLockFlag() {
        return recalByLockFlag;
    }

    public void setRecalByLockFlag(Boolean recalByLockFlag) {
        this.recalByLockFlag = recalByLockFlag;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getAttendanceExtraInfo() {
        return attendanceExtraInfo;
    }

    public void setAttendanceExtraInfo(String attendanceExtraInfo) {
        this.attendanceExtraInfo = attendanceExtraInfo;
    }

    public boolean isBatchRecal() {
        return isBatchRecal;
    }

    public void setBatchRecal(boolean batchRecal) {
        isBatchRecal = batchRecal;
    }

    public boolean isSendToAcc() {
        return isSendToAcc;
    }

    public void setSendToAcc(boolean sendToAcc) {
        isSendToAcc = sendToAcc;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
