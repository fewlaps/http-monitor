# HTTP monitor

Check that an URL is up and it returns a response that starts with an String with this simple solution. Just clone this project and run it with Gradle. The syntax is simple: ``gradlew run -Pwith=url,startsWith``. If the check is not successful, the application launches an Exception.

We suggest to run it on Jenkins. Simply create a Job for every URL you want to monitor, and report the failing builds at your Slack. Or, if you have a better idea, don't hesitate to open an issue and share it :·)

## How to run it?
``gradlew run -Pwith=http://api.citybik.es/v2/networks,{``

or if you prefer to run on Docker

``docker run fewlaps/http-monitor run -Pwith=http://api.citybik.es/v2/networks,{``

## LICENSE ##

The MIT License (MIT)

Copyright (c) 2016 Fewlaps

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
