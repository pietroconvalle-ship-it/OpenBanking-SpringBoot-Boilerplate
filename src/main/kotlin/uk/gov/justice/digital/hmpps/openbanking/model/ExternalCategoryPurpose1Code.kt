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
* Enumeration of codes that outlines the type of purpose behind a transaction, payment or risk.  For all enum values see `ExternalCategoryPurpose1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: BONU,CASH,CBLK,CCRD,CGWV,CIPC,CONC,CORT,DCRD,DIVI,DVPM,EPAY,FCDT,FCIN,FCOL,GOVT,GP2P,HEDG,ICCP,IDCP,INTC,INTE,LBOX,LOAN,MP2B,MP2P,OTHR,PENS,RPRE,RRCT,RVPM,SALA,SECU,SSBE,SUPP,SWEP,TAXS,TOPG,TRAD,TREA,VATX,VOST,WHLD,ZABA
*/
enum class ExternalCategoryPurpose1Code(@get:JsonValue val value: kotlin.String) {

    BONU("BONU"),
    CASH("CASH"),
    CBLK("CBLK"),
    CCRD("CCRD"),
    CGWV("CGWV"),
    CIPC("CIPC"),
    CONC("CONC"),
    CORT("CORT"),
    DCRD("DCRD"),
    DIVI("DIVI"),
    DVPM("DVPM"),
    EPAY("EPAY"),
    FCDT("FCDT"),
    FCIN("FCIN"),
    FCOL("FCOL"),
    GOVT("GOVT"),
    GP2P("GP2P"),
    HEDG("HEDG"),
    ICCP("ICCP"),
    IDCP("IDCP"),
    INTC("INTC"),
    INTE("INTE"),
    LBOX("LBOX"),
    LOAN("LOAN"),
    MP2B("MP2B"),
    MP2P("MP2P"),
    OTHR("OTHR"),
    PENS("PENS"),
    RPRE("RPRE"),
    RRCT("RRCT"),
    RVPM("RVPM"),
    SALA("SALA"),
    SECU("SECU"),
    SSBE("SSBE"),
    SUPP("SUPP"),
    SWEP("SWEP"),
    TAXS("TAXS"),
    TOPG("TOPG"),
    TRAD("TRAD"),
    TREA("TREA"),
    VATX("VATX"),
    VOST("VOST"),
    WHLD("WHLD"),
    ZABA("ZABA");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ExternalCategoryPurpose1Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalCategoryPurpose1Code'")
        }
    }
}

