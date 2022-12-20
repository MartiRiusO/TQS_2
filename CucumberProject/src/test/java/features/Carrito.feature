Feature: Carrito

Scenario: Show carrito empty

Given the user is in the index page1
When the user select carrito
And the user select ver carrito
Then carrito appears empty

Scenario: Show carrito with a billar

Given the user is in the billar page
When the user select añadir al carrito
When the user select carrito
And the user select ver carrito
Then carrito appears with the billar

Scenario: Delete billar from carrito

Given the user is in the billar page
When the user select añadir al carrito
When the user select carrito
When the user select ver carrito
When carrito appears with the billar
And the user select delete billar
Then carrito appears empty

Scenario: Volver a la tienda

Given the user is in the index page1
When the user select carrito
When the user select ver carrito
And the user select volver a la tienda
Then vuelve a la tienda

Scenario: Seguir comprando

Given the user is in the billar page
When the user select añadir al carrito
When the user select carrito
When the user select ver carrito
And the user select seguir comprando
Then vuelve a la tienda



