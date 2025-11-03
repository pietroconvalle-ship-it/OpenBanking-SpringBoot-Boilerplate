package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 * @param repaymentFeeChargeDetail 
 * @param repaymentFeeChargeCap 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("RepaymentFeeChargeDetail", required = true) val repaymentFeeChargeDetail: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RepaymentFeeChargeCap") val repaymentFeeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner>? = null
) {

}

