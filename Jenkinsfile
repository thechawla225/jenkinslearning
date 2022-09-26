pipeline{
    agent any
    environment{
        RELEASE="20.04"
    }
    stages
    {
        stage("Build")
        {
            agnet any
            environment{
                "LOG_LEVEL"='INFO'
            }
            steps{
                echo "Hello my build number is $BUILD_NUMBER, log level $LOG_LEVEL,releae is $RELEASE"
            }
            stage('Test')
            {
                echo "I can see release $RELASE but not log level $LOG_LEVEL"
            }
        }
    }
}