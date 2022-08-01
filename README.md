# React+Spring -> Cloud Run

## Recomendations

1. Use the same folder and file structure as this repository
2. Test your Docker image locally
3. Contact DevOps representative if unsure of any steps

## Steps
### More details in the next section
- [ ] Create a free Google Cloud Console Account following [this link](https://cloud.google.com/gcp?utm_source=google&utm_medium=cpc&utm_campaign=emea-ro-all-ro-bkws-all-all-trial-e-gcp-1011340&utm_content=text-ad-none-any-DEV_c-CRE_597590983635-ADGP_Hybrid+%7C+BKWS+-+EXA+%7C+Txt+~+GCP+~+General_Pure-KWID_43700071033692939-kwd-303045185251-userloc_1011828&utm_term=KW_google%20cloud%20platform%20console-NET_g-PLAC_&gclid=EAIaIQobChMIp-PayPik-QIVmo9oCR2vwQ8wEAAYASAAEgJEifD_BwE&gclsrc=aw.ds)
- [ ] Use a card to prove you're an adult (Revolut virtual cards work, no money will be needed as we are going to use the free tier usage)
- [ ] In the spring application, in the pom.xml file, add the node compiler dependency and ensure to use the required node version and provide the correct path to the frontend folder as 
- [ ] The output of a mvn package/build should be one single jar file.
- [ ] Adapt/Create the Dockerfile so your application name is used
- [ ] Make sure that you expose the 8080 port when running your application locally
- [ ] Push your repository into github
- [ ] Navigate to your Cloud Project
- [ ] Navigate to Cloud Run and create a new service usying the Continuosly deploy new revisions from a source repository
- [ ] Link GCP with github account using the browser
- [ ] Make sure to check allow all trafic and allow unauthenticated requests when creating the Cloud Run Service for this demo
- [ ] Enjoy!


## In-depth instructions

### GCP Account creation

1. **Creating the Google Cloud Platform Account** \
![AnVIL Image](/_images/Step1.PNG "Step1") \
![AnVIL Image](/_images/Step2.PNG "Step2") \
![AnVIL Image](/_images/Step3.PNG "Step3") \
![AnVIL Image](/_images/Step4.PNG "Step4") 
 
2. **Follow instructions and reach the Billing part** \
![AnVIL Image](/_images/Step5.PNG "Step5") 


3. **Enter basic informations and a valid card/virtual card (Revolut supported, but confirmation will be requested)** \
![AnVIL Image](/_images/Step6.PNG "Step6") \
![AnVIL Image](/_images/Step7.PNG "Step7") 

4. **Select Learn about specific products, then web applications and others and Engineer/Developer or Student** \
![AnVIL Image](/_images/Step8.PNG "Step8") 

5. **Skip the market-palce solutions recommended** \
![AnVIL Image](/_images/Step9.PNG "Step9")

6. **Make sure that your pom.xml builds one single jar and includes the plugin for node build (for new plugin versions visit [this link](https://mvnrepository.com/artifact/com.github.eirslett/frontend-maven-plugin) ) and to check what node version you need, run the following commands in your terminal:**
- **node -v** 
- **npm -v** 
![AnVIL Image](/_images/POMInstr.PNG "Pom NPM Example")

7. **Ensure that the Dockerfile is edited with the correct output jar file, to test you application locally you will need to build the docker image and run it:** 
- **docker build localspringapp .** 
- **docker run --name test -d -p 8080:8080 localspringapp** 
- **Open browser and navigate to localhost:8080** 
![AnVIL Image](/_images/POMJAR.PNG "Pom NPM Example") \
![AnVIL Image](/_images/DockerInstr.PNG "Pom NPM Example")

8. **Next, go to the Google Cloud Console, to the Cloud Run service and follow the bellow instructions** \
![AnVIL Image](/_images/Step10.PNG "Step10") \
![AnVIL Image](/_images/Step11.PNG "Step11") \
![AnVIL Image](/_images/Step12.PNG "Step12") \
![AnVIL Image](/_images/Step13.PNG "Step13")

9. **Authenticate your Google Cloud Project to have access to your Github repository** \
![AnVIL Image](/_images/Step14.PNG "Step14") \
![AnVIL Image](/_images/Step15.PNG "Step15") \
![AnVIL Image](/_images/Step16.PNG "Step16")

10. **Continue with the Cloud Run setup**
![AnVIL Image](/_images/Step17.PNG "Step17") \
![AnVIL Image](/_images/Step18.PNG "Step18") 

11. **Double-check all the selections and press create** \
![AnVIL Image](/_images/Step19.PNG "Step19") \
![AnVIL Image](/_images/Step20.PNG "Step20") 


12. **Wait for the service to be fully operational** \
![AnVIL Image](/_images/Step21.PNG "Step21") \
![AnVIL Image](/_images/Step23.PNG "Step23") 

12.a **If you want to see your Cloud Build, you can type in the search bar Cloud Build and select the service. There you can check the status of your build (which in this case will be the Docker build) and also you can see and edit the trigger that in this case is set to start a build everytime a commit in master is made.** \
![AnVIL Image](/_images/Step24.PNG "Step24") \
![AnVIL Image](/_images/Step25.PNG "Step25") \
![AnVIL Image](/_images/Step26.PNG "Step26") \
![AnVIL Image](/_images/Step27.PNG "Step27") \
![AnVIL Image](/_images/Step28.PNG "Step28") 

13. **Going back to Cloud Run, if the service is finished building we can test our solution clicking on the link of the service**
![AnVIL Image](/_images/Step29.PNG "Step29") \
![AnVIL Image](/_images/Step30.PNG "Step30") 

14. **After presenting the solution, in order to make sure no money will be required from the card or the project, proceed by deleting the Cloud Run and the Project Itself. (To delete the project, go to Cloud overview and access the Project settings)**
![AnVIL Image](/_images/Step31.PNG "Step31") \
![AnVIL Image](/_images/Step32.PNG "Step32") \
![AnVIL Image](/_images/Step33.PNG "Step33") \
![AnVIL Image](/_images/Step34.PNG "Step34") \
![AnVIL Image](/_images/Step35.PNG "Step35") 


