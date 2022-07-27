Feature: Registro exitoso
  Yo como usuario de demo qa
  necesito registrar la información en el formulairo pratice forms
  para visualizar el mensaje de registro exitoso

 Scenario Outline: Registro de información
   Given "juan" desea ir a la pagina de "https://demoqa.com/"
   When ingrese la informacion de registro
   Then valida que el sistema mueste el siguiente <texto>

   Examples:
   |texto|
   |prueba     |