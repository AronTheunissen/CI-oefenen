pipeline {
    agent { 
        docker { 
            image 'maven:3.8.6-jdk-11' 
        }
    } 
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}