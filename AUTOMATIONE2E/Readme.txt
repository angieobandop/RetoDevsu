Proyecto de Pruebas Automatizadas E2E
Flujo de Compra en Demoblaze
Este proyecto implementa pruebas funcionales automatizadas para un flujo de compra en la página de Demoblaze (https://www.demoblaze.com/) 
utilizando Selenium ySerenity - patrón de diseño Screenplay. El flujo de prueba incluye agregar dos productos al carrito luego ver el carrito para completar el formulario de compra y finalizar la compra.
Requisitos
- [Java JDK 8+]
- [Gradle](8.5)
- [IntelliJ IDEA] IDE compatible con Java
Configuración
1. Clonar el repositorio:
    git clone https://github.com/tu_usuario/demoblaze-test-automation.git  
2. Configurar Serenity:
    Editar el archivo `serenity.properties` para configurar los detalles del navegador:
properties
webdriver.driver=chrome
webdriver.chrome.driver=chromedriver.exe
chrome.switches=--incognito,--enable-automation,--no-sandbox, --disable-gpu-sandbox
chrome_preferences.safebrowsing.enabled=FALSE
webdriver.timeouts.implicitlywait=10
webdriver.wait.for.timeout=5
serenity.browser.maximized=true
feature.file.encoding=UTF-8
serenity.report.encoding=UTF-8
Descripción de las Pruebas
Como usuario web quieero ingresar a demoblaze para crear el flujo de compras, para esto hice un registrar de usuarios para luego loguearme
primer paso es agregar productos al carrito de compras
ir al carrito de compras validar productos agregados, proceder a completar formulario de compra para asi finalizar la compra
mi proyecto esta definido asi:
Features: Descripcion de escenarios del flujo en lenguaje gherkin
cart.feature
register.feature
Runners: Define la suite de pruebas para el flujo de compra
Cart.Runner
Register.Runner
StepDefinitions:
CartStepDefinition	
RegisterStepDefinition

Tasks
·Login: login despues de registrarse
·Register: tarea de registro para usuario nuevo
·LoginCart: tarea de login deespues de haberse registrado
·Purchase:tarea donde completa el formulario de compra
·AddCart:Tarea donde podre agregar los dos productos al carrito

Questions:
·UserVerification: Verificacion de creacion de usuario 
·VerificationCart: Verificacion de productos agregados al carro
·VerificationPurchase: Verfificacion de compra 
interactions:
·EnterPress: Funcionalidad automatizada de la tecla enter 
Models:
·Data: clase modelo para datos parametrizados

 UI
·Cart: Clase pageObject para el mapeo de targets flujo compra de productos
·Home: Clase pageObject para el mapeo de targets home
 Ejecutar las pruebas:
procede a ejecutar los runners:
Cart.Runner
Register.Runner





Contacto para cualquier duda o sugerencia, por favor contacta a  natalia-09@outlook.com