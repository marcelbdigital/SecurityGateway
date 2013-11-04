This folder contains the Apache Ant based source code for the axis2Client's that can be used to test the sample WSO2ESB configurations on the sample services provided in the axis2Server folder. 

To run a sample: 
    1.) Select a sample from http://docs.wso2.org/wiki/display/ESB470/Samples
    2.) Start the WSO2ESB server using:
        For Windows: $ESB_HOME/bin/wso2esb-samples.bat -sn $_SN 
        For Unix Based: $ESB_HOME/bin/wso2esb-samples.sh -sn $_SN 

        Please replace $_SN with the sample number you've chosen. 

    3.) Compile and deploy the corresponding Axis2 sample service.
        3.1.) Go into the relevant service inside $ESB_HOME/samples/axis2Server/src/ 
        3.2.) Issue the 'ant' command to build the service. 
        3.3.) Run the axis2server script inside $ESB_HOME/samples/axis2Server/ to deploy any of the services that have been compiled.
        3.4.) You can check to see if your service has been deployed by visiting http://localhost:9000/services/ 

    4.) To access the deployed service using the sample client you can issue the corresponding ant command from the $ESB_HOME/samples/axis2Client directory. 
        For example: 
                ant stockquote -Daddurl=http://localhost:9000/services/SimpleStockQuoteService -Dtrpurl=http://localhost:8280/
                
        For more information on the different axis2Client's, please refer the WSO2ESB Sample documentation at http://docs.wso2.com 
