#language: es

  Característica: llenar y enviar el formulario de contactenos

    Antecedentes:
      Dado que el cliente se encuentra en la pagina principal
      Y cierra el pop up
      Cuando selecciona el link de contactenos de la barra de navegacion
      Entonces Se muestra la informacion correspondiente a contactenos

      Escenario: El usuario llena el formulario y envia el formulario
        Cuando El usuario llena el formulario
        Entonces envia el formulario