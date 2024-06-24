describe('Actualizar el nombre y el estado de la mascota', () => {
  before(() => {
    cy.fixture('pet.json').then((pet) => {
      cy.request('POST', '/pet', pet).its('body').as('pet');
    });
  });

  it('debería actualizar el nombre y el estado de la mascota', function () {
    const updatedPet = {
      ...this.pet,
      name: 'lola mod',
      status: 'sold'
    };

    cy.request('PUT', '/pet', updatedPet).then((response) => {
      expect(response.status).to.eq(200);
      expect(response.body).to.have.property('id', updatedPet.id);
      expect(response.body).to.have.property('name', updatedPet.name);
      expect(response.body).to.have.property('status', updatedPet.status);
    });
  });
});


  