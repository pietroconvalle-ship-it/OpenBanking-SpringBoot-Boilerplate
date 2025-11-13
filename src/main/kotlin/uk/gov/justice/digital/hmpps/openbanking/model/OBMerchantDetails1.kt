package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 * Details of the merchant involved in the transaction.
 * @param merchantName Name by which the merchant is known.
 * @param merchantCategoryCode Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
 */
data class OBMerchantDetails1(

  @get:Size(min = 1, max = 350)
  @Schema(example = "null", description = "Name by which the merchant is known.")
  @get:JsonProperty("MerchantName") val merchantName: kotlin.String? = null,

  @get:Size(min = 3, max = 4)
  @Schema(example = "null", description = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
  @get:JsonProperty("MerchantCategoryCode") val merchantCategoryCode: kotlin.String? = null,
)
