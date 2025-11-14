package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBAddressType2Code1

/**
 * Information that locates and identifies a specific address, as defined by postal services.
 * @param addressType
 * @param department Identification of a division of a large organisation or building.
 * @param subDepartment Identification of a sub-division of a large organisation or building.
 * @param streetName Name of a street or thoroughfare.
 * @param buildingNumber Number that identifies the position of a building on a street.
 * @param buildingName Name of a referenced building.
 * @param floor Number that identifies the level within a building
 * @param unitNumber Number that identifies the unit of a specific address .
 * @param room Information that locates and identifies a room to form part of an address
 * @param postBox Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.
 * @param townLocationName Name of a built-up area, with defined boundaries, and a local government.
 * @param districtName Number that of the regional area, known as a district, which forms part of an address
 * @param careOf The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.
 * @param postCode Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
 * @param townName Name of a built-up area, with defined boundaries, and a local government.
 * @param countrySubDivision Identifies a subdivision of a country such as state, region, county.
 * @param country Nation with its own government.
 * @param addressLine
 */
data class OBPostalAddress71(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("AddressType") val addressType: OBAddressType2Code1? = null,

  @get:Size(min = 1, max = 70)
  @Schema(example = "null", description = "Identification of a division of a large organisation or building.")
  @get:JsonProperty("Department") val department: kotlin.String? = null,

  @get:Size(min = 1, max = 70)
  @Schema(example = "null", description = "Identification of a sub-division of a large organisation or building.")
  @get:JsonProperty("SubDepartment") val subDepartment: kotlin.String? = null,

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "Name of a street or thoroughfare.")
  @get:JsonProperty("StreetName") val streetName: kotlin.String? = null,

  @get:Size(min = 1, max = 16)
  @Schema(example = "null", description = "Number that identifies the position of a building on a street.")
  @get:JsonProperty("BuildingNumber") val buildingNumber: kotlin.String? = null,

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "Name of a referenced building.")
  @get:JsonProperty("BuildingName") val buildingName: kotlin.String? = null,

  @get:Size(min = 1, max = 70)
  @Schema(example = "null", description = "Number that identifies the level within a building")
  @get:JsonProperty("Floor") val floor: kotlin.String? = null,

  @get:Size(min = 1, max = 16)
  @Schema(example = "null", description = "Number that identifies the unit of a specific address .")
  @get:JsonProperty("UnitNumber") val unitNumber: kotlin.String? = null,

  @get:Size(min = 1, max = 70)
  @Schema(example = "null", description = "Information that locates and identifies a room to form part of an address")
  @get:JsonProperty("Room") val room: kotlin.String? = null,

  @get:Size(min = 1, max = 16)
  @Schema(example = "null", description = "Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.")
  @get:JsonProperty("PostBox") val postBox: kotlin.String? = null,

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "Name of a built-up area, with defined boundaries, and a local government.")
  @get:JsonProperty("TownLocationName") val townLocationName: kotlin.String? = null,

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "Number that of the regional area, known as a district, which forms part of an address")
  @get:JsonProperty("DistrictName") val districtName: kotlin.String? = null,

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.")
  @get:JsonProperty("CareOf") val careOf: kotlin.String? = null,

  @get:Size(min = 1, max = 16)
  @Schema(example = "null", description = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")
  @get:JsonProperty("PostCode") val postCode: kotlin.String? = null,

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "Name of a built-up area, with defined boundaries, and a local government.")
  @get:JsonProperty("TownName") val townName: kotlin.String? = null,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Identifies a subdivision of a country such as state, region, county.")
  @get:JsonProperty("CountrySubDivision") val countrySubDivision: kotlin.String? = null,

  @get:Pattern(regexp = "^[A-Z]{2,2}$")
  @Schema(example = "null", description = "Nation with its own government.")
  @get:JsonProperty("Country") val country: kotlin.String? = null,

  @get:Size(min = 0, max = 7)
  @Schema(example = "null", description = "")
  @get:JsonProperty("AddressLine") val addressLine: kotlin.collections.List<kotlin.String>? = null,
)
