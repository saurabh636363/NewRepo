Feature:

Scenario Outline: :ABC
  Given I am reading a name and age
      |swaraj|10|
      |saurabh|40|
  Given I am "<NameOfperson>"
  Examples:
  				|NamesOfPerson|
  				|swaraj|
  				|saurabh|
  				|deadpool|
  				 
      
