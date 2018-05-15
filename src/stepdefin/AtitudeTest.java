package stepdefin;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;

public class AtitudeTest {

	@Given("^I am on e-buyer homepage$")
	public void I_am_on_homepage() throws Throwable {

		System.out.println("e-buyer homepage loaded");

	}

	@Given("^I work in ([^\"]*)$")
	public void ln(String str) {
		if (str.equals("Latenights")) {
			System.out.println("latenight automation");
		}

		if (str.equals("Mornings")) {
			System.out.println("Morning automation");
		}
	}

	@When("^I meet ([^\"]*)$")
	public void Imeet(String str) {
		if (str.equals("watchmen")) {
			System.out.println("watchmen automation");
		}
		if (str.equals("NewspaperBoy")) {
			System.out.println("NewspaperBoy automation");
		}
	}

	@Given("^we work in \"([^\"]*)\"$")
	public void we_work_in(String ss) throws Throwable {
		// Express the Regexp above with the code you wish you had
		System.out.println(ss);
	}

	@When("^we meet \"([^\"]*)\">$")
	public void we_meet_(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had

		System.out.println(arg1);

	}

	@When("^I click the ([^\"]*) button$")
	public void click_search(String click_search) {
		if (click_search.equals("search")) {
			System.out.println("search button");
		}
	}

	@Then("^I ([^\"]*) him$")
	public void gre(String str) {
		if (str.equals("Greeted")) {
			System.out.println("Greeted automation");
		}
		if (str.equals("skipGreeting")) {
			System.out.println("skipGreeting automation");
		}
	}

	@Then("^Search result should display ([^\"]*)$")
	public void search_devices(String search) {
		if (search.equals("different devices")) {
			System.out.println("search results");
		}
	}

}
