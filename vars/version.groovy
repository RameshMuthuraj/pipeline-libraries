def call(body) {
    def version = sh returnStdout: true,
	    script: "echo ${env.BUILD_NUMBER}-`git rev-parse HEAD` | tr -d '\n'"
	echo "Set version to ${version}"
    return version
}