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
* Specifies the external proxy account type code, as published in the proxy account type external code set.<br /> For a full list of values see `ExternalProxyAccountType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: TELE,EMAL,DNAM,CINC,COTX,COID,CUST,DRLC,EIDN,EWAL,PVTX,LEIC,MBNO,NIDN,CCPT,SHID,SOSE,TOKN,UBIL,VIPN,BIID
*/
enum class ExternalProxyAccountType1Code3(val value: kotlin.String) {

    @JsonProperty("TELE") TELE("TELE"),
    @JsonProperty("EMAL") EMAL("EMAL"),
    @JsonProperty("DNAM") DNAM("DNAM"),
    @JsonProperty("CINC") CINC("CINC"),
    @JsonProperty("COTX") COTX("COTX"),
    @JsonProperty("COID") COID("COID"),
    @JsonProperty("CUST") CUST("CUST"),
    @JsonProperty("DRLC") DRLC("DRLC"),
    @JsonProperty("EIDN") EIDN("EIDN"),
    @JsonProperty("EWAL") EWAL("EWAL"),
    @JsonProperty("PVTX") PVTX("PVTX"),
    @JsonProperty("LEIC") LEIC("LEIC"),
    @JsonProperty("MBNO") MBNO("MBNO"),
    @JsonProperty("NIDN") NIDN("NIDN"),
    @JsonProperty("CCPT") CCPT("CCPT"),
    @JsonProperty("SHID") SHID("SHID"),
    @JsonProperty("SOSE") SOSE("SOSE"),
    @JsonProperty("TOKN") TOKN("TOKN"),
    @JsonProperty("UBIL") UBIL("UBIL"),
    @JsonProperty("VIPN") VIPN("VIPN"),
    @JsonProperty("BIID") BIID("BIID")
}

