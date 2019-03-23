$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Excelfile.feature");
formatter.feature({
  "line": 1,
  "name": "Excel",
  "description": "",
  "id": "excel",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "validate the excel sheet datadriven",
  "description": "",
  "id": "excel;validate-the-excel-sheet-datadriven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "launch the site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "homepage should be displayed with login fields",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter the userid and password fields",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on bramnches button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on newBranch button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter all the data with excel \"\u003crowindex\u003e\" dataset",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "handel the branch creation popUp",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "excel;validate-the-excel-sheet-datadriven;",
  "rows": [
    {
      "cells": [
        "rowindex"
      ],
      "line": 14,
      "id": "excel;validate-the-excel-sheet-datadriven;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 15,
      "id": "excel;validate-the-excel-sheet-datadriven;;2"
    },
    {
      "cells": [
        "2"
      ],
      "line": 16,
      "id": "excel;validate-the-excel-sheet-datadriven;;3"
    },
    {
      "cells": [
        "3"
      ],
      "line": 17,
      "id": "excel;validate-the-excel-sheet-datadriven;;4"
    },
    {
      "cells": [
        "4"
      ],
      "line": 18,
      "id": "excel;validate-the-excel-sheet-datadriven;;5"
    }
  ],
  "keyword": "Examples"
});
