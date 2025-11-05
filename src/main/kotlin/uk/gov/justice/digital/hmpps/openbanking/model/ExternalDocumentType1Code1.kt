package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
enum class ExternalDocumentType1Code1(@get:JsonValue val value: kotlin.String) {

    CINV("CINV"),
    CNFA("CNFA"),
    CONT("CONT"),
    CREN("CREN"),
    DEBN("DEBN"),
    DISP("DISP"),
    DNFA("DNFA"),
    HIRI("HIRI"),
    INVS("INVS"),
    MSIN("MSIN"),
    PROF("PROF"),
    PUOR("PUOR"),
    QUOT("QUOT"),
    SBIN("SBIN"),
    SPRR("SPRR"),
    TISH("TISH"),
    USAR("USAR"),
    AROI("AROI"),
    BOLD("BOLD"),
    CMCN("CMCN"),
    SOAC("SOAC"),
    TSUT("TSUT"),
    VCHR("VCHR");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ExternalDocumentType1Code1 {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalDocumentType1Code1'")
        }
    }
}

