Feature: open page without certificate

  @open
  Scenario Outline: open page without certificate
    Given login to the page <page> <browser>
    Then visualize the page

    Examples: 
      | page  							 																						|  browser  |
      | "https://testsrv.credibanco.com/PaGoManager/public/index.xhtml" |	"Chrome"  |
      | "https://testsrv.credibanco.com/PaGoManager/public/index.xhtml" |	"Firefox" |
      | "https://testsrv.credibanco.com/PaGoManager/public/index.xhtml" |	"Edge"    |