node {
    // Mark the code checkout 'stage'....
    stage('Checkout') {
     checkout scm
    }

    stage('Configure'){
      echo "${tool 'maven'}"
      env.PATH = "${tool 'maven'}/bin:${env.PATH}"
    }

    // Mark the code build 'stage'....
    stage('Build') {
        echo "BUILD STARTING"
        sh "mvn clean verify -Dmaven.test.failure.ignore=true"
        echo "BUILD FINISHED"
        // sh "mvn clean verify -Dmaven.test.failure.ignore=false"
    }

    stage('Analysis') {
      withSonarQubeEnv('sonarqube') {
        sh "mvn sonar:sonar"
      }
    }

    // stage('validate quality gate') {
    //   //  testQualityGate('sonarqube')
    // }

    // stage('Deploy') {
    //     sh "mvn deploy"
    // }


}
