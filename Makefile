EXTERNAL_SERVICE_SCALA_ROOT := scala/external-service
EXTERNAL_SERVICE_SCALA_OUTPUT := ${EXTERNAL_SERVICE_SCALA_ROOT}/src/main/scala
EXTERNAL_SERVICE_PACKAGE := integration/framework/openlaw
EXTERNAL_SERVICE_SCALA_PATH := ${EXTERNAL_SERVICE_SCALA_OUTPUT}/${EXTERNAL_SERVICE_PACKAGE}

clean-es-scala:
	@echo 'Deleting scala classes...'
	rm -rf ${EXTERNAL_SERVICE_SCALA_PATH}
	rm -rf ${EXTERNAL_SERVICE_SCALA_ROOT}/build/libs
	@echo 'Scala files deleted with success'

build-es-scala:
	@echo 'Generating scala classes from ExternalService.proto...'
	docker run --user `id -u` --rm -it -v $(PWD):/src openlaw/protocore \
	protoc --scala_out=flat_package,grpc:${EXTERNAL_SERVICE_SCALA_OUTPUT} ExternalService.proto
	@ls '${EXTERNAL_SERVICE_SCALA_PATH}'
	@echo 'Files generated with success'
	@echo 'Building library...'
	./${EXTERNAL_SERVICE_SCALA_ROOT}/gradlew -p ${EXTERNAL_SERVICE_SCALA_ROOT} build
	@echo 'Library built with success'

.PHONY: clean-es-scala \
		build-es-scala