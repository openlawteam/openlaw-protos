LIB_DIR    := libs
GO_DIST    := $(LIB_DIR)/go
JS_DIST    := $(LIB_DIR)/js
SCALA_DIST := $(LIB_DIR)/scala

DIST_DIRS = $(GO_DIST) $(JS_DIST) $(SCALA_DIST)
$(DIST_DIRS):
	mkdir -p $@


foobar: ExternalService.proto $(DIST_DIRS)
	docker run --rm -it \
		-v "$$(pwd)":/src \
		openlaw/protocore protoc \
			--go_out=plugins=grpc:$(GO_DIST) \
			--js_out=import_style=commonjs,binary:$(JS_DIST) \
			--ts_out=$(JS_DIST) \
			--scala_out=$(SCALA_DIST) \
			--doc_out=$(LIB_DIR) --doc_opt=markdown,README.md \
			$<

.DEFAULT_GOAL := all
all: foobar

clobber:
	rm -rf $(LIB_DIR)
