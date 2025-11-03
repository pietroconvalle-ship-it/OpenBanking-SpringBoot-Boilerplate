package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBCashAccountDebtor4
import org.openapitools.model.OBSCASupportData1
import org.openapitools.model.OBStatusReason1
import org.openapitools.model.OBWriteDomesticConsentResponse5DataChargesInner
import org.openapitools.model.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation
import org.openapitools.model.OBWriteInternationalStandingOrder4DataInitiation
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
 * @param consentId OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 * @param creationDateTime Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param status Specifies the status of consent resource in code form.
 * @param statusUpdateDateTime Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param permission Specifies the Open Banking service request types.
 * @param initiation 
 * @param statusReason 
 * @param readRefundAccount Specifies to share the refund account details with PISP
 * @param cutOffDateTime Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param charges 
 * @param authorisation 
 * @param scASupportData 
 * @param debtor 
 */
data class OBWriteInternationalStandingOrderConsentResponse7Data(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the status of consent resource in code form.")
    @get:JsonProperty("Status", required = true) val status: OBWriteInternationalStandingOrderConsentResponse7Data.Status,

    @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the Open Banking service request types.")
    @get:JsonProperty("Permission", required = true) val permission: OBWriteInternationalStandingOrderConsentResponse7Data.Permission,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBWriteInternationalStandingOrder4DataInitiation,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason1>? = null,

    @Schema(example = "null", description = "Specifies to share the refund account details with PISP")
    @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBWriteInternationalStandingOrderConsentResponse7Data.ReadRefundAccount? = null,

    @Schema(example = "null", description = "Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CutOffDateTime") val cutOffDateTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Charges") val charges: kotlin.collections.List<OBWriteDomesticConsentResponse5DataChargesInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Debtor") val debtor: OBCashAccountDebtor4? = null
) {

    /**
    * Specifies the status of consent resource in code form.
    * Values: AWAU,RJCT,AUTH,COND
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("AWAU") AWAU("AWAU"),
        @JsonProperty("RJCT") RJCT("RJCT"),
        @JsonProperty("AUTH") AUTH("AUTH"),
        @JsonProperty("COND") COND("COND")
    }

    /**
    * Specifies the Open Banking service request types.
    * Values: Create
    */
    enum class Permission(val value: kotlin.String) {

        @JsonProperty("Create") Create("Create")
    }

    /**
    * Specifies to share the refund account details with PISP
    * Values: No,Yes
    */
    enum class ReadRefundAccount(val value: kotlin.String) {

        @JsonProperty("No") No("No"),
        @JsonProperty("Yes") Yes("Yes")
    }

}

