### OpenBanking Server SpringBoot boilerplate

##### OpenApi spec
This code was generated using the `OpenBanking spec v4`
> https://github.com/OpenBankingUK/read-write-api-specs/tree/master/dist/openapi

The separate files were merged into a single one using `openapi-merge`
> https://github.com/robertmassaioli/openapi-merge

##### Code Gen
Code was generated using `OpenApi Generator 7` for `kotling-spring` with the parameters `UseSpringBoot3` and `gradleBuildFile` set to `true`

Post code generation build.gradle.kts was updated to support java21 and the latest springboot stable.


### Generate code to latest spec

Install openapi-generator from brew:
`brew install openapi-generator`

Copy the latest openapi spec from github to the folder `OpenApiSpec`

Update `OpenApiSpec/openapi-merge.json` to include new files or exclude files that aren't anymore required

**From the root of the project** run `make generate` to re-generate the code
