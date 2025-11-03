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
* Balance type, in a coded form. <br /> For a full list of enumeration values refer to `ExternalBalanceType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).
* Values: CLAV,CLBD,FWAV,INFO,ITAV,ITBD,OPAV,OPBD,PRCD,XPCD
*/
enum class OBBalanceType1Code(val value: kotlin.String) {

    @JsonProperty("CLAV") CLAV("CLAV"),
    @JsonProperty("CLBD") CLBD("CLBD"),
    @JsonProperty("FWAV") FWAV("FWAV"),
    @JsonProperty("INFO") INFO("INFO"),
    @JsonProperty("ITAV") ITAV("ITAV"),
    @JsonProperty("ITBD") ITBD("ITBD"),
    @JsonProperty("OPAV") OPAV("OPAV"),
    @JsonProperty("OPBD") OPBD("OPBD"),
    @JsonProperty("PRCD") PRCD("PRCD"),
    @JsonProperty("XPCD") XPCD("XPCD")
}

