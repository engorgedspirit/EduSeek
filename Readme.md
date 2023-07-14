# Eduseek App

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

Eduseek is a mobile application developed using Android Studio and Java. It is designed to help students find different colleges and access detailed information about them. The app utilizes Firebase Realtime Database for storing college data and implements custom authentication for user login. Passwords are securely hashed using the SCRYPT algorithm for enhanced security.

## Features

- **College Database**: The app fetches a list of colleges from the Firebase Realtime Database and displays them along with their images and rankings.

- **Search Functionality**: Students can search for specific colleges using the search feature, making it easy to find relevant results.

- **Detailed College View**: Users can select any college from the list to access a detailed view, which provides comprehensive information about the selected college.

- **Share Colleges**: The app allows users to share colleges with others through various communication apps. When shared, the college's image and details are included in the sharing content.

- **Favorites**: Users can mark colleges as favorites to create a shortlist of preferred colleges for future reference.

- **Add New Colleges**: If a college is missing from the database, users can contribute by adding it directly through the app. The "Add College" feature is accessible through a floating plus icon at the bottom of the screen.

- **Image Storage**: The app utilizes Firebase Storage to store and retrieve college images.

## Screenshots

![Screenshot 1](screenshots/screenshot1.png)
![Screenshot 2](screenshots/screenshot2.png)

## Prerequisites

- Android Studio
- Java Development Kit (JDK)
- Firebase account with Firebase Realtime Database and Storage enabled

## Installation

1. Clone the repository to your local machine using the following command:  

git clone [https://github.com/your-username/eduseek-app.git](https://github.com/your-username/eduseek-app.git)

2. Open the project in Android Studio.

3. Configure your Firebase account credentials in the app by following the Firebase setup guide.

4. Build and run the app on an Android device or emulator.

## Contributing

Contributions to the Eduseek app are welcome! If you find any bugs or have suggestions for improvements, please create an issue or submit a pull request. Make sure to follow the project's code of conduct.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
