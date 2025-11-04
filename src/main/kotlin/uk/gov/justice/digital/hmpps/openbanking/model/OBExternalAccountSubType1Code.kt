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
* Specifies the sub type of account (product family group) <br /> For a full list of enumeration values refer to `OBExternalCashAccountType1Code` *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: CACC,CARD,CASH,CHAR,CISH,COMM,CPAC,LLSV,LOAN,MGLD,MOMA,NREX,ODFT,ONDP,OTHR,SACC,SLRY,SVGS,TAXE,TRAN,TRAS,VACC,NFCA,MORT,WALT
*/
enum class OBExternalAccountSubType1Code(val value: kotlin.String) {

    @JsonProperty("CACC") CACC("CACC"),
    @JsonProperty("CARD") CARD("CARD"),
    @JsonProperty("CASH") CASH("CASH"),
    @JsonProperty("CHAR") CHAR("CHAR"),
    @JsonProperty("CISH") CISH("CISH"),
    @JsonProperty("COMM") COMM("COMM"),
    @JsonProperty("CPAC") CPAC("CPAC"),
    @JsonProperty("LLSV") LLSV("LLSV"),
    @JsonProperty("LOAN") LOAN("LOAN"),
    @JsonProperty("MGLD") MGLD("MGLD"),
    @JsonProperty("MOMA") MOMA("MOMA"),
    @JsonProperty("NREX") NREX("NREX"),
    @JsonProperty("ODFT") ODFT("ODFT"),
    @JsonProperty("ONDP") ONDP("ONDP"),
    @JsonProperty("OTHR") OTHR("OTHR"),
    @JsonProperty("SACC") SACC("SACC"),
    @JsonProperty("SLRY") SLRY("SLRY"),
    @JsonProperty("SVGS") SVGS("SVGS"),
    @JsonProperty("TAXE") TAXE("TAXE"),
    @JsonProperty("TRAN") TRAN("TRAN"),
    @JsonProperty("TRAS") TRAS("TRAS"),
    @JsonProperty("VACC") VACC("VACC"),
    @JsonProperty("NFCA") NFCA("NFCA"),
    @JsonProperty("MORT") MORT("MORT"),
    @JsonProperty("WALT") WALT("WALT")
}

