@web
Feature: como automatizador quiero hacer flujos de login
  Background:
    Given que el usuario está en la página web CO

  @loginExitoso
  Scenario Outline: hacer login exitoso
    Given el usuario ingresa su nombre de usuario <email> y su contraseña <password>
    When hace clic en el botón de iniciar sesión
    Then el sistema debería redirigir al usuario a la página principal

    Examples:
      | email | password |  |
      | Admin | admin123 |  |

  @loginFallido
  Scenario Outline: hacer login fallido
    Given el usuario ingresa su nombre de usuario <email> y su contraseña <password>
    When hace clic en el botón de iniciar sesión
    Then  el sistema debería mostrar un mensaje de error

    Examples:
      | email  | password |  |
      | Admin22 | admin123 |  |

  @loginExitosoSinCredencial
  Scenario: hacer login exitoso sin enviar credenciales
    Given el usuario ingresa su nombre de usuario y su contraseña
    When hace clic en el botón de iniciar sesión
    Then el sistema debería redirigir al usuario a la página principal
