package com.jason.common.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author Jason.Chen
 * @create 2024/5/16 11:17
 */
@Getter
@Setter
public class CalculateCard {

    private String tenantCode;

    private String personId;

    private Date calculateDate;

    private String opId;

    /**
     * 是否排班需要重算前一天，后一天
     */
    private boolean reCalculate = false;

    /**
     * 是否调试重算
     */
    private Boolean debug = false;

    /**
     * 上一次是否的摆卡结果
     */
    private boolean isOldTimesheet;

    /**
     * 补录的加班单的生效日期
     */
    private Date effectDate;

    /**
     * 排班重算
     */
    private Boolean reCalculateSch;
}
