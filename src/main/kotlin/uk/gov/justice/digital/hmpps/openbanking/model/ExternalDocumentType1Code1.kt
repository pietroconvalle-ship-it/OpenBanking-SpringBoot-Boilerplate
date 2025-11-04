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
* Specifies the document type as published in an external document type code list. For a full list of values refer to `ExternalDocumentType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: CINV,CNFA,CONT,CREN,DEBN,DISP,DNFA,HIRI,INVS,MSIN,PROF,PUOR,QUOT,SBIN,SPRR,TISH,USAR,AROI,BOLD,CMCN,SOAC,TSUT,VCHR
*/
enum class ExternalDocumentType1Code1(val value: kotlin.String) {

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
    @JsonProperty("TISH") TISH("TISH"),
    @JsonProperty("USAR") USAR("USAR"),
    @JsonProperty("AROI") AROI("AROI"),
    @JsonProperty("BOLD") BOLD("BOLD"),
    @JsonProperty("CMCN") CMCN("CMCN"),
    @JsonProperty("SOAC") SOAC("SOAC"),
    @JsonProperty("TSUT") TSUT("TSUT"),
    @JsonProperty("VCHR") VCHR("VCHR")
}

