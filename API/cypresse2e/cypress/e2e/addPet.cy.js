describe('Añadir una mascota a la tienda', () => {
    it('debería añadir una mascota', () => {
      const pet = {
        id: Math.floor(Math.random() * 1000),
        name: 'lola',
        status: 'available'
      };
  
      cy.request('POST', 'https://petstore.swagger.io/v2/pet', pet).then((response) => {
        expect(response.status).to.eq(200);
        expect(response.body).to.have.property('id', pet.id);
        expect(response.body).to.have.property('name', pet.name);
        expect(response.body).to.have.property('status', pet.status);
  
        // Guardar la mascota para usarla en otras pruebas
        cy.wrap(pet).as('pet');
      });
    });
  });
  