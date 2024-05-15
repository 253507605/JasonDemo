package designmode.builder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 14:59
 * 实现方式1
 */
public class ConcreterBuilder implements Builder{

    private AtdPersonPaycode atdPersonPaycode = new AtdPersonPaycode();

    public ConcreterBuilder addId(String id){
        atdPersonPaycode.setId(id);
        return this;
    }

    public ConcreterBuilder addTenantCode(String tenantCode){
        atdPersonPaycode.setTenantCode(tenantCode);
        return this;
    }

    public ConcreterBuilder addPersonId(String personId){
        atdPersonPaycode.setPersonId(personId);
        return this;
    }

    public ConcreterBuilder addTimecardDate(Date timecardDate){
        atdPersonPaycode.setTimecardDate(timecardDate);
        return this;
    }

    public ConcreterBuilder addPaycodeId(String paycodeId){
        atdPersonPaycode.setPaycodeId(paycodeId);
        return this;
    }

    public ConcreterBuilder addRuleId(String ruleId){
        atdPersonPaycode.setRuleId(ruleId);
        return this;
    }

    public ConcreterBuilder addAtdTime(String atdTime){
        atdPersonPaycode.setAtdTime(atdTime);
        return this;
    }

    public ConcreterBuilder addtdDateTime(String atdDateTime){
        atdPersonPaycode.setAtdDateTime(atdDateTime);
        return this;
    }

    public ConcreterBuilder addStartDtm(Date startDtm){
        atdPersonPaycode.setStartDtm(startDtm);
        return this;
    }

    public ConcreterBuilder addEndDtm(Date endDtm){
        atdPersonPaycode.setEndDtm(endDtm);
        return this;
    }

    public ConcreterBuilder addPayhours(BigDecimal payhours){
        atdPersonPaycode.setPayhours(payhours);
        return this;
    }

    public ConcreterBuilder addAmount(BigDecimal amount){
        atdPersonPaycode.setAmount(amount);
        return this;
    }

    public ConcreterBuilder addOriginalPayhours(BigDecimal originalPayhours){
        atdPersonPaycode.setOriginalPayhours(originalPayhours);
        return this;
    }

    public ConcreterBuilder addUnProcessedPayhours(BigDecimal unProcessedPayhours){
        atdPersonPaycode.setUnProcessedPayhours(unProcessedPayhours);
        return this;
    }

    public ConcreterBuilder addType(Integer type){
        atdPersonPaycode.setType(type);
        return this;
    }

    public ConcreterBuilder addUnit(Integer unit){
        atdPersonPaycode.setUnit(unit);
        return this;
    }

    public ConcreterBuilder addBelongDate(Date belongDate){
        atdPersonPaycode.setBelongDate(belongDate);
        return this;
    }

    @Override
    public AtdPersonPaycode build() {

        return atdPersonPaycode;
    }
}
