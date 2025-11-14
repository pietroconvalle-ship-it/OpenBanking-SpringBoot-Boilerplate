package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code0
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestRateType1Code0
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType11
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType12
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType13
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType14
import uk.gov.justice.digital.hmpps.openbanking.model.OBOverdraftFeeType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner

/**
 * Details about the fees/charges
 * @param feeType
 * @param applicationFrequency
 * @param negotiableIndicator Indicates whether fee and charges are negotiable
 * @param overdraftControlIndicator Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
 * @param incrementalBorrowingAmount Every additional tranche of an overdraft balance to which an overdraft fee is applied
 * @param feeAmount Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param feeRate Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
 * @param feeRateType
 * @param calculationFrequency
 * @param notes
 * @param overdraftFeeChargeCap
 * @param otherFeeType
 * @param otherFeeRateType
 * @param otherApplicationFrequency
 * @param otherCalculationFrequency
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("FeeType", required = true) val feeType: OBOverdraftFeeType1Code,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: OBFeeFrequency1Code0,

  @Schema(example = "null", description = "Indicates whether fee and charges are negotiable")
  @get:JsonProperty("NegotiableIndicator") val negotiableIndicator: kotlin.Boolean? = null,

  @Schema(example = "null", description = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")
  @get:JsonProperty("OverdraftControlIndicator") val overdraftControlIndicator: kotlin.Boolean? = null,

  @get:Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
  @Schema(example = "null", description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
  @get:JsonProperty("IncrementalBorrowingAmount") val incrementalBorrowingAmount: kotlin.String? = null,

  @get:Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
  @Schema(example = "null", description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
  @get:JsonProperty("FeeAmount") val feeAmount: kotlin.String? = null,

  @get:Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
  @Schema(example = "null", description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
  @get:JsonProperty("FeeRate") val feeRate: kotlin.String? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("FeeRateType") val feeRateType: OBInterestRateType1Code0? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CalculationFrequency") val calculationFrequency: OBFeeFrequency1Code1? = null,

  @Schema(example = "null", description = "")
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OverdraftFeeChargeCap") val overdraftFeeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherFeeType") val otherFeeType: OBOtherCodeType13? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherFeeRateType") val otherFeeRateType: OBOtherCodeType14? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherApplicationFrequency") val otherApplicationFrequency: OBOtherCodeType11? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OBOtherCodeType12? = null,
)
