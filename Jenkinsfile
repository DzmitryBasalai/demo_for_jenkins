pipeline {
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "M3"
   }

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/DzmitryBasalai/demo_for_jenkins.git'

            // Run Maven on a Unix agent.
            //sh "mvn -Dmaven.test.failure.ignore=true clean package"

            // To run Maven on a Windows agent, use
             bat "mvn clean package"
         }
      }

      //stage('Repost') {
      //    steps {
      //      script {
      //          allure([
      //              inclydeProperties: false,
      //              jdk: '',
      //              properties: [],
      //              reportBuildPolicy: 'ALWAYS',
      //              results: [[path: 'target/allure-results']]
      //              ])
      //      }
      //     }
      // }
   }
}
