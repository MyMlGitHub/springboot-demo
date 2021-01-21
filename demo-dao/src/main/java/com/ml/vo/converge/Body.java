package com.ml.vo.converge;

import com.ml.po.*;
import lombok.Data;

import java.util.List;

@Data
public class Body {
    private JyLawInfo jyLawInfo;

    private JyAdjustInfo jyAdjustInfo;

    private List<JyLawApplyerInfo> applyerList;

    private List<JyAdjustEvidenceInfo> evidenceList;

    private List<JyDocumentInfo> documentList;

    private List<JyWorkFlow> workFlowList;
}
