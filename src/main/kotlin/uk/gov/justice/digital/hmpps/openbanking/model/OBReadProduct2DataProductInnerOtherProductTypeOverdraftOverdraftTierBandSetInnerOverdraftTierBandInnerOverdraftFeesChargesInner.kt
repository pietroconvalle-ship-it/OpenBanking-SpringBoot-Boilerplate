package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner

/**
 * Overdraft fees and charges
 * @param overdraftFeeChargeDetail
 * @param overdraftFeeChargeCap
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("OverdraftFeeChargeDetail", required = true) val overdraftFeeChargeDetail: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner>,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OverdraftFeeChargeCap") val overdraftFeeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner>? = null,
)
