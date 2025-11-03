package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBCashAccountCreditor31
import org.openapitools.model.OBCashAccountDebtorWithName
import org.openapitools.model.OBPostalAddress72
import org.openapitools.model.OBRegulatoryReporting11
import org.openapitools.model.OBRemittanceInformation22
import org.openapitools.model.OBUltimateCreditor12
import org.openapitools.model.OBUltimateDebtor12
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
 * @param debtorAccount 
 * @param creditorAccount 
 * @param creditorPostalAddress 
 * @param ultimateCreditor 
 * @param ultimateDebtor 
 * @param remittanceInformation 
 * @param regulatoryReporting 
 */
data class OBDomesticVRPInitiation(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DebtorAccount") val debtorAccount: OBCashAccountDebtorWithName? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorAccount") val creditorAccount: OBCashAccountCreditor31? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorPostalAddress") val creditorPostalAddress: OBPostalAddress72? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("UltimateCreditor") val ultimateCreditor: OBUltimateCreditor12? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("UltimateDebtor") val ultimateDebtor: OBUltimateDebtor12? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RemittanceInformation") val remittanceInformation: OBRemittanceInformation22? = null,

    @field:Valid
    @get:Size(max=10)
    @Schema(example = "null", description = "")
    @get:JsonProperty("RegulatoryReporting") val regulatoryReporting: kotlin.collections.List<OBRegulatoryReporting11>? = null
) {

}

