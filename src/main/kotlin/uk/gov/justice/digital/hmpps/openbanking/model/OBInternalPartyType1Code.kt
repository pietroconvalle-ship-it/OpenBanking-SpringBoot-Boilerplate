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
* Party type, in a coded form. For a full list see `OBInternalPartyType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Delegate,Joint,Sole
*/
enum class OBInternalPartyType1Code(val value: kotlin.String) {

    @JsonProperty("Delegate") Delegate("Delegate"),
    @JsonProperty("Joint") Joint("Joint"),
    @JsonProperty("Sole") Sole("Sole")
}

