#language: es

Característica: el usuario interactua con la pagina de formacion
  Antecedentes:
    Dado que el cliente se encuentra en la pagina principal
    Y cierra el pop up
    Cuando selecciona el link de formacion de la barra de navegacion
    Entonces Se muestra la informacion correspondiente a formacion

    Escenario: el usuario realiza click en el portafolio y en las pregutnas
      Cuando el usuario da click en preguntas
      Y da click en portafolio
        Entonces se visualiza la apgina de portafolio