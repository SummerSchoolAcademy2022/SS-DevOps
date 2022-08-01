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
- [ ] Create a Google Cloud Project
- [ ] Navigate to Cloud Run and create a new service usying the Continuosly deploy new revisions from a source repository
- [ ] Link GCP with github account using the browser
- [ ] Make sure to check allow all trafic and allow unauthenticated requests when creating the Cloud Run Service for this demo
- [ ] Enjoy!


## In-depth instructions

### GCP Account creation

1. Creating the Google Cloud Platform Account \
![AnVIL Image](/_images/Step1.PNG "Step1") \
![AnVIL Image](/_images/Step2.PNG "Step2") \
![AnVIL Image](/_images/Step3.PNG "Step3") \
![AnVIL Image](/_images/Step4.PNG "Step4") \
 
2. Follow instructions and reach the Billing part \
![AnVIL Image](/_images/Step5.PNG "Step5") \


3. Enter basic informations and a valid card/virtual card (Revolut supported, but confirmation will be requested) \
![AnVIL Image](/_images/Step6.PNG "Step6") \
![AnVIL Image](/_images/Step7.PNG "Step7") \

4. Select --, then web applications and others and Engineer/Developer or Student \
![AnVIL Image](/_images/Step8.PNG "Step8") \

5. Skip the market-palce solutions recommended
![AnVIL Image](/_images/Step8.PNG "Step8") \

6. Go to Cloud Run





Respect structure \
Replace frontend content with your react content \
Replace src/* with the Spring app \
Edit pom.xml with the node version required for your application \
Edit pom.xml with your dependencies \
Edit if required Dockerfile with additional build informations \
