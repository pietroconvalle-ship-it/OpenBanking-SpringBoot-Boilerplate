package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBSCASupportData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalScheduled3DataInitiation
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
 * @param permission Specifies the Open Banking service request types.
 * @param initiation 
 * @param readRefundAccount Specifies to share the refund account details with PISP
 * @param authorisation 
 * @param scASupportData 
 */
data class OBWriteInternationalScheduledConsent5Data(

    @Schema(example = "null", required = true, description = "Specifies the Open Banking service request types.")
    @get:JsonProperty("Permission", required = true) val permission: OBWriteInternationalScheduledConsent5Data.Permission,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBWriteInternationalScheduled3DataInitiation,

    @Schema(example = "null", description = "Specifies to share the refund account details with PISP")
    @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBWriteInternationalScheduledConsent5Data.ReadRefundAccount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null
) {

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

