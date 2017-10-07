def call(body) {
    return sh returnStdout: true,
	    script: "echo ${BUILD_NUMBER}-`git rev-parse HEAD` | tr -d '\n'"
}