package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner

/**
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 * @param repaymentFeeChargeDetail
 * @param repaymentFeeChargeCap
 */
data class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("RepaymentFeeChargeDetail", required = true) val repaymentFeeChargeDetail: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner>,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("RepaymentFeeChargeCap") val repaymentFeeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner>? = null,
)
