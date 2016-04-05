all: clean
	@mkdir -p ./bin/Compiler
	@javac -cp \
		./lib/antlr-4.5.2-complete.jar \
		./*/*/*.java \
		./*/*.java \
		./*.java \
		-d ./bin/Compiler
	@cp ./lib/antlr-4.5.2-complete.jar ./bin
	@cd ./bin && jar xf ./antlr-4.5.2-complete.jar \
			  && rm -rf ./META-INF \
			  && jar cef Compiler/Main Compiler.jar ./ \
			  && rm -rf ./antlr-4.5.2-complete.jar ./Compiler  ./org  ./st4hidden

clean:
	rm -rf ./bin