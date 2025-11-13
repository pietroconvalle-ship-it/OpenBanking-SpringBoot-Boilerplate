package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.CreditInterest1
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeesCharges
import uk.gov.justice.digital.hmpps.openbanking.model.Overdraft1
import uk.gov.justice.digital.hmpps.openbanking.model.ProductDetails1

/**
 *
 * @param productDetails
 * @param creditInterest
 * @param overdraft
 * @param otherFeesCharges
 */
data class OBPCAData1(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("ProductDetails") val productDetails: ProductDetails1? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CreditInterest") val creditInterest: CreditInterest1? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Overdraft") val overdraft: Overdraft1? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherFeesCharges") val otherFeesCharges: OtherFeesCharges? = null,
)
