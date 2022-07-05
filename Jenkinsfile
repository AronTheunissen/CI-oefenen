pipeline {
    agent { docker { image 'maven:3.8.6-openjdk-11-slim' } }
    environment{
        MSYS_NO_PATHCONV = 1
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}