pipeline {
    agent { docker { image 'gradle:7.4.1-jdk17-alpine' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}