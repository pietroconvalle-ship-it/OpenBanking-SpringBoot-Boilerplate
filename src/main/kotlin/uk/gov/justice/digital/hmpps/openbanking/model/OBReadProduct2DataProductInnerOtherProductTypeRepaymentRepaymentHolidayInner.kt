package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Details of capital repayment holiday if any
 * @param maxHolidayLength The maximum length/duration of a Repayment Holiday
 * @param maxHolidayPeriod The unit of period (days, weeks, months etc.) of the repayment holiday
 * @param notes 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner(

    @Schema(example = "null", description = "The maximum length/duration of a Repayment Holiday")
    @get:JsonProperty("MaxHolidayLength") val maxHolidayLength: kotlin.Int? = null,

    @Schema(example = "null", description = "The unit of period (days, weeks, months etc.) of the repayment holiday")
    @get:JsonProperty("MaxHolidayPeriod") val maxHolidayPeriod: OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.MaxHolidayPeriod? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null
) {

    /**
    * The unit of period (days, weeks, months etc.) of the repayment holiday
    * Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
    */
    enum class MaxHolidayPeriod(val value: kotlin.String) {

        @JsonProperty("PACT") PACT("PACT"),
        @JsonProperty("PDAY") PDAY("PDAY"),
        @JsonProperty("PHYR") PHYR("PHYR"),
        @JsonProperty("PMTH") PMTH("PMTH"),
        @JsonProperty("PQTR") PQTR("PQTR"),
        @JsonProperty("PWEK") PWEK("PWEK"),
        @JsonProperty("PYER") PYER("PYER")
    }

}

