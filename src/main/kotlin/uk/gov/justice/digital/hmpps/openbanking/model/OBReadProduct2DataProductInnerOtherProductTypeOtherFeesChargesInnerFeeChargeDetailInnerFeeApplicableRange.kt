package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Range or amounts or rates for which the fee/charge applies
 * @param minimumAmount Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
 * @param maximumAmount Maximum Amount on which fee is applicable (where it is expressed as an amount)
 * @param minimumRate Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
 * @param maximumRate Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange(

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")
    @get:JsonProperty("MinimumAmount") val minimumAmount: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")
    @get:JsonProperty("MaximumAmount") val maximumAmount: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")
    @get:JsonProperty("MinimumRate") val minimumRate: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")
    @get:JsonProperty("MaximumRate") val maximumRate: kotlin.String? = null
) {

}

