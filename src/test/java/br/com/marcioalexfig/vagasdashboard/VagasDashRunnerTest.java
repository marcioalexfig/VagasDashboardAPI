package br.com.marcioalexfig.vagasdashboard;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/features"}
		)
public class VagasDashRunnerTest {

}