all: clean
	@mkdir -p ./bin/Compiler
	@javac -cp \
		./lib/antlr-4.5.2-complete.jar \
		./cn/ficos/Compiler/*/*/*.java \
		./cn/ficos/Compiler/*/*.java \
		./cn/ficos/Compiler/*.java \
		-d ./bin
	@cp ./lib/antlr-4.5.2-complete.jar ./bin
	@cd ./bin && jar xf ./antlr-4.5.2-complete.jar \
			  && rm -rf ./META-INF \
			  && jar cef cn/ficos/Compiler/Main Compiler.jar ./ \
			  && rm -rf ./antlr-4.5.2-complete.jar ./Compiler  ./org  ./st4hidden ./cn

clean:
	rm -rf ./bin