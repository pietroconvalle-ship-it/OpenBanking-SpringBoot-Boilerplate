package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBFundsConfirmation1DataInstructedAmount
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
 * @param fundsConfirmationId Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
 * @param consentId Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
 * @param creationDateTime Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param fundsAvailable Flag to indicate the result of a confirmation of funds check.
 * @param reference Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
 * @param instructedAmount 
 */
data class OBFundsConfirmationResponse1Data(

    @get:Size(min=1,max=40)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.")
    @get:JsonProperty("FundsConfirmationId", required = true) val fundsConfirmationId: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Flag to indicate the result of a confirmation of funds check.")
    @get:JsonProperty("FundsAvailable", required = true) val fundsAvailable: kotlin.Boolean,

    @get:Size(min=1,max=35)
    @Schema(example = "null", required = true, description = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")
    @get:JsonProperty("Reference", required = true) val reference: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBFundsConfirmation1DataInstructedAmount
) {

}

