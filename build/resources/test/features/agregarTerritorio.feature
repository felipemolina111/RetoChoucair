Feature: Realizar Login

  @agregarTerritorioTest
  Scenario: Login exitoso
    Given el usuario se encuentra en la pagina de inicio
    When el usuario ingrese el usuario, contraseña y de click en el botón ingresar
    And el usuario ingresa a la opcion de territorio
    And el usuario agrega un nuevo territorio
    And el usuario ingresa en el buscador el nuevo territorio
    Then el usuario valida que se halla agregado el territorio