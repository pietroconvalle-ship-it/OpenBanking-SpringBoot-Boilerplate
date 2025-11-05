package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftTierBandSetInner
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
 * Borrowing details
 * @param overdraftTierBandSet Tier band set details
 * @param notes Associated Notes about the overdraft rates
 */
data class Overdraft(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Tier band set details")
    @get:JsonProperty("OverdraftTierBandSet", required = true) val overdraftTierBandSet: kotlin.collections.List<OverdraftTierBandSetInner>,

    @Schema(example = "null", description = "Associated Notes about the overdraft rates")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null
) {

}

