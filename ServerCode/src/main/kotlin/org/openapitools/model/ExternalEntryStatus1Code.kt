package org.openapitools.model

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
* Status of a transaction entry on the books of the account servicer. <br /> For a full list of enumeration values refer to `ExternalEntryStatus1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: BOOK,FUTR,INFO,PDNG,RJCT
*/
enum class ExternalEntryStatus1Code(val value: kotlin.String) {

    @JsonProperty("BOOK") BOOK("BOOK"),
    @JsonProperty("FUTR") FUTR("FUTR"),
    @JsonProperty("INFO") INFO("INFO"),
    @JsonProperty("PDNG") PDNG("PDNG"),
    @JsonProperty("RJCT") RJCT("RJCT")
}

