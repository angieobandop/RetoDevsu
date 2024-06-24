Cypress API Testing Project

Este proyecto automatiza pruebas para la API de Swagger Petstore utilizando Cypress 13.12.0.

Estructura
cyprese2e/
+-- cypress/
¦   +-- e2e/
¦   ¦   +-- addPet.cy.js
¦   ¦   +-- getPetById.cy.js
¦   ¦   +-- updatePet.cy.js
¦   ¦   +-- getPetByStatus.cy.js
¦   +-- fixtures/
¦   ¦   +-- pet.json
¦   +-- support/
¦   ¦   +-- commands.js
¦   ¦   +-- e2e.js
¦   +-- cypress.config.js
+-- node_modules/
+-- package.json
+-- package-lock.json


Instalacion

1. Clona este repositorio en tu maquiina local.
2. Navega al directorio del proyecto.
3. Instala las dependencias necesarias con el siguiente comando:

   ```bash
   npm install
   ```

Ejecucion de Pruebas

Para ejecutar todas las pruebas

```bash
npm run test
```

Descripcion de las Pruebas

addPet.cy.js: Agrega una nueva mascota a la tienda.
getPetById.cy.js: Consulta la mascota ingresada por ID.
updatePet.cy.js: actualiza el nombre y el estado de la mascota a "sold"
getPetByStatus.cy.js:Consulta la mascota modificada por estado
Archivos de Fixtures:
pet.json:Contiene datos de ejemplo para crear y actualizar mascotas

Notas

- Aseg?ate de que todos los archivos de prueba esta en la carpeta `cypress/e2e` y tengan la extension `.cy.js`.
- El archivo `cypress.config.js` est?configurado para apuntar a la base URL de Swagger Petstore.

Contacto para cualquier duda o sugerencia, por favor contacta a  natalia-09@outlook.com