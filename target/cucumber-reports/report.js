$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/loginUser.feature");
formatter.feature({
  "name": "Como automatizador quiero hacer login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "hacer login como usuario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@web"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "ingresas \u003cemail\u003e y \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "seleccionar el elemento del menu \u003cmain\u003e",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "main"
      ]
    },
    {
      "cells": [
        "operez6921@gmail.com",
        "123456",
        "Ayuda"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user clicks on the alert delivery button",
  "keyword": "Given "
});
formatter.match({
  "location": "loginUserlDefinition.clickAlert()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@id\u003d\u0027hs-eu-confirmation-button\u0027] (tried for 20 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat pageObject.basePage.Find(basePage.java:48)\n\tat pageObject.basePage.clickElement(basePage.java:53)\n\tat pageObject.loginUserPO.clickButtonAlertDeliviry(loginUserPO.java:18)\n\tat definition.loginUserlDefinition.clickAlert(loginUserlDefinition.java:13)\n\tat ✽.the user clicks on the alert delivery button(src/test/resources/features/loginUser.feature:3)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027hs-eu-confirmation-button\u0027]\"}\n  (Session info: chrome\u003d126.0.6478.62)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro-de-omar.local\u0027, ip: \u0027fe80:0:0:0:1414:5482:952e:32a4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_292\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 126.0.6478.62, chrome: {chromedriverVersion: 126.0.6478.61 (8dc092df54ce..., userDataDir: /var/folders/0q/34zpcfp92yl...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54360}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 797580fed4d15eeacc4c3ba405394689\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027hs-eu-confirmation-button\u0027]}\n\tat sun.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:182)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:179)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat pageObject.basePage.Find(basePage.java:48)\n\tat pageObject.basePage.clickElement(basePage.java:53)\n\tat pageObject.loginUserPO.clickButtonAlertDeliviry(loginUserPO.java:18)\n\tat definition.loginUserlDefinition.clickAlert(loginUserlDefinition.java:13)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:31)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:25)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:118)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:56)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:127)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "hacer login como usuario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@web"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "ingresas operez6921@gmail.com y 123456",
  "keyword": "Given "
});
formatter.match({
  "location": "loginUserlDefinition.formFieldLogin(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "seleccionar el elemento del menu Ayuda",
  "keyword": "When "
});
formatter.match({
  "location": "loginUserlDefinition.selectElementMain(String)"
});
formatter.result({
  "status": "skipped"
});
});