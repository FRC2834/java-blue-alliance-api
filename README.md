java-blue-alliance-api
======================

A Java API to access FIRST FRC information from the thebluealliance.com API. Written simply and fully documented.

#Version Information
For simplicity, the API major version (ex. the first number of the version) will always correspond with the API version from the Blue Alliance.
The branches will also represent the *Blue Alliance* API version, so branch v1 represents version one of the Blue Alliance API
This branch is **v1** of the BlueAlliance API

#Changelog

* Version 1.0.2
    * Added X-TBA-App-Id which is now required on the v1 API

* Version 1.0.1
    * Renamed package to org.frc2834.bluealliance.v1 for better convention and so v1 and v2 of the API can be used at once

* Version 1.0.0
    * Initial Release

#Credits

* The Blue Alliance for the creation of this API, we only created that Java wrapper for it. Thank you!

#Dependencies

* GSON from Google, v 2.2.4 was used for this project, but any new version should work. https://code.google.com/p/google-gson/