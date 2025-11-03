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
* Enumeration of codes that outlines the type of purpose behind a transaction, payment or risk.  For all enum values see `ExternalCategoryPurpose1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: BONU,CASH,CBLK,CCRD,CGWV,CIPC,CONC,CORT,DCRD,DIVI,DVPM,EPAY,FCDT,FCIN,FCOL,GOVT,GP2P,HEDG,ICCP,IDCP,INTC,INTE,LBOX,LOAN,MP2B,MP2P,OTHR,PENS,RPRE,RRCT,RVPM,SALA,SECU,SSBE,SUPP,SWEP,TAXS,TOPG,TRAD,TREA,VATX,VOST,WHLD,ZABA
*/
enum class ExternalCategoryPurpose1Code(val value: kotlin.String) {

    @JsonProperty("BONU") BONU("BONU"),
    @JsonProperty("CASH") CASH("CASH"),
    @JsonProperty("CBLK") CBLK("CBLK"),
    @JsonProperty("CCRD") CCRD("CCRD"),
    @JsonProperty("CGWV") CGWV("CGWV"),
    @JsonProperty("CIPC") CIPC("CIPC"),
    @JsonProperty("CONC") CONC("CONC"),
    @JsonProperty("CORT") CORT("CORT"),
    @JsonProperty("DCRD") DCRD("DCRD"),
    @JsonProperty("DIVI") DIVI("DIVI"),
    @JsonProperty("DVPM") DVPM("DVPM"),
    @JsonProperty("EPAY") EPAY("EPAY"),
    @JsonProperty("FCDT") FCDT("FCDT"),
    @JsonProperty("FCIN") FCIN("FCIN"),
    @JsonProperty("FCOL") FCOL("FCOL"),
    @JsonProperty("GOVT") GOVT("GOVT"),
    @JsonProperty("GP2P") GP2P("GP2P"),
    @JsonProperty("HEDG") HEDG("HEDG"),
    @JsonProperty("ICCP") ICCP("ICCP"),
    @JsonProperty("IDCP") IDCP("IDCP"),
    @JsonProperty("INTC") INTC("INTC"),
    @JsonProperty("INTE") INTE("INTE"),
    @JsonProperty("LBOX") LBOX("LBOX"),
    @JsonProperty("LOAN") LOAN("LOAN"),
    @JsonProperty("MP2B") MP2B("MP2B"),
    @JsonProperty("MP2P") MP2P("MP2P"),
    @JsonProperty("OTHR") OTHR("OTHR"),
    @JsonProperty("PENS") PENS("PENS"),
    @JsonProperty("RPRE") RPRE("RPRE"),
    @JsonProperty("RRCT") RRCT("RRCT"),
    @JsonProperty("RVPM") RVPM("RVPM"),
    @JsonProperty("SALA") SALA("SALA"),
    @JsonProperty("SECU") SECU("SECU"),
    @JsonProperty("SSBE") SSBE("SSBE"),
    @JsonProperty("SUPP") SUPP("SUPP"),
    @JsonProperty("SWEP") SWEP("SWEP"),
    @JsonProperty("TAXS") TAXS("TAXS"),
    @JsonProperty("TOPG") TOPG("TOPG"),
    @JsonProperty("TRAD") TRAD("TRAD"),
    @JsonProperty("TREA") TREA("TREA"),
    @JsonProperty("VATX") VATX("VATX"),
    @JsonProperty("VOST") VOST("VOST"),
    @JsonProperty("WHLD") WHLD("WHLD"),
    @JsonProperty("ZABA") ZABA("ZABA")
}

