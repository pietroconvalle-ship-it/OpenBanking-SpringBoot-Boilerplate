package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBSCASupportData1
import org.openapitools.model.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation
import org.openapitools.model.OBWriteInternationalConsent5DataInitiation
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
 * @param initiation 
 * @param readRefundAccount Specifies to share the refund account details with PISP
 * @param authorisation 
 * @param scASupportData 
 */
data class OBWriteInternationalConsent5Data(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBWriteInternationalConsent5DataInitiation,

    @Schema(example = "null", description = "Specifies to share the refund account details with PISP")
    @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBWriteInternationalConsent5Data.ReadRefundAccount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null
) {

    /**
    * Specifies to share the refund account details with PISP
    * Values: No,Yes
    */
    enum class ReadRefundAccount(val value: kotlin.String) {

        @JsonProperty("No") No("No"),
        @JsonProperty("Yes") Yes("Yes")
    }

}

