# BackEndSpringRestCRUD

- Proyecto JAVA con uso de Spring Framework y base de datos h2. El frontEnd esta disponible en: https://github.com/lmarcela/FrontEndAngularRestCRUD

- Proyecto basado en https://www.youtube.com/watch?v=ioYJx-rNNoI&index=1&list=PLF0fAweo0Kogzy5I6LxEaIlJAxVORXZm-

## Funcionamiento de los metodos del controlador 

### METODO GETUSERS
Código:

	@GetMapping("/")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
Prueba del funcionamiento con Postman:	

![getUsers()](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/1.png)



### METODO GETUSER
Código:

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
Prueba del funcionamiento con Postman:	

![getUser(@PathVariable Long id)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/2.png)


### METODO DELETEUSER
Código:

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		userRepository.delete(id);
		return true;
	}
	
Prueba del funcionamiento con Postman:	

![getUser(@PathVariable Long id)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/3.png)

### METODO CREATEUSER
Código:

	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
Prueba del funcionamiento con Postman:	

![createUser(@RequestBody User user)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/4.png)

### METODO UPDATEUSER
Código:

	@PutMapping("/user")
	public User updateUser(@RequestBody User user){
		return userRepository.save(user);
	}
	
Prueba del funcionamiento con Postman:	

![updateUser(@RequestBody User user)](https://github.com/lmarcela/BackEndSpringRestCRUD/blob/master/src/main/resources/static/5.png)



## Readme original del Git
	…or create a new repository on the command line
	
	echo "# BackEndSpringRestCRUD" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git remote add origin https://github.com/lmarcela/BackEndSpringRestCRUD.git
	git push -u origin master
	…or push an existing repository from the command line
	
	git remote add origin https://github.com/lmarcela/BackEndSpringRestCRUD.git
	git push -u origin master
	…or import code from another repository
	You can initialize this repository with code from a Subversion, Mercurial, or TFS project.


CREAR PROYECTO ANGULAR (RESTCLIENT): ng new FrontEndAngularRestCRUD (Creado dentro de la carpeta \src\main\resources\static).
ABRIR PROYECTO EN VSCODE DESDE CONSOLA: code . (Dentro de la carpeta src\main\resources\\static\FrontEndAngularRestCRUD).
BOOTSTRAP: npm install bootstrap@next --save (Dentro de la carpeta src\main\resources\\static\FrontEndAngularRestCRUD).

ANGULAR:
- CREAR CLASE: ng g class user
- CREAR COMPONENTE SIN ARCHIVOS CSS Y SPEC: ng g c components/listuser --spec false -is
- CREAR SERVICIO SIN SPEC: ng g s services/user --spec false

