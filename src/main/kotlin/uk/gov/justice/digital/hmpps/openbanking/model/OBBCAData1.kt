package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.CreditInterest
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeesChargesInner
import uk.gov.justice.digital.hmpps.openbanking.model.Overdraft
import uk.gov.justice.digital.hmpps.openbanking.model.ProductDetails

/**
 *
 * @param productDetails
 * @param creditInterest
 * @param overdraft
 * @param otherFeesCharges Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */
data class OBBCAData1(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("ProductDetails") val productDetails: ProductDetails? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CreditInterest") val creditInterest: CreditInterest? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Overdraft") val overdraft: Overdraft? = null,

  @field:Valid
  @Schema(example = "null", description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
  @get:JsonProperty("OtherFeesCharges") val otherFeesCharges: kotlin.collections.List<OtherFeesChargesInner>? = null,
)
