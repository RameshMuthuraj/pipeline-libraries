def call(imageName, imageTag) {
    //attempts to stop container, remove the container, remove the image
    sh """
        docker ps -q --filter ancestor='$imageName:$imageTag' | xargs docker stop || true
        docker ps -a -q --filter ancestor='$imageName:$imageTag' | xargs docker rm || true
        docker images --format '{{.Repository}}:{{.Tag}}' | grep '^$imageName:imageTag' | xargs docker rmi || true
    """
}
