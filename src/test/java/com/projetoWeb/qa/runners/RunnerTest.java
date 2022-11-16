package com.projetoWeb.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
    features = "src/test/resources/features",
    glue = "com.projetoWeb.qa.steps",
    tags = "",
    plugin = {"json:target/reports/CucumberReports.json",
            "pretty"},
    snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}
