package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountDebtor4
import uk.gov.justice.digital.hmpps.openbanking.model.OBSCASupportData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatusReason1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticConsentResponse5DataChargesInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalStandingOrder4DataInitiation
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
    enum class Status(@get:JsonValue val value: kotlin.String) {

        AWAU("AWAU"),
        RJCT("RJCT"),
        AUTH("AUTH"),
        COND("COND");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteInternationalStandingOrderConsentResponse7Data'")
            }
        }
    }

    /**
    * Specifies the Open Banking service request types.
    * Values: Create
    */
    enum class Permission(@get:JsonValue val value: kotlin.String) {

        Create("Create");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Permission {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteInternationalStandingOrderConsentResponse7Data'")
            }
        }
    }

    /**
    * Specifies to share the refund account details with PISP
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteInternationalStandingOrderConsentResponse7Data'")
            }
        }
    }

}

