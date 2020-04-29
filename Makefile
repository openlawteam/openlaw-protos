EXTERNAL_SERVICE_SCALA_OUTPUT := ./scala/external-service/src/main/scala
EXTERNAL_SERVICE_PACKAGE := integration/framework/openlaw
EXTERNAL_SERVICE_SCALA_PATH := ${EXTERNAL_SERVICE_SCALA_OUTPUT}/${EXTERNAL_SERVICE_PACKAGE}

delete-scala-external-service:
	@echo 'Deleting scala classes...'
	# FIXME - We need to double check why we generate files as `root` via openlaw/protocore
	sudo rm -rf ${EXTERNAL_SERVICE_SCALA_PATH}
	@echo 'Scala files deleted with success'

scala-external-service:
	@echo 'Generating scala classes from ExternalService.proto...'
	docker run --rm -it -v $(PWD):/src openlaw/protocore \
	protoc --scala_out=flat_package,grpc:${EXTERNAL_SERVICE_SCALA_OUTPUT} ExternalService.proto
	@ls '${EXTERNAL_SERVICE_SCALA_PATH}'
	@echo 'Files generated with success'

.PHONY: scala-external-service delete-scala-external-service