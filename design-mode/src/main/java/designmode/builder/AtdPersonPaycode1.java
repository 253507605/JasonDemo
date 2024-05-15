package designmode.builder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 17:17
 */
public class AtdPersonPaycode1 implements Cloneable, Serializable {
    /**
     * 主键id
     */
    private String id;

    /**
     * 租户code
     */
    private String tenantCode;

    /**
     * 人员id
     */
    private String personId;

    /**
     * 日期
     */
    private Date timecardDate;

    /**
     * 出勤代码定义id
     */
    private String paycodeId;

    /**
     * 规则id
     */
    private String ruleId;

    /**
     * 应刷卡时间
     */
    private String atdTime;

    /**
     * 应刷卡日期+时间
     */
    private String atdDateTime;

    /**
     * 开始时间   日期+时间
     */
    private Date startDtm;

    /**
     * 结束时间   日期+时间
     */
    private Date endDtm;

    /**
     * 数值
     */
    private BigDecimal payhours;

    /**
     * 金额数值
     */
    private BigDecimal amount;

    /**
     * 规则计算出原始数值
     */
    private BigDecimal originalPayhours;

    /**
     * 没有处理过的数值
     */
    private BigDecimal unProcessedPayhours;

    /**
     * 类型 0标准，1期间
     */
    private Integer type;

    /**
     * 单位 0天数，1小时，2金额，3次数，4分钟
     */
    private Integer unit;

    /**
     * 归属日期
     */
    private Date belongDate;

    /**
     * 计算类型 CalculateTypeEnum 枚举
     * 补偿和扣除 1    加班规则 2    时间区 3
     * 排班偏离 4    组合规则 5    组合出勤代码 6
     * 缺勤异常 7    未排版异常 8    迟到 9
     * 早退 10    标准工时 11    待审批工时 12
     * 排班工时 13  应工作天数 14  伪代码 15 加班单异常 16 有打卡无加班单异常 19
     */
    private Integer calculateType;

    /**
     * 转调休的额度
     */
    private BigDecimal toResultPayhours;

    /**
     * 原始转移出勤代码id
     */
    private String originalPaycodeId;

    /**
     * paycode来源：1、劳动力账户转移
     */
    private Byte paycodeSource;

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
     * 对接4.0的时间戳
     */
    private Date calculateDtm =new Date();

    /**
     * 标记判断是否更新全部 uuid
     */
    private String updateFlag;

    /**
     * 打卡时间   日期+时间
     */
    private String cardTime;

    /**
     * 加班单id
     */
    private String overTimeOrderId;

    /**
     * 加班单中的是否转调休 0：否  1：是
     */
    private Boolean changeToRestFlag = false;

    /**
     * 时间段id
     */
    private String typeId;

    /**
     * 劳动力账号
     */
    private String laborAccountId;

    /**
     * 劳动力账户层级
     */
    private String laborAccountDetail;

    /**
     * 伪代码规则计算的日志字段
     */
    private String loggerStr ="";

    /**
     * 累计加班或调休标识,同时也是区分计算,累计的标识.6累计加班，7累计调休
     */
    private Byte src;

    /**
     * 班别id
     */
    private String timeClassId;

    /**
     * 劳动力账户是否合并
     */
    private boolean laborAccountHadMerge;

    /**
     * 组合出勤代码分别转调休的结果（true：加班单上转调休  false：加班单上不转调休）
     */
    private Boolean changeToRestSeparately;

    /**
     * 组合出勤代码勾选了“分别转调休”，会计算多个结果，通过这个id关联
     */
    private String conbinedPaycodeSepId;


    public Byte getSrc() {
        return src;
    }

    public void setSrc(Byte src) {
        this.src = src;
    }

    public Boolean getChangeToRestFlag() {
        return changeToRestFlag;
    }

    public void setChangeToRestFlag(Boolean changeToRestFlag) {
        this.changeToRestFlag = changeToRestFlag;
    }

    public String getCardTime() {
        return cardTime;
    }

    public void setCardTime(String cardTime) {
        this.cardTime = cardTime;
    }

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取租户code
     *
     * @return tenant_code - 租户code
     */
    public String getTenantCode() {
        return tenantCode == null ? "" : tenantCode.toUpperCase();
    }

