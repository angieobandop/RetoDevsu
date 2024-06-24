const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    specPattern: 'cypress/e2e/**/*.cy.js',
    baseUrl: 'https://petstore.swagger.io/v2',
    fixturesFolder: 'cypress/fixtures',
    supportFile: 'cypress/support/e2e.js'
  },
});
