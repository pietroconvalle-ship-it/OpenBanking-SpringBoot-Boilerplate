package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBFundsConfirmationConsentResponse1DataDebtorAccount
import org.openapitools.model.OBStatusReason2
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
 * @param consentId Unique identification as assigned to identify the funds confirmation consent resource.
 * @param creationDateTime Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param status Specifies the status of consent resource in code form. For a full list of values refer to `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param debtorAccount 
 * @param statusReason 
 * @param expirationDateTime Specified date and time the funds confirmation authorisation will expire. If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBFundsConfirmationConsentResponse1Data(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Unique identification as assigned to identify the funds confirmation consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the status of consent resource in code form. For a full list of values refer to `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Status", required = true) val status: OBFundsConfirmationConsentResponse1Data.Status,

    @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("DebtorAccount", required = true) val debtorAccount: OBFundsConfirmationConsentResponse1DataDebtorAccount,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason2>? = null,

    @Schema(example = "null", description = "Specified date and time the funds confirmation authorisation will expire. If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpirationDateTime") val expirationDateTime: java.time.OffsetDateTime? = null
) {

    /**
    * Specifies the status of consent resource in code form. For a full list of values refer to `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: AWAU,RJCT,AUTH,CANC,EXPD
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("AWAU") AWAU("AWAU"),
        @JsonProperty("RJCT") RJCT("RJCT"),
        @JsonProperty("AUTH") AUTH("AUTH"),
        @JsonProperty("CANC") CANC("CANC"),
        @JsonProperty("EXPD") EXPD("EXPD")
    }

}

