package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Individual Definitions:  ADHO - Adhoc   YEAR - Annual DAIL - Daily INDA - Intra Day MNTH - Monthly QURT - Quarterly WEEK - Weekly 
* Values: ADHO,YEAR,DAIL,INDA,MNTH,QURT,MIAN,WEEK
*/
enum class OBFrequencyPeriodType(val value: kotlin.String) {

    @JsonProperty("ADHO") ADHO("ADHO"),
    @JsonProperty("YEAR") YEAR("YEAR"),
    @JsonProperty("DAIL") DAIL("DAIL"),
    @JsonProperty("INDA") INDA("INDA"),
    @JsonProperty("MNTH") MNTH("MNTH"),
    @JsonProperty("QURT") QURT("QURT"),
    @JsonProperty("MIAN") MIAN("MIAN"),
    @JsonProperty("WEEK") WEEK("WEEK")
}

