pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/MocanuGeorge010/DemoBlaze_QA.git'
               // sh './mvnw clean compile'
                //bat 'clean compile'
            }
        }
        stage('Test') {
            steps {
               // sh './mvnw test'
                // bat 'test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}