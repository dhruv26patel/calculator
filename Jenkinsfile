pipeline {
     agent any
     stages {
          stage("Checkout") {
               steps {
                    git url: 'https://github.com/dhruv26patel/calculator'
               }
            }
          stage("Compile") {
                steps {
                    sh "pwd; cd calculator; ls -l; ./gradlew compileJava"
                }
            }
            stage("Unit test") {
                steps {
                    sh "pwd; cd calculator; ls -l; ./gradlew test"
                }
            }
            stage("Code coverage") {
                steps {
                    sh "pwd; cd calculator; ls -l; ./gradlew jacocoTestReport"
                    sh "pwd; cd calculator; ls -l; ./gradlew jacocoTestCoverageVerification"
                }
            }
     }
}