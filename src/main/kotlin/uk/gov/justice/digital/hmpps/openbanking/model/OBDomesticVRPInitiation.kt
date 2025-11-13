package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountCreditor31
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountDebtorWithName
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress72
import uk.gov.justice.digital.hmpps.openbanking.model.OBRegulatoryReporting11
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformation22
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateCreditor12
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateDebtor12

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
  @get:Size(max = 10)
  @Schema(example = "null", description = "")
  @get:JsonProperty("RegulatoryReporting") val regulatoryReporting: kotlin.collections.List<OBRegulatoryReporting11>? = null,
)
