package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBCashAccountDebtor4
import org.openapitools.model.OBStatusReason1
import org.openapitools.model.OBWriteDomesticConsentResponse5DataChargesInner
import org.openapitools.model.OBWriteDomesticResponse5DataRefund
import org.openapitools.model.OBWriteDomesticScheduledConsent4DataInitiation
import org.openapitools.model.OBWriteDomesticScheduledResponse5DataMultiAuthorisation
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
 * @param domesticScheduledPaymentId OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic schedule payment resource.
 * @param consentId OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 * @param creationDateTime Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param status Specifies the status of the payment order resource. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param initiation 
 * @param statusReason 
 * @param expectedExecutionDateTime Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param expectedSettlementDateTime Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param refund 
 * @param charges 
 * @param multiAuthorisation 
 * @param debtor 
 */
data class OBWriteDomesticScheduledResponse5Data(

    @get:Size(min=1,max=40)
    @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic schedule payment resource.")
    @get:JsonProperty("DomesticScheduledPaymentId", required = true) val domesticScheduledPaymentId: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the status of the payment order resource. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Status", required = true) val status: OBWriteDomesticScheduledResponse5Data.Status,

    @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBWriteDomesticScheduledConsent4DataInitiation,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason1>? = null,

    @Schema(example = "null", description = "Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpectedExecutionDateTime") val expectedExecutionDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpectedSettlementDateTime") val expectedSettlementDateTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Refund") val refund: OBWriteDomesticResponse5DataRefund? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Charges") val charges: kotlin.collections.List<OBWriteDomesticConsentResponse5DataChargesInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("MultiAuthorisation") val multiAuthorisation: OBWriteDomesticScheduledResponse5DataMultiAuthorisation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Debtor") val debtor: OBCashAccountDebtor4? = null
) {

    /**
    * Specifies the status of the payment order resource. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: RCVD,CANC,PDNG,ACTC,PATC,ACCP,ACFC,ACSP,ACWC,ACSC,ACWP,BLCK,RJCT
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("RCVD") RCVD("RCVD"),
        @JsonProperty("CANC") CANC("CANC"),
        @JsonProperty("PDNG") PDNG("PDNG"),
        @JsonProperty("ACTC") ACTC("ACTC"),
        @JsonProperty("PATC") PATC("PATC"),
        @JsonProperty("ACCP") ACCP("ACCP"),
        @JsonProperty("ACFC") ACFC("ACFC"),
        @JsonProperty("ACSP") ACSP("ACSP"),
        @JsonProperty("ACWC") ACWC("ACWC"),
        @JsonProperty("ACSC") ACSC("ACSC"),
        @JsonProperty("ACWP") ACWP("ACWP"),
        @JsonProperty("BLCK") BLCK("BLCK"),
        @JsonProperty("RJCT") RJCT("RJCT")
    }

}

