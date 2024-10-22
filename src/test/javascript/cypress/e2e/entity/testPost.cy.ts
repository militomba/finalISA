describe('Login admin', () => {
  it('Test para ver si funciona el login con usuario admin', () => {
    cy.visit('http://localhost:8081/');
    cy.get('#account-menu > span > span').click();
    cy.get('#login > span').click();
    cy.get('[data-cy=username]').type('admin');
    cy.get('[data-cy=password]').type('admin');
    cy.get('[data-cy=submit]').click();
    cy.get('.form').submit();
    cy.get('#entity-menu > span > span').click();
    //cy.get('.active > span').click();
    cy.get('li.show li:nth-of-type(2) span').click();
    cy.get("[data-cy='entityCreateButton']").click();
    cy.get('[data-cy=title]').click();
    //cy.get('[data-cy=title]').type('{backspace}');
    //cy.get('[data-cy=title]').type('{backspace}');
    cy.get('[data-cy=title]').type('Inteligencia artificial');
    cy.get('[data-cy=content]').click();
    cy.get('[data-cy=content]').type('Inteligencia artificial');
    cy.get('.fa-floppy-disk > path').click();
  });
});