    /**
     * 设置租户code
     *
     * @param tenantCode 租户code
     */
    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode == null ? "" : tenantCode.toUpperCase();
    }

    /**
     * 获取人员id
     *
     * @return personId - 人员id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 设置人员id
     *
     * @param personId 人员id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * 获取日期
     *
     * @return timecard_date - 日期
     */
    public Date getTimecardDate() {
        return timecardDate;
    }

    /**
     * 设置日期
     *
     * @param timecardDate 日期
     */
    public void setTimecardDate(Date timecardDate) {
        this.timecardDate = timecardDate;
    }

    /**
     * 获取出勤代码定义id
     *
     * @return paycode_id - 出勤代码定义id
     */
    public String getPaycodeId() {
        return paycodeId;
    }

    /**
     * 设置出勤代码定义id
     *
     * @param paycodeId 出勤代码定义id
     */
    public void setPaycodeId(String paycodeId) {
        this.paycodeId = paycodeId;
    }

    /**
     * 获取规则id
     *
     * @return rule_id - 规则id
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * 设置规则id
     *
     * @param ruleId 规则id
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取应刷卡时间
     *
     * @return atdTime - 应刷卡时间
     */
    public String getAtdTime() {
        return atdTime;
    }

    /**
     * 设置应刷卡时间
     *
     * @param atdTime 应刷卡时间
     */
    public void setAtdTime(String atdTime) {
        this.atdTime = atdTime;
    }

    /**
     * 获取应刷卡日期时间
     * @return
     */
    public String getAtdDateTime() {
        return atdDateTime;
    }

    /**
     * 设置应刷卡日期时间
     * @param atdDateTime
     */
    public void setAtdDateTime(String atdDateTime) {
        this.atdDateTime = atdDateTime;
    }

    /**
     * 获取开始时间   日期+时间
     *
     * @return start_dtm - 开始时间   日期+时间
     */
    public Date getStartDtm() {
        return startDtm;
    }

    /**
     * 设置开始时间   日期+时间
     *
     * @param startDtm 开始时间   日期+时间
     */
    public void setStartDtm(Date startDtm) {
        this.startDtm = startDtm;
    }

    /**
     * 获取结束时间   日期+时间
     *
     * @return end_dtm - 结束时间   日期+时间
     */
    public Date getEndDtm() {
        return endDtm;
    }

    /**
     * 设置结束时间   日期+时间
     *
     * @param endDtm 结束时间   日期+时间
     */
    public void setEndDtm(Date endDtm) {
        this.endDtm = endDtm;
    }

    /**
     * 获取数值
     *
     * @return payhours - 数值
     */
    public BigDecimal getPayhours() {
        return payhours;
    }

    /**
     * 设置数值
     *
     * @param payhours 数值
     */
    public void setPayhours(BigDecimal payhours) {
        this.payhours = payhours;
    }

    /**
     * 获取规则计算出原始数值
     *
     * @return originalPayhours - 原始数值
     */
    public BigDecimal getOriginalPayhours() {
        return originalPayhours;
    }

    /**
     * 设置规则计算出原始数值
     *
     * @param originalPayhours 原始数值
     */
    public void setOriginalPayhours(BigDecimal originalPayhours) {
        this.originalPayhours = originalPayhours;
    }

    /**
     * 获取没有经过加工的结果数值
     * @return
     */
    public BigDecimal getUnProcessedPayhours() {
        return unProcessedPayhours;
    }

    /**
     * 设置没有经过加工的结果数值
     * @param unProcessedPayhours
     */
    public void setUnProcessedPayhours(BigDecimal unProcessedPayhours) {
        this.unProcessedPayhours = unProcessedPayhours;
    }


    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取单位
     *
     * @return unit - 单位
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * 获取归属日期
     *
     * @return belongDate - 归属日期
     */
    public Date getBelongDate() {
        return belongDate;
    }

    /**
     * 设置归属日期
     *
     * @param belongDate 归属日期
     */
    public void setBelongDate(Date belongDate) {
        this.belongDate = belongDate;
    }

    /**
     * 获取计算类型
     *
     * @return calculateType - 计算类型
     */
    public Integer getCalculateType() {
        return calculateType;
    }

    /**
     * 设置计算类型
     *
     * @param calculateType 计算类型
     */
    public void setCalculateType(Integer calculateType) {
        this.calculateType = calculateType;
    }

    /**
     * 获取加班转调休的额度
     * @return
     */
    public BigDecimal getToResultPayhours() {
        return toResultPayhours;
    }

    /**
     * 设置加班转调休的额度
     * @param toResultPayhours
     */
    public void setToResultPayhours(BigDecimal toResultPayhours) {
        this.toResultPayhours = toResultPayhours;
    }

    /**
     * 获得转调休之前的出勤代码id
     * @return
     */
    public String getOriginalPaycodeId() {
        return originalPaycodeId;
    }

    /**
     * 设置转调休之前的出勤代码id
     * @param originalPaycodeId
     */
    public void setOriginalPaycodeId(String originalPaycodeId) {
        this.originalPaycodeId = originalPaycodeId;
    }

    public Byte getPaycodeSource() {
        return paycodeSource;
    }

    public void setPaycodeSource(Byte paycodeSource) {
        this.paycodeSource = paycodeSource;
    }

    /**
     *是否计算到秒级
     */
    private boolean calculateSecond =false;
    /**
     * 模型的位置标签用于传考勤（知道是第几个模型的第几个位置）
     */
    private List<String> cardNumToWfm = new ArrayList<>();

    /**
     * 获取创建时间
     *
     * @return create_dtm - 创建时间
     */
    public Date getCreateDtm() {
        return createDtm;
    }

    /**
     * 设置创建时间
     *
     * @param createDtm 创建时间
     */
    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取最后更新时间
     *
     * @return last_update_dtm - 最后更新时间
     */
    public Date getLastUpdateDtm() {
        return lastUpdateDtm;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateDtm 最后更新时间
     */
    public void setLastUpdateDtm(Date lastUpdateDtm) {
        this.lastUpdateDtm = lastUpdateDtm;
    }

    /**
     * 获取最后更新人
     *
     * @return last_update_user - 最后更新人
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * 设置最后更新人
     *
     * @param lastUpdateUser 最后更新人
     */

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getLoggerStr() {
        return loggerStr;
    }

    public void setLoggerStr(String loggerStr) {
        this.loggerStr = loggerStr;
    }


    public Date getCalculateDtm() {
        return calculateDtm;
    }

    public void setCalculateDtm(Date calculateDtm) {
        this.calculateDtm = calculateDtm;
    }

    public String getOverTimeOrderId() {
        return overTimeOrderId;
    }

    public void setOverTimeOrderId(String overTimeOrderId) {
        this.overTimeOrderId = overTimeOrderId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getLaborAccountId() {
        return laborAccountId;
    }

    public void setLaborAccountId(String laborAccountId) {
        this.laborAccountId = laborAccountId;
    }

    public String getTimeClassId() {
        return timeClassId;
    }

    public void setTimeClassId(String timeClassId) {
        this.timeClassId = timeClassId;
    }

    public String getLaborAccountDetail() {
        return laborAccountDetail;
    }

    public void setLaborAccountDetail(String laborAccountDetail) {
        this.laborAccountDetail = laborAccountDetail;
    }

    public boolean isLaborAccountHadMerge() {
        return laborAccountHadMerge;
    }

    public void setLaborAccountHadMerge(boolean laborAccountHadMerge) {
        this.laborAccountHadMerge = laborAccountHadMerge;
    }

    public Boolean getChangeToRestSeparately() {
        return changeToRestSeparately;
    }

    public void setChangeToRestSeparately(Boolean changeToRestSeparately) {
        this.changeToRestSeparately = changeToRestSeparately;
    }

    public String getConbinedPaycodeSepId() {
        return conbinedPaycodeSepId;
    }

    public void setConbinedPaycodeSepId(String conbinedPaycodeSepId) {
        this.conbinedPaycodeSepId = conbinedPaycodeSepId;
    }

    public BigDecimal getAmount() { return amount; }

    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public boolean isCalculateSecond() { return calculateSecond; }

    public void setCalculateSecond(boolean calculateSecond) { this.calculateSecond = calculateSecond; }



    public List<String> getCardNumToWfm() {
        return cardNumToWfm;
    }

    public void setCardNumToWfm(List<String> cardNumToWfm) {
        this.cardNumToWfm = cardNumToWfm;
    }


    public static Builder createBuilder(){
        return new Builder();
    }

    public static class Builder{

        private AtdPersonPaycode1 atdPersonPaycode1 = new AtdPersonPaycode1();

        public Builder addId(String id){
            atdPersonPaycode1.setId(id);
            return this;
        }

        public Builder addTenantCode(String tenantCode){
            atdPersonPaycode1.setTenantCode(tenantCode);
            return this;
        }

        public Builder addPersonId(String personId){
            atdPersonPaycode1.setPersonId(personId);
            return this;
        }

        public Builder addTimecardDate(Date timecardDate){
            atdPersonPaycode1.setTimecardDate(timecardDate);
            return this;
        }

        public Builder addPaycodeId(String paycodeId){
            atdPersonPaycode1.setPaycodeId(paycodeId);
            return this;
        }

        public Builder addRuleId(String ruleId){
            atdPersonPaycode1.setRuleId(ruleId);
            return this;
        }

        public Builder addAtdTime(String atdTime){
            atdPersonPaycode1.setAtdTime(atdTime);
            return this;
        }

        public Builder addtdDateTime(String atdDateTime){
            atdPersonPaycode1.setAtdDateTime(atdDateTime);
            return this;
        }

        public Builder addStartDtm(Date startDtm){
            atdPersonPaycode1.setStartDtm(startDtm);
            return this;
        }

        public Builder addEndDtm(Date endDtm){
            atdPersonPaycode1.setEndDtm(endDtm);
            return this;
        }

        public Builder addPayhours(BigDecimal payhours){
            atdPersonPaycode1.setPayhours(payhours);
            return this;
        }

        public Builder addAmount(BigDecimal amount){
            atdPersonPaycode1.setAmount(amount);
            return this;
        }

        public Builder addOriginalPayhours(BigDecimal originalPayhours){
            atdPersonPaycode1.setOriginalPayhours(originalPayhours);
            return this;
        }

        public Builder addUnProcessedPayhours(BigDecimal unProcessedPayhours){
            atdPersonPaycode1.setUnProcessedPayhours(unProcessedPayhours);
            return this;
        }

        public Builder addType(Integer type){
            atdPersonPaycode1.setType(type);
            return this;
        }

        public Builder addUnit(Integer unit){
            atdPersonPaycode1.setUnit(unit);
            return this;
        }

        public Builder addBelongDate(Date belongDate){
            atdPersonPaycode1.setBelongDate(belongDate);
            return this;
        }

        public AtdPersonPaycode1 build(){

            return atdPersonPaycode1;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
