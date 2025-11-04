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
* Specifies the status of account resource in code form. <br /> For a full list of enumeration values refer to `OBInternalAccountStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Deleted,Disabled,Enabled,Pending,ProForma
*/
enum class OBInternalAccountStatus1Code(val value: kotlin.String) {

    @JsonProperty("Deleted") Deleted("Deleted"),
    @JsonProperty("Disabled") Disabled("Disabled"),
    @JsonProperty("Enabled") Enabled("Enabled"),
    @JsonProperty("Pending") Pending("Pending"),
    @JsonProperty("ProForma") ProForma("ProForma")
}

