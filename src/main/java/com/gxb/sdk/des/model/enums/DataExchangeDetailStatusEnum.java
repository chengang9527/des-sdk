package com.gxb.sdk.des.model.enums;

/**
 * 数据交易明细状态
 * @author liruobin
 * @since 2018/3/27 下午1:39
 */
public enum DataExchangeDetailStatusEnum {
    SUCCESS, //成功
    WAIT_EXCHANGE, //等待交易
    FAIL, //失败，校验不通过或者执行过程发生异常
    NONE, // 数据源反馈为空
    DATASOURCE_FAIL,//请求数据源失败
    QUERY_FAIL,//数据源查询数据失败
    TIMEOUT ,//请求超时
    PROXY_TRANSFER_ERROR,//代理转账失败
    ;
}
