package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBDomesticVRPConsentResponseDataDebtorAccount
import org.openapitools.model.OBDomesticVRPControlParameters
import org.openapitools.model.OBDomesticVRPInitiation
import org.openapitools.model.OBStatusReason3
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
 * @param consentId Unique identification as assigned by the ASPSP to uniquely identify the consent resource. 
 * @param creationDateTime Date and time at which the resource was created. 
 * @param status Specifies the status of consent resource in code form. AWAU and RJCT only can returned on initial submission. For a full list of values see `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the resource status was updated. 
 * @param controlParameters 
 * @param initiation 
 * @param readRefundAccount Indicates whether information about RefundAccount should be included in the payment response. 
 * @param statusReason 
 * @param debtorAccount 
 */
data class OBDomesticVRPConsentResponseData(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the consent resource. ")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the resource was created. ")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the status of consent resource in code form. AWAU and RJCT only can returned on initial submission. For a full list of values see `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Status", required = true) val status: OBDomesticVRPConsentResponseData.Status,

    @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. ")
    @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ControlParameters", required = true) val controlParameters: OBDomesticVRPControlParameters,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBDomesticVRPInitiation,

    @Schema(example = "null", description = "Indicates whether information about RefundAccount should be included in the payment response. ")
    @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBDomesticVRPConsentResponseData.ReadRefundAccount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason3>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DebtorAccount") val debtorAccount: OBDomesticVRPConsentResponseDataDebtorAccount? = null
) {

    /**
    * Specifies the status of consent resource in code form. AWAU and RJCT only can returned on initial submission. For a full list of values see `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: AWAU,RJCT,AUTH,CANC,EXPD
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("AWAU") AWAU("AWAU"),
        @JsonProperty("RJCT") RJCT("RJCT"),
        @JsonProperty("AUTH") AUTH("AUTH"),
        @JsonProperty("CANC") CANC("CANC"),
        @JsonProperty("EXPD") EXPD("EXPD")
    }

    /**
    * Indicates whether information about RefundAccount should be included in the payment response. 
    * Values: Yes,No
    */
    enum class ReadRefundAccount(val value: kotlin.String) {

        @JsonProperty("Yes") Yes("Yes"),
        @JsonProperty("No") No("No")
    }

}

