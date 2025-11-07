pipeline {
    agent any
    stages {
        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/surefire-reports/index.html', fingerprint: true

            emailext (
                to: 'avi.kapase@gmail.com',
                subject: "Build #${BUILD_NUMBER} - ${BUILD_STATUS}",
                body: "Build completed successfully. See attached report.",
                attachmentsPattern: 'target/surefire-reports/index.html',
                mimeType: 'text/html'
            )
        }
    }
}
