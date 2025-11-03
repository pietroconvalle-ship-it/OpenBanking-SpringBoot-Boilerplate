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
* Specifies the type of creditor reference as published in an external creditor reference type code set.  External code sets can be downloaded from www.iso20022.org. *`DISP`-Document is a dispatch advice. *`FXDR`-Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers. *`PUOR`-Document is a purchase order. *`RPIN`-Document is a linked payment instruction to which the current payment instruction is related, for example, in a cover scenario. *`RADM`-Document is a remittance advice sent separately from the current transaction. *`SCOR`-Document is a structured communication reference provided by the creditor to identify the referred transaction.
* Values: DISP,FXDR,PUOR,RPIN,RADM,SCOR
*/
enum class OBExternalCreditorReferenceType1Code(val value: kotlin.String) {

    @JsonProperty("DISP") DISP("DISP"),
    @JsonProperty("FXDR") FXDR("FXDR"),
    @JsonProperty("PUOR") PUOR("PUOR"),
    @JsonProperty("RPIN") RPIN("RPIN"),
    @JsonProperty("RADM") RADM("RADM"),
    @JsonProperty("SCOR") SCOR("SCOR")
}

