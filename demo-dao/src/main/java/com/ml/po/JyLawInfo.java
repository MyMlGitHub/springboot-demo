package com.ml.po;

import lombok.Data;

import java.util.Date;

@Data
public class JyLawInfo {
    private Integer id;

    private String serialNo;

    private String lawNo;

    private String state;

    private String isReturn;

    private Integer delFlag;

    private String reason;

    private Double lawMoney;

    private Integer lawOrgId;

    private String lawOrgName;

    private Integer adjustOrgCode;

    private String adjustOrgName;

    private String adjustPointCode;

    private String adjustPointName;

    private String applicant;

    private String respondent;

    private String factReason;

    private Date payDate;

    private Date adjustDate;

    private String adjustResult;

    private String adjustResultRemark;

    private Integer createBy;

    private String adjustName;

    private Date createDate;

    private Date filingDate;

    private String filingName;

    private String isDeferredCharges;

    private Double acceptanceFee;

    private String jurisdictionReason;

    private String applicationProcedure;

    private Date courtDate;

    private String isSmallAmount;

    private Integer courtId;

    private String courtNum;

    private Integer chiefJudgeId;

    private Integer clerkId;

    private Integer memberOneId;

    private Integer memberTwoId;

    private Integer undertakerId;

    private String undertakerPhone;

    private String applyAgree;

    private String respondentAgree;

    private Date closeCaseDate;

    private String closeCaseType;

    private String closeCaseSuggest;

    private String judgeCertification;

    private String determineReason;

    private String determineContent;

    private Date nextCourtDate;

    private Date receiveDate;

    private String regionName;

    private String standardYear;

    private String household;

    private Date deathDate;

    private Double compensateRate;

    private String compensateStandard;

    private Double applyTotal;

    private Double paidTotal;

    private String feeDetail;

    private String compensateTable;

    private String applyArreeName;

    private String respondentAgreeName;

    private Boolean applyJudge;

    private String payState;

    private Double replyTotal;

    private String claimState;

    private String codeFileName;

    private String claimMessage;

    private String payeeName;

    private String payeeAccount;

    private String openingBank;

    private String judgeCaseId;

    private String courtCode;

    private String disabilityGradeId;

    private String chiefName;

    private String clerkName;

    private String courtName;

    private Date convergeUpdateDate;

    private Date convergeDate;

    private String step;

    private String zzrSjy;

    private String zzrCbr;

    private String lawPersonType;

    private String isAdjust;

    private Integer adjustPersonId;

    private String isSendAppraisal;

    private String isAppraisalFinish;

    private String oldIsSendAppraisal;

    private String oldIsAppraisalFinish;

    private Date caseEndDate;

    private String litigationFlag;

    private String platForm;

    private String ahdm;

    private String regionCode;

    private String dzah;

    private Integer idBak;

    private String ajbs;

    private String accidentType;

    private String responsibility;

    private String sufferNature;

    private Date accidentDate;

    private String injureFeeDetail;

    private String regulationNo;

    private String litigationRequest;

    private String platformOrigin;

    private Double targetMoney;
}