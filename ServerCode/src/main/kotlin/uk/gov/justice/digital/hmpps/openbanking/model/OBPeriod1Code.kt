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
* Period e.g. day, week, month etc. for which the fee/charge is capped
* Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
*/
enum class OBPeriod1Code(val value: kotlin.String) {

    @JsonProperty("PACT") PACT("PACT"),
    @JsonProperty("PDAY") PDAY("PDAY"),
    @JsonProperty("PHYR") PHYR("PHYR"),
    @JsonProperty("PMTH") PMTH("PMTH"),
    @JsonProperty("PQTR") PQTR("PQTR"),
    @JsonProperty("PWEK") PWEK("PWEK"),
    @JsonProperty("PYER") PYER("PYER")
}

