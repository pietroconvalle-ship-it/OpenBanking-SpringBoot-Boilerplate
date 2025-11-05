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
* Statement type, in a coded form. For a full list of values see `OBInternalStatementType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: AccountClosure,AccountOpening,Annual,Interim,RegularPeriodic
*/
enum class OBInternalStatementType1Code(val value: kotlin.String) {

    @JsonProperty("AccountClosure") AccountClosure("AccountClosure"),
    @JsonProperty("AccountOpening") AccountOpening("AccountOpening"),
    @JsonProperty("Annual") Annual("Annual"),
    @JsonProperty("Interim") Interim("Interim"),
    @JsonProperty("RegularPeriodic") RegularPeriodic("RegularPeriodic")
}

