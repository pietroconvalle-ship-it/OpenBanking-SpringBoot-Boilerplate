package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
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
* Specifies the extended type of account if known. For a full set of values refer to `OBInternalExtendedAccountType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Business,BusinessSavingsAccount,Charity,Collection,Corporate,Ewallet,Government,Investment,ISA,JointPersonal,Pension,Personal,PersonalSavingsAccount,Premier,Wealth
*/
enum class OBInternalExtendedAccountType1Code1(val value: kotlin.String) {

    @JsonProperty("Business") Business("Business"),
    @JsonProperty("BusinessSavingsAccount") BusinessSavingsAccount("BusinessSavingsAccount"),
    @JsonProperty("Charity") Charity("Charity"),
    @JsonProperty("Collection") Collection("Collection"),
    @JsonProperty("Corporate") Corporate("Corporate"),
    @JsonProperty("Ewallet") Ewallet("Ewallet"),
    @JsonProperty("Government") Government("Government"),
    @JsonProperty("Investment") Investment("Investment"),
    @JsonProperty("ISA") ISA("ISA"),
    @JsonProperty("JointPersonal") JointPersonal("JointPersonal"),
    @JsonProperty("Pension") Pension("Pension"),
    @JsonProperty("Personal") Personal("Personal"),
    @JsonProperty("PersonalSavingsAccount") PersonalSavingsAccount("PersonalSavingsAccount"),
    @JsonProperty("Premier") Premier("Premier"),
    @JsonProperty("Wealth") Wealth("Wealth")
}

