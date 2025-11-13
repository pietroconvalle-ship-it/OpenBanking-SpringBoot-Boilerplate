.PHONY: generate

generate:
	openapi-generator generate \
		-i OpenApiSpec/openbankingmerged.swagger.json \
		-g kotlin-spring \
		-o . \
		--api-package uk.gov.justice.digital.hmpps.openbanking.api \
		--model-package uk.gov.justice.digital.hmpps.openbanking.model \
		--additional-properties useSpringBoot3=true,gradleBuildFile=false,basePackage=uk.gov.justice.digital.hmpps.openbanking,configPackage=uk.gov.justice.digital.hmpps.openbanking.config

compile:
	./gradlew build -x test -x ktlintMainSourceSetCheck

run: compile
	SPRING_PROFILES_ACTIVE=dev ./gradlew bootRun