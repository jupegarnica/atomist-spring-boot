node {
    // Mark the code checkout 'stage'....
    stage('Checkout') {
     checkout scm
    }

    stage('Configure'){
      // echo "${tool 'maven'}"
      env.PATH = "${tool 'maven'}/bin:${env.PATH}"
    }

    // Mark the code build 'stage'....
    stage('Build') {
      withMaven(){
       // Run the maven build
        sh "mvn clean verify -Dmaven.test.failure.ignore=true"

      }
    }

    stage('Analysis') {
      withSonarQubeEnv('sonarqube') {
        sh "mvn sonar:sonar"
      }
    }
}
