Feature: Buscador

Scenario: Search existent product

Given the user is in the index page6
When the user select search bar
When the user write existent product
And the user search product
Then Product appear

Scenario: Search inexistent product

Given the user is in the index page6
When the user select search bar
When the user write non existent product
And the user search product
Then Product dont appear

Scenario: Search existent product with a filter

Given the user is in the index page6
When the user select search bar
When the user write existent product
When the user click the filter
When the user select the filter
And the user search product
Then Product appear2

Scenario: Search inexistent product with a filter

Given the user is in the index page6
When the user select search bar
When the user write non existent product
When the user click the filter
When the user select the filter
And the user search product
Then Product dont appear2



