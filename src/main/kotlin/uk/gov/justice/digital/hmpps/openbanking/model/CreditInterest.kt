package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.TierBandSetInner
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
 * Details about the interest that may be payable to the BCA account holders
 * @param tierBandSet The group of tiers or bands for which credit interest can be applied.
 */
data class CreditInterest(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "The group of tiers or bands for which credit interest can be applied.")
    @get:JsonProperty("TierBandSet", required = true) val tierBandSet: kotlin.collections.List<TierBandSetInner>
) {

}

