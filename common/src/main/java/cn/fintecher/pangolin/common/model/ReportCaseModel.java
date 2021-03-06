package cn.fintecher.pangolin.common.model;

import cn.fintecher.pangolin.common.annotation.ExcelAnno;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author:huyanmin
 * @Desc: 报案申请导出model
 * @Date:Create in 2018/8/31
 */
@Data
public class ReportCaseModel{

    @ApiModelProperty(notes = "唯一标识")
    @ExcelAnno(cellName = "唯一标识", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String id;

    @ApiModelProperty(notes = "客户姓名")
    @ExcelAnno(cellName = "客户姓名", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String personalName;

    @ApiModelProperty(notes = "证件号码")
    @ExcelAnno(cellName = "证件号码", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String certificateNo;

    @ApiModelProperty("委案金额")
    @ExcelAnno(cellName = "委案金额", fieldDataType = ExcelAnno.FieldDataType.DOUBLE)
    private Double overdueAmtTotal;

    @ApiModelProperty("欠款")
    @ExcelAnno(cellName = "欠款", fieldDataType = ExcelAnno.FieldDataType.DOUBLE)
    private Double leftAmt;

    @ApiModelProperty(notes = "卡号")
    @ExcelAnno(cellName = "卡号", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String cardNo;

    @ApiModelProperty(notes = "账户号")
    @ExcelAnno(cellName = "账户号", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String account;

    @ApiModelProperty(notes = "案件编号")
    @ExcelAnno(cellName = "案件编号", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String caseNumber;

    @ApiModelProperty(notes = "报案原因")
    @ExcelAnno(cellName = "报案原因", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String applyRemark;

    @ApiModelProperty(notes = "审批说明")
    @ExcelAnno(cellName = "拒绝说明", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String reportRemark;

    @ApiModelProperty(notes = "审批状态")
    @ExcelAnno(cellName = "是否同意(是/否)", fieldDataType = ExcelAnno.FieldDataType.STRING)
    private String approvedStatus;

}
