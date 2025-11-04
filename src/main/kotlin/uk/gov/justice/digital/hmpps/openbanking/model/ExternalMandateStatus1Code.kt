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
* Specifies the status of the standing order in code form. For a full list of enumeration values refer to 'ExternalMandateStatus1Code' in *ISO_External_Codeset* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: ACTV,CANC,EXPI,SUSP
*/
enum class ExternalMandateStatus1Code(val value: kotlin.String) {

    @JsonProperty("ACTV") ACTV("ACTV"),
    @JsonProperty("CANC") CANC("CANC"),
    @JsonProperty("EXPI") EXPI("EXPI"),
    @JsonProperty("SUSP") SUSP("SUSP")
}

