package com.warm.flow.core.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author warm
 * @description: 工作流内置参数
 * @date: 2023/3/31 17:18
 */
public class FlowParams implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流程编码
     */
    private String flowCode;

    /**
     * 办理人
     */
    private String handler;

    /**
     * 办理人
     */
    @Deprecated
    private String createBy;

    /**
     * 节点编码（如果要指定跳转节点，传入）
     */
    private String nodeCode;

    /**
     * 用户权限标识
     */
    private List<String> permissionFlag;
    /**
     * 额外办理人：加减签，转办，委托，抄送人
     */
    private List<String> additionalHandler;
    /**
     * 跳转类型（PASS审批通过 REJECT退回）
     */
    private String skipType;

    /**
     * 审批意见
     */
    private String message;

    /**
     * 流程变量
     */
    private Map<String, Object> variable;

    /**
     * 流程状态
     */
    private Integer flowStatus;

    /**
     * 历史任务动作类型(0审批 1转办 2会签 3票签 4委派 5加签 6减签)
     */
    private Integer actionType;

    /**
     * 扩展字段
     */
    private String ext;

    public static FlowParams build() {
        return new FlowParams();
    }

    public FlowParams flowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }

    public FlowParams handler(String handler) {
        this.handler = handler;
        return this;
    }

    public FlowParams nodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
        return this;
    }

    public FlowParams variable(Map<String, Object> variable) {
        this.variable = variable;
        return this;
    }

    public FlowParams skipType(String skipType) {
        this.skipType = skipType;
        return this;
    }

    public FlowParams message(String message) {
        this.message = message;
        return this;
    }

    public FlowParams ext(String ext) {
        this.ext = ext;
        return this;
    }

    public Map<String, Object> getVariable() {
        return variable;
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public FlowParams permissionFlag(List<String> permissionFlag) {
        this.permissionFlag = permissionFlag;
        return this;
    }

    public List<String> getAdditionalHandler() {
        return additionalHandler;
    }

    public FlowParams additionalHandler(List<String> permissionList) {
        this.additionalHandler = permissionList;
        return this;
    }

    public String getFlowCode() {
        return flowCode;
    }

    public String getHandler() {
        return handler;
    }

    public List<String> getPermissionFlag() {
        return permissionFlag;
    }

    public String getSkipType() {
        return skipType;
    }

    public String getMessage() {
        return message;
    }

    public String getExt() {
        return ext;
    }

    public Integer getFlowStatus() {
        return flowStatus;
    }

    public FlowParams setFlowStatus(Integer flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }

    public Integer getActionType() {
        return actionType;
    }

    public FlowParams setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    public String getCreateBy() {
        return handler;
    }

    public FlowParams setCreateBy(String createBy) {
        this.handler = createBy;
        return this;
    }
}
