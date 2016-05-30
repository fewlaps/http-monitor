# HTTP monitor

Check that an URL is up and it returns a response that starts with an String with this simple solution. Just clone this project and run it with Gradle. The syntax is simple: ``gradlew run -Pwith=url,startsWith``. If the check is not successful, the application launches an Exception.

We suggest to run it on Jenkins. Simply create a Job for every URL you want to monitor, and report the failing builds at your Slack. Or, if you have a better idea, don't hesitate to open an issue and share it :·)

## An example
``gradlew run -Pwith=http://api.citybik.es/v2/networks,{``
