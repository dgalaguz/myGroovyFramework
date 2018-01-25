package specs

import common.BaseTestSpec
import content.CalculatorPage

class CalculatorSpec extends  BaseTestSpec{

    def "Two plus two equals four"(){
        when: "Open the calculator"
        def calcPage = page(CalculatorPage)
        at calcPage
        calcPage.clear()

        and: "Type 2 plus 2"
        calcPage.typeDigit(2)
        calcPage.typeOperation("+")
        calcPage.typeDigit(2)

        then: "Result = 4"
        calcPage.getResult() == 4
    }

    def "Two plus two equals five"(){
        when: "Open the calculator"
        def calcPage = page(CalculatorPage)
        at calcPage
        calcPage.clear()

        and: "Type 2 plus 2"
        calcPage.typeDigit(2)
        calcPage.typeOperation("+")
        calcPage.typeDigit(2)

        then: "Result = 4"
        calcPage.getResult() == 5
    }
}
