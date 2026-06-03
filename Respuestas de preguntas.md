1. ¿Qué problema soluciona el patrón DTO?
El patrón DTO sirve para transportar datos entre las diferentes capas de una aplicación sin exponer toda la información de una entidad. Ayuda a enviar solo los datos que realmente se necesitan.

2. ¿Por qué no es recomendable retornar entidades directamente?
Porque las entidades pueden contener información sensible o datos que no son necesarios para el usuario. Además, puede generar problemas de seguridad y rendimiento.

3. ¿Qué diferencias existen entre una Entity y un DTO?
La Entity representa una tabla de la base de datos y se utiliza para guardar o consultar información. El DTO se usa para transferir datos entre capas o hacia el cliente, mostrando solo la información necesaria.

4. ¿Cómo se relaciona el DTO con el patrón MVC?
En MVC, el DTO ayuda a comunicar la información entre el controlador y la vista. El controlador puede recibir o enviar DTOs para que la vista trabaje solo con los datos necesarios.

5. ¿Qué ventajas aporta el DTO en APIs REST?
Permite enviar respuestas más organizadas, mejora la seguridad al ocultar datos innecesarios, reduce la cantidad de información enviada y facilita el mantenimiento de la API.

