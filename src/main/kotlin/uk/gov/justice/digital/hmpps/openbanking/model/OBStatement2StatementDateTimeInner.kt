package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Set of elements used to provide details of a generic date time for the statement resource.
 * @param dateTime Date and time associated with the date time type. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param type Date time type, in a coded form. For a full list of values see `OBInternalStatementDateTimeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */
data class OBStatement2StatementDateTimeInner(

  @Schema(example = "2024-05-29T00:00Z", required = true, description = "Date and time associated with the date time type. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("DateTime", required = true) val dateTime: java.time.OffsetDateTime,

  @Schema(example = "UK.OBIE.NextStatement", required = true, description = "Date time type, in a coded form. For a full list of values see `OBInternalStatementDateTimeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Type", required = true) val type: kotlin.String,
)
