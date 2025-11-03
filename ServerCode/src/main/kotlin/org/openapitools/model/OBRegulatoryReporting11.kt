package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBRegulatoryAuthority21
import org.openapitools.model.OBStructuredRegulatoryReporting31
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
 * Information needed due to regulatory and statutory requirements
 * @param debitCreditReportingIndicator Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction. For a full list of values refer to `OBExternalRegulatoryReportingType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param authority 
 * @param details Set of elements used to provide details on the regulatory reporting information.
 */
data class OBRegulatoryReporting11(

    @Schema(example = "null", description = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction. For a full list of values refer to `OBExternalRegulatoryReportingType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("DebitCreditReportingIndicator") val debitCreditReportingIndicator: OBRegulatoryReporting11.DebitCreditReportingIndicator? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Authority") val authority: OBRegulatoryAuthority21? = null,

    @field:Valid
    @Schema(example = "null", description = "Set of elements used to provide details on the regulatory reporting information.")
    @get:JsonProperty("Details") val details: kotlin.collections.List<OBStructuredRegulatoryReporting31>? = null
) {

    /**
    * Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction. For a full list of values refer to `OBExternalRegulatoryReportingType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: CRED,DEBT,BOTH
    */
    enum class DebitCreditReportingIndicator(val value: kotlin.String) {

        @JsonProperty("CRED") CRED("CRED"),
        @JsonProperty("DEBT") DEBT("DEBT"),
        @JsonProperty("BOTH") BOTH("BOTH")
    }

}

