describe('Login admin', () => {
  it('Test para ver si funciona el login con usuario admin', () => {
    cy.visit('http://localhost:8081/');
    cy.get('.alert:nth-child(1)').click();
    cy.get('#account-menu > span > span').click();
    cy.get('#login > span').click();
    cy.get('[data-cy=username]').type('admin');
    cy.get('[data-cy=password]').type('admin');
    cy.get('[data-cy=submit]').click();
    cy.get('.form').submit();
  });
});
