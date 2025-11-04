package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalStatementType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1DataTotalValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementBenefitInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementDateTimeInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementFeeInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementInterestInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementRateInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2StatementValueInner
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
 * Provides further details on a statement resource.
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param type 
 * @param startDateTime Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param endDateTime Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param creationDateTime Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param statementId Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
 * @param statementReference Unique reference for the statement. This reference may be optionally populated if available.
 * @param statementDescription 
 * @param statementBenefit 
 * @param statementFee 
 * @param statementInterest 
 * @param statementDateTime 
 * @param statementRate 
 * @param statementValue 
 * @param totalValue 
 */
data class OBStatement2Basic(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Type", required = true) val type: OBInternalStatementType1Code,

    @Schema(example = "2017-07-12T00:00Z", required = true, description = "Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StartDateTime", required = true) val startDateTime: java.time.OffsetDateTime,

    @Schema(example = "2017-07-12T00:00Z", required = true, description = "Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("EndDateTime", required = true) val endDateTime: java.time.OffsetDateTime,

    @Schema(example = "2024-05-29T00:00Z", required = true, description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @get:Size(min=1,max=40)
    @Schema(example = "8sfhke-sifhkeuf-97813", description = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.")
    @get:JsonProperty("StatementId") val statementId: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "002", description = "Unique reference for the statement. This reference may be optionally populated if available.")
    @get:JsonProperty("StatementReference") val statementReference: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementDescription") val statementDescription: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementBenefit") val statementBenefit: kotlin.collections.List<OBStatement2StatementBenefitInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementFee") val statementFee: kotlin.collections.List<OBStatement2StatementFeeInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementInterest") val statementInterest: kotlin.collections.List<OBStatement2StatementInterestInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementDateTime") val statementDateTime: kotlin.collections.List<OBStatement2StatementDateTimeInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementRate") val statementRate: kotlin.collections.List<OBStatement2StatementRateInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementValue") val statementValue: kotlin.collections.List<OBStatement2StatementValueInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("TotalValue") val totalValue: OBReadBalance1DataTotalValue? = null
) {

}

