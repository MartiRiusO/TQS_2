Feature: Tienda

Scenario: Show list

Given the user is in the index page
When the user select tienda
And the user select ofertas from categorias
Then the offer list appears

Scenario: Show list with list view

Given the user is in the index page
When the user select tienda
And the user select ofertas from categorias
And the user select list view
Then the offer list appears as list view

Scenario: Show sublists

Given the user is in the index page
When the user select tienda
When the user select billar from categorias
When the user select accesorios para mesas from billar
And the user select lamparas from the accesorios para mesas
Then the lamparas list appears