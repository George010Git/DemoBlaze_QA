pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/MocanuGeorge010/Curs21_QA_Basics.git'
               // sh './mvnw clean compile'
                bat '.\\mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
               // sh './mvnw test'
                 bat '.\\mvnw test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}