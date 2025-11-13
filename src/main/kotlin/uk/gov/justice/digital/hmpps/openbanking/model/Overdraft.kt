package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftTierBandSetInner

/**
 * Borrowing details
 * @param overdraftTierBandSet Tier band set details
 * @param notes Associated Notes about the overdraft rates
 */
data class Overdraft(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "Tier band set details")
  @get:JsonProperty("OverdraftTierBandSet", required = true) val overdraftTierBandSet: kotlin.collections.List<OverdraftTierBandSetInner>,

  @Schema(example = "null", description = "Associated Notes about the overdraft rates")
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,
)
