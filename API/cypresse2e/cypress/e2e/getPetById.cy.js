describe('Consultar la mascota ingresaada por ID', () => {
  before(() => {
    cy.fixture('pet.json').then((pet) => {
      cy.request('POST', '/pet', pet).its('body').as('pet');
    });
  });

  it('consultar la mascota ingresada por ID', function () {
    cy.request('GET', `/pet/${this.pet.id}`).then((response) => {
      expect(response.status).to.eq(200);
      expect(response.body).to.have.property('id', this.pet.id);
      expect(response.body).to.have.property('name', this.pet.name);
      expect(response.body).to.have.property('status', this.pet.status);
    });
  });
});

  