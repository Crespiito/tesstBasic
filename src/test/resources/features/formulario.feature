#language: es

  Característica:yo como usuario deseo validar el correcto funcionamiento del formulario

    Escenario: Envio el formulario vacio
      Dado que el usuario ingresa a la pagina Demo Qa
      Cuando Envia el formulario vacio
      Entonces me alerta de los campos necesarios

    Escenario: Diligencio Completamente el formulario
      Dado que el usuario ingresa a la pagina Demo Qa
      Cuando Envia el formulario completamente diligenciado
      Entonces me muestra una pantalla de verificacion

