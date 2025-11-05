package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount1
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPControlParametersPeriodicLimitsInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBVRPInteractionTypes
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
 * @param maximumIndividualAmount 
 * @param periodicLimits 
 * @param vrPType ^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.
 * @param psUAuthenticationMethods ^ Indicates that the PSU authentication methods supported.
 * @param validFromDateTime ^ Start date time for which the consent remains valid.
 * @param validToDateTime ^ End date time for which the consent remains valid.
 * @param psUInteractionTypes Indicates interaction type, currently if customer is present or not present. If not provided the default is `OffSession` (the customer is not present) when the individual VRP payment is made.
 * @param supplementaryData ^ Additional information that can not be captured in the structured fields and/or any other specific block
 */
data class OBDomesticVRPControlParameters(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MaximumIndividualAmount", required = true) val maximumIndividualAmount: OBActiveOrHistoricCurrencyAndAmount1,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PeriodicLimits", required = true) val periodicLimits: kotlin.collections.List<OBDomesticVRPControlParametersPeriodicLimitsInner>,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.")
    @get:JsonProperty("VRPType", required = true) val vrPType: kotlin.collections.List<kotlin.String>,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "^ Indicates that the PSU authentication methods supported.")
    @get:JsonProperty("PSUAuthenticationMethods", required = true) val psUAuthenticationMethods: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", description = "^ Start date time for which the consent remains valid.")
    @get:JsonProperty("ValidFromDateTime") val validFromDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "^ End date time for which the consent remains valid.")
    @get:JsonProperty("ValidToDateTime") val validToDateTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "Indicates interaction type, currently if customer is present or not present. If not provided the default is `OffSession` (the customer is not present) when the individual VRP payment is made.")
    @get:JsonProperty("PSUInteractionTypes") val psUInteractionTypes: kotlin.collections.List<OBVRPInteractionTypes>? = null,

    @field:Valid
    @Schema(example = "null", description = "^ Additional information that can not be captured in the structured fields and/or any other specific block")
    @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.Any? = null
) {

}

