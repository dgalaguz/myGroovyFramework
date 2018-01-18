package specs

import common.BaseTestSpec
import content.GoogleSearchPage

class GoogleSearchSpec extends BaseTestSpec{
    def "Google Search"()
    {
        when: "Open Google Search page"
        def googlePage = page(GoogleSearchPage)
        to googlePage

        and: "Search"
        googlePage.search(query)

        then: "Verify the search results"
        googlePage.resultsAreDisplayed()
        1!=1

        where:
        query    | _
        "42"     | _
    }
}
