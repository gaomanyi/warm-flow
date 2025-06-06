package org.dromara.warm.flow.orm.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import org.dromara.warm.flow.core.entity.Form;

import java.util.Date;

/**
 * @author vanlin
 * @className FlowForm
 * @description
 * @since 2024-9-23 16:15
 */
@Data
@Accessors(chain = true)
@TableName("flow_form")
public class FlowForm implements Form {

    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标记
     */
    @TableLogic
    private String delFlag;

    /**
     * 表单编码
     */
    private String formCode;

    /**
     * 表单名称
     */
    private String formName;

    /**
     * 表单版本
     */
    private String version;

    /**
     * 是否发布（0未发布 1已发布 9失效）
     */
    private Integer isPublish;

    /**
     * 表单类型（0内置表单 存 form_content        1外挂表单 存form_path）
     */
    private Integer formType;

    /**
     * 表单路径
     */
    private String formPath;

    /**
     * 表单内容
     */
    private String formContent;

    /**
     * 表单扩展，用户自行使用
     */
    private String ext;

    /**
     * 租户ID
     */
    private String tenantId;


}
