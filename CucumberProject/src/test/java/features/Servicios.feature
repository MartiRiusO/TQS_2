Feature: Servicios

Scenario: Show mantenimiento y reparaciones de mesas de billar

Given the user is in the index page2
When the user select servicios
And the user select mantenimiento y reparaciones de mesas de billar
Then mantenimiento y reparaciones de mesas de billar info appears

Scenario: Show reparaciones de tacos y flechas de billar

Given the user is in the index page2
When the user select servicios
And the user select reparaciones de tacos y flechas de billar
Then reparaciones de tacos y flechas de billar info appears
