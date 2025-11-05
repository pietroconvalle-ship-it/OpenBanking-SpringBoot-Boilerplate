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
* Specifies the sub type of account (product family group) <br /> For a full list of enumeration values refer to `OBExternalCashAccountType1Code` *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: CACC,CARD,CASH,CHAR,CISH,COMM,CPAC,LLSV,LOAN,MGLD,MOMA,NREX,ODFT,ONDP,OTHR,SACC,SLRY,SVGS,TAXE,TRAN,TRAS,VACC,NFCA,MORT,WALT
*/
enum class OBExternalAccountSubType1Code(@get:JsonValue val value: kotlin.String) {

    CACC("CACC"),
    CARD("CARD"),
    CASH("CASH"),
    CHAR("CHAR"),
    CISH("CISH"),
    COMM("COMM"),
    CPAC("CPAC"),
    LLSV("LLSV"),
    LOAN("LOAN"),
    MGLD("MGLD"),
    MOMA("MOMA"),
    NREX("NREX"),
    ODFT("ODFT"),
    ONDP("ONDP"),
    OTHR("OTHR"),
    SACC("SACC"),
    SLRY("SLRY"),
    SVGS("SVGS"),
    TAXE("TAXE"),
    TRAN("TRAN"),
    TRAS("TRAS"),
    VACC("VACC"),
    NFCA("NFCA"),
    MORT("MORT"),
    WALT("WALT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBExternalAccountSubType1Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalAccountSubType1Code'")
        }
    }
}

