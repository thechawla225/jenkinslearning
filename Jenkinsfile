pipeline{
    agent any
    environment{
        RELEASE="20.04"
    }
    stages
    {
        stage("Build")
        {
            agent any
            environment{
                LOG_LEVEL='INFO'
            }
            steps{
                echo "Hello my build number is $BUILD_NUMBER, log level $LOG_LEVEL,releae is $RELEASE"
            }
        }
        
        stage('Test')
        {
              steps{
                echo "Hello I can see build number is $BUILD_NUMBER, but cannot see log level $LOG_LEVEL,releae is $RELEASE"
            }
        }
    }
}