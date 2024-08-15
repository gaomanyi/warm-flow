ALTER TABLE "FLOW_DEFINITION"
ADD ("EXT" VARCHAR2(500) );

ALTER TABLE "FLOW_DEFINITION" RENAME COLUMN "FROM_CUSTOM" TO "FORM_CUSTOM";

ALTER TABLE "FLOW_DEFINITION" RENAME COLUMN "FROM_PATH" TO "FORM_PATH";

ALTER TABLE "FLOW_DEFINITION" MODIFY ("DEL_FLAG" DEFAULT '0' );

COMMENT ON COLUMN "FLOW_DEFINITION"."EXT" IS '业务详情 存业务表对象json字符串';

ALTER TABLE "FLOW_HIS_TASK"
ADD ("SKIP_TYPE" VARCHAR2(10) )
ADD ("FORM_CUSTOM" VARCHAR(1) DEFAULT 'N' )
ADD ("FORM_PATH" VARCHAR2(100) ));

COMMENT ON COLUMN "FLOW_HIS_TASK"."SKIP_TYPE" IS '流转类型（PASS通过 REJECT退回 NONE无动作）';

COMMENT ON COLUMN "FLOW_HIS_TASK"."FORM_CUSTOM" IS '审批表单是否自定义（Y是 N否）';

COMMENT ON COLUMN "FLOW_HIS_TASK"."FORM_PATH" IS '审批表单路径';

COMMENT ON COLUMN "FLOW_HIS_TASK"."EXT" IS '业务详情 存业务表对象json字符串';

ALTER TABLE "FLOW_HIS_TASK" MODIFY ("DEL_FLAG" DEFAULT '0' );

update 	FLOW_HIS_TASK set SKIP_TYPE = 'PASS' where FLOW_STATUS=2;

ALTER TABLE "FLOW_INSTANCE" MODIFY ("DEL_FLAG" DEFAULT '0' );

ALTER TABLE "FLOW_NODE"
MODIFY ("DEL_FLAG" DEFAULT '0' )
ADD ("FORM_CUSTOM" VARCHAR(1) DEFAULT 'N' )
ADD ("FORM_PATH" VARCHAR2(100) );

COMMENT ON COLUMN "FLOW_NODE"."FORM_CUSTOM" IS '审批表单是否自定义（Y是 N否）';

COMMENT ON COLUMN "FLOW_NODE"."FORM_PATH" IS '审批表单路径';

ALTER TABLE "FLOW_SKIP"
MODIFY ("DEL_FLAG" DEFAULT '0' );

ALTER TABLE "FLOW_TASK"
ADD ("FORM_CUSTOM" VARCHAR(1) DEFAULT 'N' )
ADD ("FORM_PATH" VARCHAR2(100) );

COMMENT ON COLUMN "FLOW_TASK"."FORM_CUSTOM" IS '审批表单是否自定义（Y是 N否）';

COMMENT ON COLUMN "FLOW_TASK"."FORM_PATH" IS '审批表单路径';
ALTER TABLE "FLOW_TASK" MODIFY ("DEL_FLAG" DEFAULT '0' );

ALTER TABLE "FLOW_USER"
MODIFY ("DEL_FLAG" DEFAULT '0' );

ALTER TABLE "FLOW_DEFINITION"
    ADD ("ACTIVITY_STATUS" NUMBER(1) default 1);
COMMENT on column FLOW_DEFINITION.ACTIVITY_STATUS is '流程激活状态（0挂起 1激活）';

ALTER TABLE "FLOW_INSTANCE"
    ADD ("ACTIVITY_STATUS" NUMBER(1) default 1);
COMMENT on column FLOW_INSTANCE.ACTIVITY_STATUS is '流程激活状态（0挂起 1激活）';

ALTER TABLE "FLOW_DEFINITION"
    ADD ("LISTENER_TYPE" VARCHAR2(100) )
    ADD ("LISTENER_PATH" VARCHAR2(100) );
comment on column FLOW_DEFINITION.LISTENER_TYPE is '监听器类型';
comment on column FLOW_DEFINITION.LISTENER_PATH is '监听器路径';