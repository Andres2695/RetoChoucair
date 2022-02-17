#language: es

  Característica: el usuario interactua con la pagina de servicios
    Antecedentes:
      Dado que el cliente se encuentra en la pagina principal
      Y cierra el pop up
      Cuando selecciona el link de servicios de la barra de navegacion
      Entonces Se muestra la informacion correspondiente a servicios

      Escenario:El usuario selecciona una de las opciones del portafolio

        Dado que el cliente selecciona pruebas moviles
        Cuando se visualiza el texto correspondiente del pruebas moviles
        Y oprime el boton saber mas
        Entonces se redirecciona a la pagina de pruebas moviles