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
* Specifies the document type as published in an external document type code list. For more information see `ExternalDocumentType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: CINV,CNFA,CONT,CREN,DEBN,DISP,DNFA,HIRI,INVS,MSIN,PROF,PUOR,QUOT,SBIN,SPRR,TISH
*/
enum class ExternalDocumentType1Code(val value: kotlin.String) {

    @JsonProperty("CINV") CINV("CINV"),
    @JsonProperty("CNFA") CNFA("CNFA"),
    @JsonProperty("CONT") CONT("CONT"),
    @JsonProperty("CREN") CREN("CREN"),
    @JsonProperty("DEBN") DEBN("DEBN"),
    @JsonProperty("DISP") DISP("DISP"),
    @JsonProperty("DNFA") DNFA("DNFA"),
    @JsonProperty("HIRI") HIRI("HIRI"),
    @JsonProperty("INVS") INVS("INVS"),
    @JsonProperty("MSIN") MSIN("MSIN"),
    @JsonProperty("PROF") PROF("PROF"),
    @JsonProperty("PUOR") PUOR("PUOR"),
    @JsonProperty("QUOT") QUOT("QUOT"),
    @JsonProperty("SBIN") SBIN("SBIN"),
    @JsonProperty("SPRR") SPRR("SPRR"),
    @JsonProperty("TISH") TISH("TISH")
}

