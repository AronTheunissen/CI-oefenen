pipeline {
    agent {
        docker {
        image 'maven:3-alpine'
        label 'docker'
        }
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}