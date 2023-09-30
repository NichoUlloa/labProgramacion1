Clase Celular en Java

Este proyecto contiene una clase Java llamada `Celular` que modela un dispositivo de teléfono celular. 
La clase Celular tiene atributos para representar las características del teléfono y métodos para realizar 
acciones típicas de un celular.

Características

La clase Celular tiene las siguientes características:

- marca (pública): La marca del celular.
- color (pública): El color del celular.
- modelo (privada): El modelo del celular.
- sistemaOperativo (privada): El sistema operativo del celular.
- numeroCelular (protegida): El número de celular.
- numeroSerie (protegida): El número de serie del celular.
- numeroIMEI (por defecto/default): El número IMEI del celular.

Funcionalidades

La clase Celular implementa las siguientes funcionalidades:

- llamar(): Método público para realizar una llamada telefónica.
- enviarMensaje(): Método público para enviar un mensaje de texto.
- tomarFoto(): Método privado para tomar una foto.
- apagar(): Método protegido para apagar el celular.