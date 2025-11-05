package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBSCASupportData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticConsentResponse5DataAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticScheduledConsent4DataInitiation
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
 * 
 * @param permission Specifies the Open Banking service request types. For a full list of values see `OBInternalPermissions2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param initiation 
 * @param readRefundAccount Specifies to share the refund account details with PISP. For a full list of values see `OBInternalReadRefundAccount1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param authorisation 
 * @param scASupportData 
 */
data class OBWriteDomesticScheduledConsent4Data(

    @Schema(example = "null", required = true, description = "Specifies the Open Banking service request types. For a full list of values see `OBInternalPermissions2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Permission", required = true) val permission: OBWriteDomesticScheduledConsent4Data.Permission,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBWriteDomesticScheduledConsent4DataInitiation,

    @Schema(example = "null", description = "Specifies to share the refund account details with PISP. For a full list of values see `OBInternalReadRefundAccount1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBWriteDomesticScheduledConsent4Data.ReadRefundAccount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticConsentResponse5DataAuthorisation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null
) {

    /**
    * Specifies the Open Banking service request types. For a full list of values see `OBInternalPermissions2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: Create
    */
    enum class Permission(@get:JsonValue val value: kotlin.String) {

        Create("Create");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Permission {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteDomesticScheduledConsent4Data'")
            }
        }
    }

    /**
    * Specifies to share the refund account details with PISP. For a full list of values see `OBInternalReadRefundAccount1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: No,Yes
    */
    enum class ReadRefundAccount(@get:JsonValue val value: kotlin.String) {

        No("No"),
        Yes("Yes");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ReadRefundAccount {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteDomesticScheduledConsent4Data'")
            }
        }
    }

}

