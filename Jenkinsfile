pipeline {
    agent {
        label 'linux' 
        }
    stages {
        stage('build') {
            agent {docker { image 'golang:1.17.11-alpine' } }
            steps {
                sh 'go version'
            }
        }
    }
}