package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBRegulatoryAuthority2
import uk.gov.justice.digital.hmpps.openbanking.model.OBStructuredRegulatoryReporting3
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
 * @param debitCreditReportingIndicator Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.  For a full list of values reefer to `OBExternalRegulatoryReportingType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param authority 
 * @param details 
 */
data class OBRegulatoryReporting1(

    @Schema(example = "null", description = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.  For a full list of values reefer to `OBExternalRegulatoryReportingType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("DebitCreditReportingIndicator") val debitCreditReportingIndicator: OBRegulatoryReporting1.DebitCreditReportingIndicator? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Authority") val authority: OBRegulatoryAuthority2? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Details") val details: kotlin.collections.List<OBStructuredRegulatoryReporting3>? = null
) {

    /**
    * Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.  For a full list of values reefer to `OBExternalRegulatoryReportingType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: CRED,DEBT,BOTH
    */
    enum class DebitCreditReportingIndicator(val value: kotlin.String) {

        @JsonProperty("CRED") CRED("CRED"),
        @JsonProperty("DEBT") DEBT("DEBT"),
        @JsonProperty("BOTH") BOTH("BOTH")
    }

}

