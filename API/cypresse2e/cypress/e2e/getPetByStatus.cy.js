describe('Consultar la mascota modificada por estado', () => {
  before(() => {
    cy.fixture('pet.json').then((pet) => {
      cy.request('POST', '/pet', pet).then((response) => {
        const updatedPet = {
          ...response.body,
          name: 'lola mod',
          status: 'sold'
        };

        cy.request('PUT', '/pet', updatedPet).its('body').as('updatedPet');
      });
    });
  });

  it('debería consultar la mascota modificada por estado', function () {
    cy.request('GET', `/pet/findByStatus?status=${this.updatedPet.status}`).then((response) => {
      expect(response.status).to.eq(200);
      const pets = response.body;
      const pet = pets.find(p => p.id === this.updatedPet.id);
      expect(pet).to.not.be.undefined;
      expect(pet).to.have.property('id', this.updatedPet.id);
      expect(pet).to.have.property('name', this.updatedPet.name);
      expect(pet).to.have.property('status', this.updatedPet.status);
    });
  });
});
