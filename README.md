# Appium-Maven-testing-mobileapp
Testing of a mobile app and looking for flaws and UX problem 

## Problem Defination:
To perform black box testing on mobile application using Appium automation tool along with Maven (building tool), JUnit (testing for java language), TestNG (report generation) and selenium(automation).

## Abstarct:
The project is on black box testing on the Calculator application. The desired capabilities of used mobile version used were added using DesiredCapabilities feature of selenium. These capabilities were added to the pom.xml file.

The purpose of using Android Studio is to find the adb devices and to make the mobile device compatible with the JAVA SDK versions used on desktop. All the capabilities needed to use a phone device is organized using adb. All the test scripts are written in Eclipse IDE. 
The mobile element’s capabilities are inbuilt functionalities of JUnit imported class. Example: el7.click()

Before test, Appium server needs to be started and the test are run after selecting  “Run as TestNG”. This automates the test using selenium, Appium. The report is generated using TestNG. 
The build (all the dependencies required in the project) is performed using Maven.

Dependencies: 1. Selenium 	2. TestNG	3. Appium Java Client.
These dependencies are closed under <dependency> and </ dependency >

## Technologies used:
1.	Appium
2.	Maven
3.  TestNG
4.  Selenium
5.  Eclipse
6.  Android Studio
7.  JUnit

## Implemetation:
Test cases are generated from Appium desktop on the desired Mobile Application you want to test. The should be installed on your device and we provide an apk file to Appium Desktop. It Automates all the Test cases we want.
Create a maven project and add all dependencies. A base class is created where desired capabilities are set and path of the mobile application package name and activity name too. 
A new class is created which extends the base class and all the test scripts are written in this class.
Then, it the test modules are run using TestNG extension and Appium Server. The server automates the test cases, and after completion, a test report is generated.
Following are the detailed steps for Project Demonstration with complete setup.
