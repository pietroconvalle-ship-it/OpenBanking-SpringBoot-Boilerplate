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
* Specifies the external proxy account type code, as published in the proxy account type external code set.<br /> For a full list of values see `ExternalProxyAccountType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: TELE,EMAL,DNAM,CINC,COTX,COID,CUST,DRLC,EIDN,EWAL,PVTX,LEIC,MBNO,NIDN,CCPT,SHID,SOSE,TOKN,UBIL,VIPN,BIID
*/
enum class ExternalProxyAccountType1Code1(@get:JsonValue val value: kotlin.String) {

    TELE("TELE"),
    EMAL("EMAL"),
    DNAM("DNAM"),
    CINC("CINC"),
    COTX("COTX"),
    COID("COID"),
    CUST("CUST"),
    DRLC("DRLC"),
    EIDN("EIDN"),
    EWAL("EWAL"),
    PVTX("PVTX"),
    LEIC("LEIC"),
    MBNO("MBNO"),
    NIDN("NIDN"),
    CCPT("CCPT"),
    SHID("SHID"),
    SOSE("SOSE"),
    TOKN("TOKN"),
    UBIL("UBIL"),
    VIPN("VIPN"),
    BIID("BIID");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ExternalProxyAccountType1Code1 {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalProxyAccountType1Code1'")
        }
    }
}

