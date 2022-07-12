pipeline {
    agent {
        label 'docker' 
        docker { image 'golang:1.17.11-alpine' } }
    stages {
        stage('build') {
            steps {
                sh 'go version'
            }
        }
    }
}