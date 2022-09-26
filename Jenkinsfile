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
                echo "Hello I can see build number is $BUILD_NUMBER release is $RELEASE"
            }
        }
        stage("Deploy")
        {
            input{
                message 'Deploy?'
                ok 'Do it'
                parameters
                {
                    string(name: 'TARGET_ENVIRONMENT', defaultValue: 'PROD', description: 'Target deployment environment')
                }
            }
            steps{
                echo "Deploying release ${RELEASE} to environment ${TARGET_ENVIRONMENT}" 
            }
        }
    }
    post{
        always{
            echo "Prings whether deploy hua kee nahi hua"
        }
    }
}