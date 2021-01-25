def call() {
    node {
      sh '''
        docker version
        docker-compose version
      '''
    }
}
