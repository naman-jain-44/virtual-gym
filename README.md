# Virtual Gym 

##### The Virtual Gym project is an Android application that uses the MLKit  machine learning library to detect poses and count repetitions of various exercises such as push-ups, squats, and shoulder press. The application will utilize the pose detection feature of the MediaPipe library to accurately detect the user's poses and track the movements of their body during exercises. With this information, the application will count the number of repetitions of each exercise that the user performs.


##### There are many features which inclued :-

###### 1 Count your correct reps of different exercises.
###### 2 You can learn the exercises from tutorials.
###### 3 Make your own workout plan by setting differnt time intervals.




[![VIRTUAL GYM - DEMO VIDEO ](https://i9.ytimg.com/vi_webp/UvyiSEFqmhk/mqdefault.webp?v=641de812&sqp=CJyS_6AG&rs=AOn4CLDbN897QTZResF7Cf3XiLTCI_X6Ew)](https://youtu.be/UvyiSEFqmhk)


# RUN THE APP 


## Model

The ML Kit Pose Detection API is a lightweight versatile solution for app developers to detect the pose of a subject's body in real time from a continuous video or static image. A pose describes the body's position at one moment in time with a set of skeletal landmark points. The landmarks correspond to different body parts such as the shoulders and hips. The relative positions of landmarks can be used to distinguish one pose from another.

## Requirements

* Android Studio 3.2 (installed on a Linux, Mac or Windows machine)
* Android device in developer mode with USB debugging enabled
* USB cable (to connect Android device to your computer)

## Build and run

* Step 1. Clone the Repository
```
git clone https://github.com/naman-jain-44/virtual-gym.git
```
* Step 2. Open Android Studio and from there choose 'Open an Existing Project'

* Step 3. Build the Android Studio project
```
Select Build -> Make Project and check that the project builds successfully. You will need Android SDK configured in the settings. You'll need at least SDK version 23. The build.gradle file will prompt you to download any missing libraries and also connect it with Firebase Authentication with your account.
```
* Step 4. Install and Run the app
```
Connect the Android device to the computer and be sure to approve any ADB permission prompts that appear on your phone. Select Run -> Run app. Select the deployment target in the connected devices to the device on which the app will be installed. This will install the app on the device.
```
To test the app, open the app called ```Virtual Gym``` on your device. When you run the app the first time, the app will request permission to access the camera. Re-installing the app may require you to uninstall the previous installations.


## That's it!

