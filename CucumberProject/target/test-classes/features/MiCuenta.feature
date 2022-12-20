Feature: MiCuenta

Scenario: Show Mi Cuenta information

Given the user is in the index page5
And the user select mi cuenta
Then mi cuenta info appears

Scenario: Forgot password

Given the user is in the index page5
When the user select mi cuenta
And the user select olvidaste la contraseña
Then recuperacion info appears

