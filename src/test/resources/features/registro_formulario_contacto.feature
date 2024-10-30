#language: es

Característica: Registro formulario de contacto

  Antecedentes:
    Dado que el usuario se encuentre en la pagina web
    Cuando seleccione Log In e ingrese el user con la clave

  Escenario: Registro formulario de contacto exitoso
    Dado que el usuario seleccione el menu Contacts
    Cuando ingrese la informacion solicitada
    Entonces el usuario visualizara un mensaje de envio exitoso