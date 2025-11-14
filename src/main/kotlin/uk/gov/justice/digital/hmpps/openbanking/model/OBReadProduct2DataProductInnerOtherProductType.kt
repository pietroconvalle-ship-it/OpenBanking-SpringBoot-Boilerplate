package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterest
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterest
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraft
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeProductDetails
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeRepayment

/**
 * This field provides extension to the ProductType enumeration. If ProductType - \"Other\" is chosen, this field must be populated with name, and description for ASPSP specific product type.
 * @param name Name of \"Other\" product type.
 * @param description Description of \"Other\" product type
 * @param productDetails
 * @param creditInterest
 * @param overdraft
 * @param loanInterest
 * @param repayment
 * @param otherFeesCharges
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBReadProduct2DataProductInnerOtherProductType(

  @get:Size(min = 1, max = 350)
  @Schema(example = "e-Wallet", required = true, description = "Name of \"Other\" product type.")
  @get:JsonProperty("Name", required = true) val name: kotlin.String,

  @get:Size(min = 1, max = 350)
  @Schema(example = "Virtual wallet", required = true, description = "Description of \"Other\" product type")
  @get:JsonProperty("Description", required = true) val description: kotlin.String,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("ProductDetails") val productDetails: OBReadProduct2DataProductInnerOtherProductTypeProductDetails? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CreditInterest") val creditInterest: OBReadProduct2DataProductInnerOtherProductTypeCreditInterest? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Overdraft") val overdraft: OBReadProduct2DataProductInnerOtherProductTypeOverdraft? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("LoanInterest") val loanInterest: OBReadProduct2DataProductInnerOtherProductTypeLoanInterest? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Repayment") val repayment: OBReadProduct2DataProductInnerOtherProductTypeRepayment? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherFeesCharges") val otherFeesCharges: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner>? = null,

  @field:Valid
  @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
)
