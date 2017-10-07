def call(body) {
    def tag = sh returnStdout: true,
	    script: "echo ${env.BUILD_NUMBER}-`git rev-parse HEAD` | tr -d '\n'"
	echo "Set tag to ${tag}"
    return tag
}