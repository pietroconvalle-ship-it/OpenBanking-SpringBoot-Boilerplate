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
* For a full list of enumeration values refer to `ExternalDocumentFormat1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
* Values: DPDF,DXML,SDSH,WORD,XSLT
*/
enum class OBFileFormat(val value: kotlin.String) {

    @JsonProperty("DPDF") DPDF("DPDF"),
    @JsonProperty("DXML") DXML("DXML"),
    @JsonProperty("SDSH") SDSH("SDSH"),
    @JsonProperty("WORD") WORD("WORD"),
    @JsonProperty("XSLT") XSLT("XSLT")
}

