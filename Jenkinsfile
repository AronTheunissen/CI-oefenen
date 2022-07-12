pipeline {
    agent none
   stages {     
    stage('Maven Version') {
      agent {         
       docker {          
         image 'maven:3.8.6-jdk-11'         
     }       
  }       
  steps {
       sh 'mvn --version'
       }
     }
   }
 }