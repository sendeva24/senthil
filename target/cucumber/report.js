$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "Search for vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search veggies",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@searchTest"
    }
  ]
});
formatter.step({
  "name": "user logins to the green page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.user_logins_to_the_green_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for \"Cucumber\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.search_for_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"Cucumber\" will be retrieved",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.results_for_something_will_be_retrieved(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search veggies",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@searchTest"
    }
  ]
});
formatter.step({
  "name": "user logins to the green page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.user_logins_to_the_green_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d83.0.4103.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-14H19A0\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00EC9563+2725219]\n\tOrdinal0 [0x00DC8551+1672529]\n\tOrdinal0 [0x00CB0359+525145]\n\tOrdinal0 [0x00CA8579+492921]\n\tOrdinal0 [0x00CA818C+491916]\n\tOrdinal0 [0x00CA7AB8+490168]\n\tOrdinal0 [0x00CA6EFE+487166]\n\tOrdinal0 [0x00CA7135+487733]\n\tOrdinal0 [0x00CA6B75+486261]\n\tOrdinal0 [0x00CAF055+520277]\n\tOrdinal0 [0x00CA6B32+486194]\n\tOrdinal0 [0x00CA7739+489273]\n\tOrdinal0 [0x00CA6EFE+487166]\n\tOrdinal0 [0x00CA7135+487733]\n\tOrdinal0 [0x00CA6B75+486261]\n\tOrdinal0 [0x00CAD83E+514110]\n\tOrdinal0 [0x00CA6B32+486194]\n\tOrdinal0 [0x00CA7739+489273]\n\tOrdinal0 [0x00CA6EFE+487166]\n\tOrdinal0 [0x00CA7135+487733]\n\tOrdinal0 [0x00CA6B75+486261]\n\tOrdinal0 [0x00CABBF6+506870]\n\tOrdinal0 [0x00CA6B32+486194]\n\tOrdinal0 [0x00CA7739+489273]\n\tOrdinal0 [0x00CA6EFE+487166]\n\tOrdinal0 [0x00CA7135+487733]\n\tOrdinal0 [0x00CA6B75+486261]\n\tOrdinal0 [0x00CAB1B7+504247]\n\tOrdinal0 [0x00CA6B32+486194]\n\tOrdinal0 [0x00CA7739+489273]\n\tOrdinal0 [0x00CA6EFE+487166]\n\tOrdinal0 [0x00CA7135+487733]\n\tOrdinal0 [0x00CA6B75+486261]\n\tOrdinal0 [0x00CA337C+471932]\n\tOrdinal0 [0x00CA6B32+486194]\n\tOrdinal0 [0x00CA6A87+486023]\n\tOrdinal0 [0x00CB0FF0+528368]\n\tOrdinal0 [0x00C5D6C9+186057]\n\tOrdinal0 [0x00C5CA3D+182845]\n\tOrdinal0 [0x00C5A94B+174411]\n\tOrdinal0 [0x00C42528+75048]\n\tOrdinal0 [0x00C435A0+79264]\n\tOrdinal0 [0x00C43539+79161]\n\tOrdinal0 [0x00DDD607+1758727]\n\tGetHandleVerifier [0x00FE6546+1050150]\n\tGetHandleVerifier [0x00FE6291+1049457]\n\tGetHandleVerifier [0x00FF10D7+1094071]\n\tGetHandleVerifier [0x00FE6B46+1051686]\n\tOrdinal0 [0x00DD5B06+1727238]\n\tOrdinal0 [0x00DDEB7B+1764219]\n\tOrdinal0 [0x00DDECE3+1764579]\n\tOrdinal0 [0x00DF4C05+1854469]\n\tBaseThreadInitThunk [0x752F6359+25]\n\tRtlGetAppContainerNamedObjectPath [0x77A47C24+228]\n\tRtlGetAppContainerNamedObjectPath [0x77A47BF4+180]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat loanapplication.javaproject.Base.newmethod(Base.java:24)\r\n\tat stepDefinations.vegetablesearch.user_logins_to_the_green_page(vegetablesearch.java:29)\r\n\tat ✽.user logins to the green page(file:///C:/Users/sende/javaproject/src/test/java/features/search.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "search for \"Brinjal\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.search_for_something(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "results for \"Brinjal\" will be retrieved",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.results_for_something_will_be_retrieved(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "items added to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.items_added_to_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user navigated to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.user_navigated_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"Brinjal\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.vegetablesearch.something_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: unable to send message to renderer\n  (Session info: chrome\u003d83.0.4103.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-14H19A0\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\sende\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57616}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 6c52470bb3574555c1bd6fd6bade2399\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat loanapplication.javaproject.Base.newmethod(Base.java:27)\r\n\tat stepDefinations.Hooks.supemethod(Hooks.java:21)\r\n",
  "status": "failed"
});
});