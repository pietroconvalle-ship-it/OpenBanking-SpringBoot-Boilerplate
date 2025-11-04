package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountDebtor4
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatusReason1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomestic2DataInitiation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticConsentResponse5DataChargesInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticResponse5DataMultiAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticResponse5DataRefund
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
 * @param domesticPaymentId OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.
 * @param consentId OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 * @param creationDateTime Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param status Specifies the status of the payment information group. For a full list of values refer to `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
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
data class OBWriteDomesticResponse5Data(

    @get:Size(min=1,max=40)
    @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.")
    @get:JsonProperty("DomesticPaymentId", required = true) val domesticPaymentId: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the message was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the status of the payment information group. For a full list of values refer to `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Status", required = true) val status: OBWriteDomesticResponse5Data.Status,

    @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBWriteDomestic2DataInitiation,

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
    @get:JsonProperty("MultiAuthorisation") val multiAuthorisation: OBWriteDomesticResponse5DataMultiAuthorisation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Debtor") val debtor: OBCashAccountDebtor4? = null
) {

    /**
    * Specifies the status of the payment information group. For a full list of values refer to `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: RCVD,PDNG,ACTC,PATC,ACCP,ACFC,ACSP,ACWC,ACSC,ACWP,ACCC,BLCK,RJCT
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("RCVD") RCVD("RCVD"),
        @JsonProperty("PDNG") PDNG("PDNG"),
        @JsonProperty("ACTC") ACTC("ACTC"),
        @JsonProperty("PATC") PATC("PATC"),
        @JsonProperty("ACCP") ACCP("ACCP"),
        @JsonProperty("ACFC") ACFC("ACFC"),
        @JsonProperty("ACSP") ACSP("ACSP"),
        @JsonProperty("ACWC") ACWC("ACWC"),
        @JsonProperty("ACSC") ACSC("ACSC"),
        @JsonProperty("ACWP") ACWP("ACWP"),
        @JsonProperty("ACCC") ACCC("ACCC"),
        @JsonProperty("BLCK") BLCK("BLCK"),
        @JsonProperty("RJCT") RJCT("RJCT")
    }

}

