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
* Specifies the Beneficiary Type.
* Values: Trusted,Ordinary
*/
enum class OBInternalBeneficiaryType1Code(val value: kotlin.String) {

    @JsonProperty("Trusted") Trusted("Trusted"),
    @JsonProperty("Ordinary") Ordinary("Ordinary")
}

